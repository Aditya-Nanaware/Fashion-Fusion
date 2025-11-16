package com.male_fashion.Home_page;

import javafx.animation.FadeTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.util.Duration;

public class OrderSummaryPage {

    private Scene scene;
    private Stage stage;
    //@SuppressWarnings("unused")
    private Scene previouScene;

    private static final int SCENE_WIDTH = 1008;
    private static final int SCENE_HEIGHT = 600;

   


    public OrderSummaryPage(Stage stage, Scene previouScene){
        this.stage = stage;
        this.previouScene = previouScene;
        initView(previouScene);
    }
   
    public void initView(Scene previousScene) {
        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);

        // Set background image
        Image bgImage = new Image("/images/clothes_background.jpeg");
        BackgroundImage bg = new BackgroundImage(bgImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        layout.setBackground(new Background(bg));

        Label welcomeLabel = new Label("Order Summary");
        welcomeLabel.setFont(Font.font("Georgia", FontWeight.BOLD, 36));
        welcomeLabel.setTextFill(Color.WHITE);
        welcomeLabel.setEffect(new DropShadow(5, Color.BLACK));
        welcomeLabel.setPadding(new Insets(20));
        welcomeLabel.setStyle("-fx-background-color: rgba(0,0,0,0.5); -fx-background-radius: 15; -fx-border-radius: 15;");


        Label clothingLabel = new Label("Selected Clothing : " + App.getSelectedClothing());
        Label clothingPriceLabel = new Label("Price: " + App.getClothingPrice());
        clothingLabel.setFont(Font.font("Georgia", FontWeight.BOLD, 15));
        clothingLabel.setTextFill(Color.WHITE);
        clothingLabel.setPadding(new Insets(20));
        clothingLabel.setStyle("-fx-background-color:black; -fx-background-radius: 10;");
        clothingPriceLabel.setFont(Font.font("Georgia", FontWeight.BOLD, 25));


        Label fabricLabel = new Label("Selected Fabric : " + App.getSelectedFabric());
        Label fabricPriceLabel = new Label("Price: " + App.getFabricPrice());
        fabricLabel.setFont(Font.font("Georgia", FontWeight.BOLD, 15));
        fabricLabel.setTextFill(Color.WHITE);
        fabricLabel.setPadding(new Insets(20));
        fabricLabel.setStyle("-fx-background-color:black; -fx-background-radius: 10;");
        fabricPriceLabel.setFont(Font.font("Georgia", FontWeight.BOLD, 25));


        Label colorLabel = new Label("Selected Color : " + App.getSelectedColor());
        Label colorPriceLabel = new Label("Price: " + App.getColorPrice());
        colorLabel.setFont(Font.font("Georgia", FontWeight.BOLD, 15));
        colorLabel.setTextFill(Color.WHITE);
        colorLabel.setPadding(new Insets(20));
        colorLabel.setStyle("-fx-background-color:black; -fx-background-radius: 10;");
        colorPriceLabel.setFont(Font.font("Georgia", FontWeight.BOLD, 25));


        Label totalPriceLabel = new Label("Total Price: " + App.getTotalPrice());
        totalPriceLabel.setFont(Font.font("Georgia", FontWeight.BOLD, 15));
        totalPriceLabel.setTextFill(Color.WHITE);
        totalPriceLabel.setPadding(new Insets(20));
        totalPriceLabel.setStyle("-fx-background-color:black; -fx-background-radius: 10;");


        Button backButton = new Button("Back");
        backButton.setOnAction(event -> stage.setScene(previouScene));
        styleButton(backButton);
        Button editOrderButton = new Button("Edit Order");
        Button confirmPurchaseButton = new Button("Confirm Purchase");
        Button cancelOrderButton = new Button("Cancel Order");

        //editOrderButton.setOnAction(e -> primaryStage.setScene(previousScene));
        confirmPurchaseButton.setOnAction(e -> showPopup("Order Confirmed!"));
        cancelOrderButton.setOnAction(e -> showPopup("Order Cancelled!"));

        HBox buttonBox = new HBox(20,editOrderButton,confirmPurchaseButton,cancelOrderButton,backButton);

        
        
        layout.getChildren().addAll(
            welcomeLabel,
            clothingLabel, clothingPriceLabel,
            fabricLabel, fabricPriceLabel,
            colorLabel, colorPriceLabel,
            totalPriceLabel, buttonBox
        );

        scene = new Scene(layout, SCENE_WIDTH, SCENE_HEIGHT);
        
    }
    private void showPopup(String message) {
        Popup popup = new Popup();
        Label label = new Label(message);
        label.setStyle("-fx-background-color: white; -fx-padding: 10px; -fx-border-color: black;");
        popup.getContent().add(label);
        label.setFont(Font.font("Georgia", FontWeight.BOLD, 40));
        label.setTextFill(Color.WHITE);
        label.setPadding(new Insets(20));
        label.setStyle("-fx-background-color:blue; -fx-background-radius: 10;");
        

        FadeTransition fadeIn = new FadeTransition(Duration.seconds(0.5), label);
        fadeIn.setFromValue(0.0);
        fadeIn.setToValue(1.0);

        FadeTransition fadeOut = new FadeTransition(Duration.seconds(0.5), label);
        fadeOut.setFromValue(1.0);
        fadeOut.setToValue(0.0);
        fadeOut.setDelay(Duration.seconds(2));
        fadeOut.setOnFinished(e -> popup.hide());

        fadeIn.play();
        fadeOut.play();

        popup.show(stage);
    }
    private void styleButton(Button button) {
        button.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        button.setStyle("-fx-background-color: #FF5733; -fx-text-fill: white; -fx-padding: 10 20 10 20;");
        button.setEffect(new DropShadow(2, Color.GRAY));
        
        button.setOnMouseEntered(event -> button.setStyle("-fx-background-color: #C70039; -fx-text-fill: white; -fx-padding: 10 20 10 20;"));
        button.setOnMouseExited(event -> button.setStyle("-fx-background-color: #FF5733; -fx-text-fill: white; -fx-padding: 10 20 10 20;"));
    }

    public Scene getScene() {
        return scene;
    }


}


