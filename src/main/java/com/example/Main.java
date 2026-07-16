package com.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Main {

    public static void main(String[] args) throws Exception {

        Server server = new Server(8080);

        ServletContextHandler context =
                new ServletContextHandler(ServletContextHandler.SESSIONS);

        context.setContextPath("/");

        context.addServlet(HelloServlet.class, "/");

        server.setHandler(context);

        server.start();

        System.out.println("Server running at http://localhost:8080");

        server.join();
    }
}