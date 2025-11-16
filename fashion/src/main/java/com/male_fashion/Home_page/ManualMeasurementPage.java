package com.male_fashion.Home_page;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ManualMeasurementPage {
    private Scene scene;
    private Stage stage;
    private Scene previousScene;

    private static final int SCENE_WIDTH = 1008;
    private static final int SCENE_HEIGHT = 600;


    public ManualMeasurementPage(Stage stage, Scene previousScene) {
        this.stage = stage;
        this.previousScene = previousScene;
        initView(previousScene);
    }

    public void initView(Scene previouScene){
        VBox root = new VBox(20);
        root.setPadding(new Insets(20));
        root.setStyle("-fx-background-color: #F0F8FF;");

        Label title = new Label("Manual Measurement Input");
        title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-font-weight: bold; -fx-text-fill: #333");

    
        Label sizeChartLabel = new Label("Size Chart:");
        sizeChartLabel.setStyle("-fx-font-size: 18px; -fx-text-fill: #666");

        Label heightLabel = new Label("Height (cm):");
        Label chestLabel = new Label("Chest (cm):");
        Label waistLabel = new Label("Waist (cm):");
        Label hipLabel = new Label("Hip (cm):");

        
        TextField heightField = new TextField();
        TextField chestField = new TextField();
        TextField waistField = new TextField();
        TextField hipField = new TextField();

        
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> handleSubmit(heightField.getText(), chestField.getText(), waistField.getText(), hipField.getText()));

        Button backButton = new Button("Back");
        backButton.setStyle("-fx-background-color: #9E9E9E; -fx-text-fill: white; -fx-padding: 10px 20px; -fx-font-size: 14px;");
        backButton.setOnAction(e -> stage.setScene(previousScene));

        
        
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        
        gridPane.add(heightLabel, 0, 0);
        gridPane.add(heightField, 1, 0);
        gridPane.add(chestLabel, 0, 1);
        gridPane.add(chestField, 1, 1);
        gridPane.add(waistLabel, 0, 2);
        gridPane.add(waistField, 1, 2);
        gridPane.add(hipLabel, 0, 3);
        gridPane.add(hipField, 1, 3);
        gridPane.add(submitButton, 1, 4);
        gridPane.add(backButton, 0, 4);


       
        root.getChildren().addAll(title, gridPane, backButton);

        scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
    }
    private void handleSubmit(String height, String chest, String waist, String hip) {
        
        System.out.println("Height: " + height);
        System.out.println("Chest: " + chest);
        System.out.println("Waist: " + waist);
        System.out.println("Hip: " + hip);

    
    }
    public Scene getScene() {
        return scene;
    }
}

