package com.male_fashion.Home_page;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

//import com.male_fashion.Home_page.controllers.FemaleSectionController;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FemaleSectionPage {
    private Scene scene;
    private Stage stage;
    private Homepage homepage;
    private CasualWearFemalePage casualWearFemalePage;
   // private FormalWearFemalePage formalWearFemalePage;
    private EthnicWearFemalePage ethnicWearFemalePage;

    private static final int SCENE_WIDTH = 1008;
    private static final int SCENE_HEIGHT = 600;

    public FemaleSectionPage(Stage stage,Homepage homepage){
        this.stage = stage;
        this.homepage = homepage;
        this.casualWearFemalePage = new CasualWearFemalePage(stage, this);
        //this.formalWearFemalePage = new FormalWearFemalePage();
        this.ethnicWearFemalePage = new EthnicWearFemalePage(stage, this);
        initView();
    }
    

    private void initView(){
        //Title
        Label label = new Label("Female Section");
        label.setFont(Font.font("Georgia", FontWeight.BOLD, 36));
        label.setTextFill(Color.DARKSLATEGRAY);
        label.setPadding(new Insets(20));
        label.setStyle("-fx-background-color: rgba(255,255,255,0.7); -fx-background-radius: 10;");
        
        //VBOX used for name of category and image
        VBox casualWearSection = createCategorySection("Casual","/images/casual_wear_women.jpg",casualWearFemalePage.getScene());
        VBox formalWearSection = createCategorySection("Formal","/images/formal_wear_women.jpg",casualWearFemalePage.getScene());
        VBox ethnicWearSection = createCategorySection("Ethnic","/images/ethnic_wear_women.jpg",ethnicWearFemalePage.getScene());

        Button backButton = new Button("Back");
        backButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                stage.setScene(homepage.getScene());
            }
            
        });
        styleButton(backButton);
        
        
        HBox layout = new HBox(20,casualWearSection,formalWearSection,ethnicWearSection);;
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(20));

        VBox view = new VBox(20,label,layout,backButton);
        view.setAlignment(Pos.CENTER);
        view.setPadding(new Insets(40));
        
        /*
        casualWearButton.setStyle("-fx-background-color: #007BFF; -fx-text-fill: white; -fx-padding: 10 20 10 20;");
        formalWearButton.setStyle("-fx-background-color: #007BFF; -fx-text-fill: white; -fx-padding: 10 20 10 20;");
        ethnicWearButton.setStyle("-fx-background-color: #007BFF; -fx-text-fill: white; -fx-padding: 10 20 10 20;");

        casualWearButton.setOnMouseEntered(e -> casualWearButton.setStyle("-fx-background-color: #0056b3; -fx-text-fill: white; -fx-padding: 10 20 10 20;"));
        casualWearButton.setOnMouseExited(e -> casualWearButton.setStyle("-fx-background-color: #007BFF; -fx-text-fill: white; -fx-padding: 10 20 10 20;"));

        formalWearButton.setOnMouseEntered(e -> formalWearButton.setStyle("-fx-background-color: #0056b3; -fx-text-fill: white; -fx-padding: 10 20 10 20;"));
        formalWearButton.setOnMouseExited(e -> formalWearButton.setStyle("-fx-background-color: #007BFF; -fx-text-fill: white; -fx-padding: 10 20 10 20;"));

        ethnicWearButton.setOnMouseEntered(e -> ethnicWearButton.setStyle("-fx-background-color: #0056b3; -fx-text-fill: white; -fx-padding: 10 20 10 20;"));
        ethnicWearButton.setOnMouseExited(e -> ethnicWearButton.setStyle("-fx-background-color: #007BFF; -fx-text-fill: white; -fx-padding: 10 20 10 20;"));

        backButton.setOnMouseEntered(e -> backButton.setStyle("-fx-background-color: #C70039; -fx-text-fill: white; -fx-padding: 10 20 10 20;"));
        backButton.setOnMouseExited(e -> backButton.setStyle("-fx-background-color: #FF5733; -fx-text-fill: white; -fx-padding: 10 20 10 20;"));
        */

        Image backgroundImage = new Image(getClass().getResourceAsStream("/images/1000_F_671509713_h0abOwrUCBpJTdiYofw9JhllrI0qZuoN.jpg"));
        BackgroundImage bgImage = new BackgroundImage(
                backgroundImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false));
        view.setBackground(new Background(bgImage));


        scene = new Scene(view,SCENE_WIDTH,SCENE_HEIGHT);

    }
    //Method to create a categrory section with an image and label
    private VBox createCategorySection(String categoryName, String imagePath, Scene Scene) {
        Label label = new Label(categoryName);
        label.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        label.setTextFill(Color.WHITE);
        label.setStyle("-fx-background-color: rgba(0,0,0,0.7); -fx-background-radius: 10;-fx-padding: 10;");

        ImageView imageView = new ImageView();
        try {
            Image image = new Image(getClass().getResourceAsStream(imagePath));
            imageView.setImage(image);
            imageView.setFitWidth(200);
            imageView.setFitHeight(200);
            imageView.setPreserveRatio(true);
            imageView.setSmooth(true);
        } catch (Exception e) {
            System.out.println("Could not found image: " + imagePath);
            e.printStackTrace();
        }

        Button exploreButton = new Button("Explore "+ categoryName);
        styleButton(exploreButton);
        exploreButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                stage.setScene(Scene);
            }
        });
         
        
        
        VBox section = new VBox(10,label,imageView,exploreButton);
        section.setAlignment(Pos.CENTER);
        section.setPadding(new Insets(10));
        section.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        section.setEffect(new DropShadow(5, Color.GREENYELLOW));
        return section;
    }
    
    private void styleButton(Button button) {
        button.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        button.setStyle("-fx-background-color: #FF5733; -fx-text-fill: white; -fx-padding: 10 20 10 20;");
        button.setEffect(new DropShadow(2, Color.GRAY));

        button.setOnMouseEntered(event -> button.setStyle("-fx-background-color: #0056b3; -fx-text-fill: white; -fx-padding: 10 20 10 20;"));
        button.setOnMouseExited(event -> button.setStyle("-fx-background-color: #007BFF; -fx-text-fill: white; -fx-padding: 10 20 10 20;"));

    }
    //#C70039
    //#FF5733
    


    public Scene getScene(){
        return scene;
    }
    


}
