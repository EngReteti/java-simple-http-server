# java-simple-http-server

A modular HTTP server built from scratch using Java. This project demonstrates raw socket programming, HTTP protocol handling, and clean software architecture.

## 🚀 Features
* **Modular Architecture**: Logic is separated into Parser, Builder, and Server components.
* **Static File Serving**: Serves HTML files (Index, About) from the `public/` directory.
* **Error Handling**: Custom 404 "Not Found" logic for invalid routes.
* **Zero Frameworks**: Built using only the Java Standard Library (`java.net`, `java.io`, `java.nio`).

## 🏗️ Architecture (Stage 5 Refactor)
* **HttpServer**: Manages the server lifecycle and client connections.
* **RequestParser**: Extracts methods and paths from raw HTTP request strings.
* **ResponseBuilder**: Constructs standards-compliant HTTP responses.

## 📈 Current Progress
- [x] Project Setup & Git Initialization
- [x] Basic ServerSocket Listening
- [x] HTTP Request Line Parsing
- [x] Basic HTTP Response Handling
- [x] Serving Static HTML Files
- [x] Refactored Modular Architecture (Stage 5)

## 💻 How To Run
1. **Compile all files**:
   ```bash
   javac src/server/*.java
   ```
2. **Run the server**:
   ```bash
   java -cp src server.HttpServer
   ```
3. **Visit**: `http://localhost:8080`
