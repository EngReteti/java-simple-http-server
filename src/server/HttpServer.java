package server;

import java.io.*;
import java.net.*;
import java.nio.file.*;

public class HttpServer {
    public static void main(String[] args) {
        int port = 8080;
        
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started on port " + port);
            
            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    BufferedReader reader = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream())
                    );
                    
                    String line = reader.readLine();
                    if (line == null) continue;
                    
                    System.out.println("Request: " + line);
                    
                    // Split "GET /about HTTP/1.1" to get "/about"
                    String[] parts = line.split(" ");
                    String path = parts[1];
                    
                    // Default to index.html if path is "/"
                    if (path.equals("/")) {
                        path = "/index.html";
                    }
                    
                    // Look for the file in the public folder
                    Path filePath = Paths.get("public" + path);
                    String content;
                    String status;
                    
                    if (Files.exists(filePath) && !Files.isDirectory(filePath)) {
                        content = Files.readString(filePath);
                        status = "HTTP/1.1 200 OK";
                    } else {
                        // Serve 404 page if file doesn't exist
                        content = Files.readString(Paths.get("public/404.html"));
                        status = "HTTP/1.1 404 Not Found";
                    }
                    
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
                    out.println(status);
                    out.println("Content-Type: text/html");
                    out.println("Content-Length: " + content.length());
                    out.println(""); 
                    out.print(content);
                    out.flush();
                    
                } catch (IOException e) {
                    System.err.println("Connection error: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }
}
