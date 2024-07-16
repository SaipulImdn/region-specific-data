package com.example;

public class IpRegionMapper {
    public static String getRegion(String ip) {
        // Dummy implementation for demonstration purposes
        if (ip.startsWith("192.")) {
            return "Asia";
        } else if (ip.startsWith("193.")) {
            return "Europe";
        } else if (ip.startsWith("194.")) {
            return "America";
        } else {
            return "Unknown";
        }
    }
}
