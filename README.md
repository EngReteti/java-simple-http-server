# My Java Web Server 🚀

A simple server that serves a website directly from Java code.

## How to Run
1. Start the server: `java -cp src server.HttpServer`
2. Open your browser and type: **localhost:8080**

## What to Test
- **Home**: Type `localhost:8080`
- **Styling**: Type `localhost:8080/css/style.css`
- **Error Page**: Type `localhost:8080/anything`

## What is happening?
When you visit the links above, look at your **Termux screen**. You will see a log like:
`LOG: GET / HTTP/1.1`
This proves the server is talking to your browser!
