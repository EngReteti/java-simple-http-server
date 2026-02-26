package server;

public class ResponseBuilder {
    public static String buildResponse(String status, String content) {
        return status + "\r\n" +
               "Content-Type: text/html\r\n" +
               "Content-Length: " + content.length() + "\r\n" +
               "\r\n" +
               content;
    }
}
