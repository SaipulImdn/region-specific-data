package com.example;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(5000), 0);
        server.createContext("/region", new RegionController());
        server.setExecutor(null); // creates a default executor
        server.start();
        System.out.println("Server started on port 5000");
    }
}
