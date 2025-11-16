package com.male_fashion.Home_page;

public class Measurement {
    private String height;
    private String chest;
    private String waist;
    private String hip;
    // Add other measurement fields as needed

    public Measurement(String height, String chest, String waist, String hip) {
        this.height = height;
        this.chest = chest;
        this.waist = waist;
        this.hip = hip;
        // Initialize other fields
    }

    // Getter methods
    public String getHeight() {
        return height;
    }

    public String getChest() {
        return chest;
    }

    public String getWaist() {
        return waist;
    }

    public String getHip() {
        return hip;
    }

    // Add other getter methods as needed
}

