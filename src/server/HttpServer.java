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
                    // Stage 2: Read the HTTP Request
                    BufferedReader reader = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream())
                    );
                    
                    String line = reader.readLine();
                    if (line != null) {
                        System.out.println("Request: " + line);
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
