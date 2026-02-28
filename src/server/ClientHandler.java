package server;

import java.io.*;
import java.net.*;
import java.nio.file.*;

public class ClientHandler implements Runnable {
    private Socket clientSocket;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream())) {
            
            String requestLine = reader.readLine();
            
            // This line makes the README realistic!
            if (requestLine != null) {
                System.out.println("Request: " + requestLine);
                
                String path = RequestParser.getPath(requestLine);
                Path filePath = Paths.get("public" + path);
                
                String content;
                String status;
                String contentType;

                if (Files.exists(filePath) && !Files.isDirectory(filePath)) {
                    content = Files.readString(filePath);
                    status = "HTTP/1.1 200 OK";
                    contentType = ResponseBuilder.getContentType(filePath);
                } else {
                    content = Files.readString(Paths.get("public/404.html"));
                    status = "HTTP/1.1 404 Not Found";
                    contentType = "text/html";
                }

                out.print(ResponseBuilder.buildResponse(status, contentType, content));
                out.flush();
            }
        } catch (IOException e) {
            System.err.println("Handler error: " + e.getMessage());
        }
    }
}
