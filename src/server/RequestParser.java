package server;

public class RequestParser {
    public static String getPath(String requestLine) {
        if (requestLine == null || requestLine.isEmpty()) return "/index.html";
        String[] parts = requestLine.split(" ");
        String path = (parts.length > 1) ? parts[1] : "/index.html";
        return path.equals("/") ? "/index.html" : path;
    }
}
