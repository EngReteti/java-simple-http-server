# ⚡ JavaCore HTTP Engine

A modular, multi-threaded HTTP server built from scratch.

## 🛠️ How to make the links work
1. **Start the Engine**: Run `java -cp src server.HttpServer` in Termux.
2. **Keep Termux Open**: The server must be active to respond to your browser.
3. **Click & Watch**: When you click a link below, look back at Termux to see the live **HTTP/1.1** logs!

## 🔗 Test Links (Local Only)
* 🏠 [Home Page](http://localhost:8080) - Loads index.html with CSS.
* 🎨 [CSS Style](http://localhost:8080/css/style.css) - Tests MIME-type delivery.
* ⚠️ [Trigger 404](http://localhost:8080/missing) - Tests your custom error page.

## 📂 Architecture
* **Multi-threaded**: Each request runs on a new thread.
* **Modular Parser**: Cleanly extracts the path from the HTTP request.
* **Custom UI**: Glassmorphism design served directly from Java.
