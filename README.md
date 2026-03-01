# ⚡ JavaCore HTTP Engine

### 1️⃣ Project Overview
A simple web server built from scratch using Java Sockets. It handles requests, serves files, and logs activity in real-time.

### 2️⃣ Features
- **Multi-threaded**: Handles many visitors at once.
- **Styling**: Serves CSS to make the website look professional.
- **Error Handling**: Shows a custom 404 page if a file is missing.

### 3️⃣ How It Works
- **HttpServer**: Listens for connections on port 8080.
- **ClientHandler**: Processes each request on a new thread.
- **ResponseBuilder**: Creates the correct HTTP headers.

### 4️⃣ Example HTTP Flow (Live Logs)
When you visit the site, your terminal will show:
```text
HTTP: GET / index.html HTTP/1.1
```

### 5️⃣ How To Run
1. **Compile**: `javac src/server/*.java`
2. **Start**: `java -cp src server.HttpServer`
3. **Visit**: Open your browser and type **localhost:8080**

### 🔗 Test Links (Local)
- [Home Page](http://localhost:8080)
- [Check CSS](http://localhost:8080/css/style.css)
- [Test 404 Error](http://localhost:8080/any-fake-page)
