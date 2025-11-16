package com.male_fashion.Home_page;

import javafx.animation.FadeTransition;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.util.Duration;

public class OrderSummaryPage1 {

    private Stage stage;
    private Scene scene;

    private Selection selectedCloth;
    private Selection selectedFabric;
    private Selection selectedColor;
    private Selection selectedDesigner;
    @SuppressWarnings("unused")
    private Scene previouScene;

    /*
    public OrderSummaryPage1(Stage primaryStage, Scene previousScene,
                            Selection selectedCloth, Selection selectedFabric,
                            Selection selectedColor, Selection selectedDesigner) {
        this.primaryStage = primaryStage;
        this.previousScene = previousScene;
        this.selectedCloth = selectedCloth;
        this.selectedFabric = selectedFabric;
        this.selectedColor = selectedColor;
        this.selectedDesigner = selectedDesigner;
    }
     */
    public OrderSummaryPage1(Stage stage, Scene previouScene){
        this.stage = stage;
        this.previouScene = previouScene;
        initView(previouScene);
    }
   



    public void initView(Scene previouScene) {
        VBox layout = new VBox(20);
        layout.setPadding(new Insets(20));

        VBox clothBox = createSelectionBox(selectedCloth);
        VBox fabricBox = createSelectionBox(selectedFabric);
        VBox colorBox = createSelectionBox(selectedColor);
        VBox designerBox = createSelectionBox(selectedDesigner);

        HBox imagesBox = new HBox(20, clothBox, fabricBox, colorBox, designerBox);

        double totalPrice = selectedCloth.getPrice() + selectedFabric.getPrice() + selectedColor.getPrice();
        Label totalLabel = new Label("Total Price: $" + totalPrice);

        Button editOrderButton = new Button("Edit Order");
        Button confirmPurchaseButton = new Button("Confirm Purchase");
        Button cancelOrderButton = new Button("Cancel Order");

       // editOrderButton.setOnAction(e -> stage.setScene(previousScene));
        confirmPurchaseButton.setOnAction(e -> showPopup("Order Confirmed!"));
        cancelOrderButton.setOnAction(e -> showPopup("Order Cancelled!"));

        HBox buttonsBox = new HBox(20, editOrderButton, confirmPurchaseButton, cancelOrderButton);

        layout.getChildren().addAll(imagesBox, totalLabel, buttonsBox);

        scene = new Scene(layout, 1008, 600);
        //stage.setScene(orderSummaryScene);
    }

    private VBox createSelectionBox(Selection selection) {
        VBox box = new VBox(10);
        if (selection != null) {
            box.getChildren().addAll(selection.getImageView(), new Label(selection.getLabel()), new Label("Price: $" + selection.getPrice()));
        }
        return box;
    }

    private void showPopup(String message) {
        Popup popup = new Popup();
        Label label = new Label(message);
        label.setStyle("-fx-background-color: white; -fx-padding: 10px; -fx-border-color: black;");
        popup.getContent().add(label);

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
    public Scene getScene() {
        return scene;
    }
}

