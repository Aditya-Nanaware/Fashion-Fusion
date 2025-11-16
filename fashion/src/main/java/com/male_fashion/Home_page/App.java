package com.male_fashion.Home_page;

import javafx.application.Application;
//import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    private static String selectedClothing;
    private static double clothingPrice;
    private static String selectedFabric;
    private static double fabricPrice;
    private static String selectedColor;
    private static double colorPrice;
    private static String selectedDesigner;

    @Override
    public void start(Stage primaryStage) {
        Homepage homePage = new Homepage(primaryStage);
        primaryStage.setTitle("Fashion Fusion");
        primaryStage.setScene(homePage.getScene());
        primaryStage.show();

    }

    public static void setSelectedClothing(String clothing, double price) {
        selectedClothing = clothing;
        clothingPrice = price;
    }

    public static void setSelectedDesigner(String designer) {
        selectedDesigner = designer;

    }

    public static void setSelectedFabric(String label, double price) {
        selectedFabric = label;
        fabricPrice = price;
    }

    public static void setSelectedColor(String color, double price) {
        selectedColor = color;
        colorPrice = price;
    }

    public static String getSelectedClothing() {
        return selectedClothing;
    }

    public static String getSelectedDesigner() {
        return selectedDesigner;
    }

    public static double getClothingPrice() {
        return clothingPrice;
    }

    public static String getSelectedFabric() {
        return selectedFabric;
    }

    public static double getFabricPrice() {
        return fabricPrice;
    }

    public static String getSelectedColor() {
        return selectedColor;
    }

    public static double getColorPrice() {
        return colorPrice;
    }

    public static double getTotalPrice() {
        return clothingPrice + fabricPrice + colorPrice;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(args);
    }

}