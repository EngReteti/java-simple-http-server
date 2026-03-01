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

### 4️⃣ How To Run
1. **Compile**: `javac src/server/*.java`
2. **Start**: `java -cp src server.HttpServer`
3. **Open Browser**: Type the addresses below manually.

### 📍 Manual Browser Links
Copy and paste these into your browser address bar:
- **Home Page**: `localhost:8080`
- **Check CSS**: `localhost:8080/css/style.css`
- **Test 404 Error**: `localhost:8080/any-fake-page`

### 🖥️ Terminal Output
When you visit the site, your Termux will show:
`HTTP: GET / HTTP/1.1`
