# ⚡ JavaCore HTTP Engine

A simple, multi-threaded HTTP server built from scratch using Java Sockets.

## 🚀 How to Run (Required for Links to Work)
To make the test links below work, you must first start the engine in your terminal:
1. **Compile**: `javac src/server/*.java`
2. **Start**: `java -cp src server.HttpServer`
3. **Keep Terminal Open**: The server must stay running to handle requests.

## 🔗 Live Test Links
*Once the server is started, click these to test:*
* **🏠 Home Page**: [http://localhost:8080](http://localhost:8080) (Styled Content)
* **🎨 CSS Asset**: [http://localhost:8080/css/style.css](http://localhost:8080/css/style.css) (MIME Testing)
* **⚠️ Trigger 404**: [http://localhost:8080/any-fake-page](http://localhost:8080/any-fake-page) (Error Handling)

## 🛠️ Features
* **Multi-threaded**: Uses a Thread-per-Request model for concurrent handling.
* **MIME Detection**: Automatically identifies and serves HTML and CSS correctly.
* **Live Logging**: See incoming `GET` requests in your terminal in real-time.

## 📂 Architecture
* **HttpServer**: The main entry point and socket listener.
* **ClientHandler**: The worker thread that processes requests.
* **ResponseBuilder**: Constructs the HTTP/1.1 headers and body.
