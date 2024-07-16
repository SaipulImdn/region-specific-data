package com.example;

public class RegionService {
    public static String getDataForRegion(String region) {
        switch (region) {
            case "Asia":
                return "Data for Asia";
            case "Europe":
                return "Data for Europe";
            case "America":
                return "Data for America";
            default:
                return "Data not available for your region";
        }
    }
}
