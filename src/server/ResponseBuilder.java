package server;

import java.nio.file.Path;

public class ResponseBuilder {
    public static String getContentType(Path path) {
        String name = path.getFileName().toString();
        if (name.endsWith(".html")) return "text/html";
        if (name.endsWith(".css")) return "text/css";
        if (name.endsWith(".js")) return "application/javascript";
        if (name.endsWith(".png")) return "image/png";
        return "text/plain";
    }

    public static String buildResponse(String status, String contentType, String content) {
        return status + "\r\n" +
               "Content-Type: " + contentType + "\r\n" +
               "Content-Length: " + content.length() + "\r\n" +
               "Connection: close\r\n" +
               "\r\n" +
               content;
    }
}
