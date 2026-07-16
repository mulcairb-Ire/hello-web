package com.example;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");

        response.getWriter().println("""
            <!DOCTYPE html>
            <html>
            <head>
                <title>GitHub Actions Demo</title>
            </head>
            <body>
                <h1>Hello from Java!</h1>
                <p>If you can see this page, the application is running.</p>
            </body>
            </html>
        """);
    }
}