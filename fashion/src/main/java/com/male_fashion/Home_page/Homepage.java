package com.male_fashion.Home_page;

import com.male_fashion.Home_page.controllers.HomePageController;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

public class Homepage {
    private VBox view;
    private HomePageController controller;
    private Stage stage;
    private Scene scene;

    private static final int SCENE_WIDTH = 1008;
    private static final int SCENE_HEIGHT = 600;


    public Homepage(Stage stage){
        this.stage = stage;
        controller = new HomePageController(this);
        initView();
    }

    public void initView(){

        Label welcomeLabel = new Label("Welcome to Fashion Fusion");
        welcomeLabel.setFont(Font.font("Georgia", FontWeight.BOLD, 36));
        welcomeLabel.setTextFill(Color.WHITE);
        welcomeLabel.setEffect(new DropShadow(5, Color.BLACK));
        welcomeLabel.setPadding(new Insets(20));
        welcomeLabel.setStyle("-fx-background-color: rgba(0,0,0,0.5); -fx-background-radius: 15; -fx-border-radius: 15;");

        Label subtitLabel = new Label("Your one-stop solution for Costom-Designing clothing");
        subtitLabel.setFont(Font.font("Arial",FontWeight.NORMAL, 20));
        subtitLabel.setTextFill(Color.LIGHTGRAY);
        subtitLabel.setEffect(new DropShadow(5, Color.BLACK));
        subtitLabel.setPadding(new Insets(10));
        subtitLabel.setStyle("-fx-background-color: rgba(0,0,0,0.4); -fx-background-radius: 10; -fx-border-radius: 10;");

        VBox maleSection = createGenderSection("Male","/images/male_avatar.jpg");
        VBox femaleSection = createGenderSection("Female","/images/female_avatar1.jpg");

        Button Aboutus = new Button("AboutUs");
        Button AboutUs=new Button("Select");
        AboutUs.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                
                AboutUs.setOnAction(e -> stage.setScene(new About(stage, scene).getScene()) );

              

            }
            
        }); 

        Aboutus.setOnAction(e -> stage.setScene(new About(stage, scene).getScene()) );

        VBox aboutBox = new VBox(Aboutus);
        aboutBox.setAlignment(Pos.TOP_RIGHT);
        

        HBox sections = new HBox(50,maleSection,femaleSection);
        sections.setAlignment(Pos.CENTER);

        view = new VBox(30,aboutBox,welcomeLabel,subtitLabel,sections);
        view.setAlignment(Pos.CENTER);
        view.setPadding(new Insets(40));
        
        
        try{
            Image backgroundImage = new Image(getClass().getResourceAsStream("/images/clothes_background.jpeg"));
            BackgroundImage bgImage = new BackgroundImage(
                backgroundImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false
                ));
                view.setBackground(new Background(bgImage));
        }catch(Exception e){
            System.out.println("Could not load background image");
            e.printStackTrace();
        }
        scene = new Scene(view, SCENE_WIDTH, SCENE_HEIGHT);
    }
    private VBox createGenderSection(String gender,String imagePath){
        Label label = new Label(gender);
        label.setFont(Font.font("Georgia", FontWeight.BOLD, 24));
        label.setTextFill(Color.DARKSLATEGRAY);
        label.setPadding(new Insets(10));
        label.setStyle("-fx-background-color: rgba(255,255,255,0.7); -fx-background-radius: 10;");

        ImageView imageView = new ImageView();
        try{
            Image image = new Image(getClass().getResourceAsStream(imagePath));
            imageView.setImage(image);
            imageView.setFitWidth(200);
            imageView.setFitHeight(200);
            imageView.setPreserveRatio(true);
            imageView.setSmooth(true);
        }catch(Exception e){
            System.out.println("Could not load image: " + imagePath);
            e.printStackTrace();
        }
       // imageView.setFitWidth(200);
        //imageView.setFitHeight(200);
        

        Button button = createStyledButton("Explore " + gender + " Section");
        button.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                controller.handleGenderSelection(gender);
            }
            
        });

        VBox section = new VBox(10,label,imageView,button);
        section.setAlignment(Pos.CENTER);
        section.setPadding(new Insets(10));
        section.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        section.setEffect(new DropShadow(5, Color.GREENYELLOW));

        return section;
    }

    private Button createStyledButton(String text){
        Button button = new Button(text);
        button.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        button.setStyle("-fx-background-color: #007BFF; -fx-text-fill: white; -fx-padding: 10 20 10 20;");
        button.setEffect(new DropShadow(2, Color.AQUA));
        button.setOnMouseEntered(e -> button.setStyle("-fx-background-color: #0056b3; -fx-text-fill: white; -fx-padding: 10 20 10 20;"));
        button.setOnMouseExited(e -> button.setStyle("-fx-background-color: #007BFF; -fx-text-fill: white; -fx-padding: 10 20 10 20;"));
        return button;
    }
    
    public Scene getScene(){
        return scene;
    }
    public VBox getView(){
        return view;
    }

    public Stage getStage(){
        return stage;
    }

   /* private VBox createMaleSection(){
        Label maleLabel = new Label("Male");
        maleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        maleLabel.setTextFill(Color.DARKSLATEGRAY);

        Button casualWearButton = new Button("Casual Wear");
        casualWearButton.setOnAction(event -> controller.handleCategorySelection("Male","Casual Wear"));

        Button ethnicWearButton = new Button("Ethnic Wear");
        ethnicWearButton.setOnAction(event -> controller.handleCategorySelection("Male","Ethnic Wear"));

        Button formalWearButton = new Button("Formal Wear");
        formalWearButton.setOnAction(event -> controller.handleCategorySelection("Male","Formal Wear"));

        VBox maleSection = new VBox(10,maleLabel,casualWearButton,ethnicWearButton,formalWearButton);
        maleSection.setAlignment(Pos.CENTER);
        maleSection.setPadding(new Insets(10));
        maleSection.setBackground(new Background(new BackgroundFill(Color.AQUA,new CornerRadii(10),Insets.EMPTY)));

        return maleSection;
    }

    private VBox createFemaleSection(){
        Label maleLabel = new Label("Female");
        maleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        maleLabel.setTextFill(Color.DARKSLATEGRAY);

        Button casualWearButton = new Button("Casual Wear");
        casualWearButton.setOnAction(event -> controller.handleCategorySelection("Female","Casual Wear"));

        Button ethnicWearButton = new Button("Ethnic Wear");
        ethnicWearButton.setOnAction(event -> controller.handleCategorySelection("Female","Ethnic Wear"));

        Button formalWearButton = new Button("Formal Wear");
        formalWearButton.setOnAction(event -> controller.handleCategorySelection("female","Formal Wear"));

        VBox femaleSection = new VBox(10,maleLabel,casualWearButton,ethnicWearButton,formalWearButton);
        femaleSection.setAlignment(Pos.CENTER);
        femaleSection.setPadding(new Insets(10));
        femaleSection.setBackground(new Background(new BackgroundFill(Color.AQUA,new CornerRadii(10),Insets.EMPTY)));

        return femaleSection;
    }
    */
    


    
}
