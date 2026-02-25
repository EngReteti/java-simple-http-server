# java-simple-http-server

A simple HTTP server built from scratch using Java sockets. It handles HTTP GET requests and serves static HTML files without using any frameworks.

## 🚀 Features
* **Socket Communication**: Uses raw `ServerSocket` to handle traffic.
* **Request Parsing**: Extracts methods and paths from raw HTTP strings.
* **Static File Serving**: Delivers HTML content from a local directory.
* **Zero Dependencies**: Pure Java Standard Library.

## 🛠️ How It Works
* **ServerSocket**: Opens a port to listen for incoming TCP connections.
* **Request Parsing**: Interprets the browser's HTTP request line.
* **File Handling**: Reads physical files from the `public/` folder.

## 📈 Current Progress
- [x] Project Setup & Git Initialization
- [x] Basic ServerSocket Listening
- [x] HTTP Request Line Parsing
- [x] Basic HTTP Response Handling
- [x] **Serving Static HTML Files (Current Stage)**

## 💻 How To Run
1. **Compile**: `javac src/server/HttpServer.java`
2. **Run**: `java -cp src server.HttpServer`
3. **Visit**: `http://localhost:8080`
