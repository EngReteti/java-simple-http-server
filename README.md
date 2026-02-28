# ⚡ JavaCore HTTP Engine

### 1️⃣ Project Overview
A lightweight, high-performance HTTP server built from scratch using raw Java Sockets. This project demonstrates the fundamentals of web architecture without relying on external frameworks.

### 2️⃣ Features
* **Handles GET requests**: Parses incoming HTTP requests to identify desired resources.
* **Serves Static Files**: Delivers HTML and CSS content dynamically from the `public/` directory.
* **404 Error Handling**: Returns a custom error page for missing resources.
* **Multi-threaded**: Processes concurrent client connections using a Thread-per-Request model.

### 3️⃣ How It Works
* **ServerSocket**: Listens on port 8080 and accepts incoming client connections.
* **Request Parsing**: Extracts the HTTP method and file path from the raw request line.
* **Response Formatting**: Constructs a valid HTTP/1.1 response with status codes and MIME types.

### 4️⃣ Example HTTP Flow
**Client Request:**
```text
GET /index.html HTTP/1.1
Host: localhost:8080
```

**Server Response:**
```text
HTTP/1.1 200 OK
Content-Type: text/html
Content-Length: 124

<html>...</html>
```

### 5️⃣ How To Run
1. **Compile the source**:
   `javac src/server/*.java`
2. **Start the engine**:
   `java -cp src server.HttpServer`
3. **Visit in browser**:
   Navigate to `http://localhost:8080`
