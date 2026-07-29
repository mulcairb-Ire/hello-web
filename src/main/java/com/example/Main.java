package com.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Main {

    public static void main(String[] args) throws Exception {

        //Server server = new Server(8080);
    	
    	int port = Integer.parseInt(
    		    System.getenv().getOrDefault("PORT", "5000"));

		System.out.println("PORT env = " + System.getenv("PORT"));
		System.out.println("Using port = " + port);

    	Server server = new Server(port);

        ServletContextHandler context =
                new ServletContextHandler(ServletContextHandler.SESSIONS);

        context.setContextPath("/");

        context.addServlet(HelloServlet.class, "/");

        server.setHandler(context);

        server.start();

        System.out.println("Server running at port:"  + port);

        server.join();
    }
}