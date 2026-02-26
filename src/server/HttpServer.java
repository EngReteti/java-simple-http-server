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
                    BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    String requestLine = reader.readLine();
                    
                    if (requestLine != null) {
                        System.out.println("Request: " + requestLine);
                        String path = RequestParser.getPath(requestLine);
                        
                        Path filePath = Paths.get("public" + path);
                        String content;
                        String status;

                        if (Files.exists(filePath) && !Files.isDirectory(filePath)) {
                            content = Files.readString(filePath);
                            status = "HTTP/1.1 200 OK";
                        } else {
                            content = Files.readString(Paths.get("public/404.html"));
                            status = "HTTP/1.1 404 Not Found";
                        }

                        PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
                        out.print(ResponseBuilder.buildResponse(status, content));
                        out.flush();
                    }
                } catch (IOException e) {
                    System.err.println("Client error: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }
}
