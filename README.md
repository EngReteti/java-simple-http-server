# ⚡ JavaCore HTTP Engine

A simple, multi-threaded HTTP server built from scratch using Java Sockets.

## 🚀 Features
* **Multi-threaded**: Handles multiple browser requests at once.
* **Styling**: Delivers professional CSS styling alongside HTML content.
* **MIME Detection**: Automatically identifies file types (HTML, CSS).

## 🛠️ How to Run
1. **Compile**: `javac src/server/*.java`
2. **Start**: `java -cp src server.HttpServer`
3. **Visit**: Open `http://localhost:8080` in your browser.

## 🔗 Live Test Links
* **Home Page**: [http://localhost:8080](http://localhost:8080) (Styled Content)
* **CSS File**: [http://localhost:8080/css/style.css](http://localhost:8080/css/style.css) (Direct Asset)
* **Trigger 404**: [http://localhost:8080/error](http://localhost:8080/error) (Test Error Handling)

## 📂 Architecture
* **HttpServer**: Listens for connections.
* **ClientHandler**: The multi-threaded worker.
* **ResponseBuilder**: Constructs valid HTTP/1.1 headers.
