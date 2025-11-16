package com.male_fashion.Home_page;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MeasurementOptionPage {


    
    private Scene scene;
    private Stage stage;
    @SuppressWarnings("unused")
    private Scene previouScene;
   
    static AnchorPane apane;

    private static final int SCENE_WIDTH = 1008;
    private static final int SCENE_HEIGHT = 600;


    public MeasurementOptionPage(Stage stage, Scene previouScene){
        this.stage = stage;
        this.previouScene = previouScene;
        initView(previouScene);
    }
   
    public void initView(Scene previouScene){
        StackPane root = new StackPane();

        //Background Image
        Image ig1=new Image("/images/clothes_background.jpeg");
        ImageView background=new ImageView(ig1);
        background.setFitWidth(1008);
        background.setFitHeight(600);
        background.setPreserveRatio(false);

        VBox content = new VBox(30);
        content.setPadding(new Insets(50));
        //content.setStyle("-fx-background-color: #F0F8FF;");

        Label title = new Label("Select Measurement Option");
        title.setFont(Font.font("Georgia", FontWeight.BOLD, 28));
        title.setTextFill(Color.WHITE);
        title.setEffect(new DropShadow(5, Color.BLACK));
        title.setPadding(new Insets(20));
        title.setStyle("-fx-background-color: rgba(0,0,0,0.5); -fx-background-radius: 15; -fx-border-radius: 15;");

        Button manualInputButton = new Button("Manual Input");
        manualInputButton.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        manualInputButton.setStyle("-fx-background-color: #007BFF; -fx-text-fill: white; -fx-padding: 10 20 10 20;");
        manualInputButton.setEffect(new DropShadow(2, Color.AQUA));
        manualInputButton.setOnMouseEntered(e -> manualInputButton.setStyle("-fx-background-color: #0056b3; -fx-text-fill: white; -fx-padding: 10 20 10 20;"));
        manualInputButton.setOnMouseExited(e -> manualInputButton.setStyle("-fx-background-color: #007BFF; -fx-text-fill: white; -fx-padding: 10 20 10 20;"));
        manualInputButton.setOnAction(e -> stage.setScene(new ManualMeasurementPage(stage, stage.getScene()).getScene()));

        Button homeVisitButton = new Button("Home Visit");
        homeVisitButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-padding: 10px 20px; -fx-font-size: 14px;");
        homeVisitButton.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        homeVisitButton.setStyle("-fx-background-color: #007BFF; -fx-text-fill: white; -fx-padding: 10 20 10 20;");
        homeVisitButton.setEffect(new DropShadow(2, Color.AQUA));
        homeVisitButton.setOnMouseEntered(e -> homeVisitButton.setStyle("-fx-background-color: #0056b3; -fx-text-fill: white; -fx-padding: 10 20 10 20;"));
        homeVisitButton.setOnMouseExited(e -> homeVisitButton.setStyle("-fx-background-color: #007BFF; -fx-text-fill: white; -fx-padding: 10 20 10 20;"));
        homeVisitButton.setOnAction(e -> stage.setScene(new DesignerSelectionPage(stage, stage.getScene()).getScene()));



        Button backButton = new Button("Back");
        backButton.setOnAction(event -> stage.setScene(previouScene));
        styleButton(backButton);


        content.getChildren().addAll(title,manualInputButton, homeVisitButton,backButton);
        content.setAlignment(Pos.CENTER);
        root.getChildren().addAll(background,content);

        
        scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
        //return new Scene(root, 1008, 600);
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
