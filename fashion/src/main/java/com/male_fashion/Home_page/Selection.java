package com.male_fashion.Home_page;

import javafx.scene.image.ImageView;

public class Selection {
    private ImageView imagevView;
    private String label;
    private double price;

    public Selection(ImageView imagevView, String label, double price) {
        this.imagevView = imagevView;
        this.label = label;
        this.price = price;
    }

    public ImageView getImageView() {
        return imagevView;
    }

    public String getLabel() {
        return label;
    }

    public double getPrice() {
        return price;
    }


    
}
