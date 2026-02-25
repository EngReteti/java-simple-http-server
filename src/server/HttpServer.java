package server;

import java.io.*;
import java.net.*;

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
                    if (line != null) {
                        System.out.println("Request: " + line);
                        
                        // STAGE 3: Send Manual HTTP Response
                        PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
                        
                        // HTTP Headers
                        out.println("HTTP/1.1 200 OK");
                        out.println("Content-Type: text/html");
                        out.println(""); // Important: Blank line between headers and body
                        
                        // HTTP Body
                        out.println("<h1>Hello from Java Server</h1>");
                        out.flush();
                    }
                } catch (IOException e) {
                    System.err.println("Connection error: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }
}
