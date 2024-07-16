package com.example;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class RegionController implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        // Get the IP address of the client
        String ip = exchange.getRemoteAddress().getAddress().getHostAddress();
        System.out.println("Received request from IP: " + ip); // Log the IP address

        // Map the IP to a region
        String region = IpRegionMapper.getRegion(ip);
        String response = RegionService.getDataForRegion(region);

        // Send the response
        exchange.sendResponseHeaders(200, response.getBytes().length);
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
