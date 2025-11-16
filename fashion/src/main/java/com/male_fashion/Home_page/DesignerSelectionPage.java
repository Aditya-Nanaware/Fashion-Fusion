package com.male_fashion.Home_page;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DesignerSelectionPage {
    private Scene scene;
    private Stage stage;
    private Scene previousScene;

    @SuppressWarnings("unused")
    private Selection selectedCloth;
    @SuppressWarnings("unused")
    private Selection selectedFabric;
    @SuppressWarnings("unused")
    private Selection selectedColor;
    

    @SuppressWarnings("unused")
    private Selection selectedDesigner;

    private static final int SCENE_WIDTH = 1008;
    private static final int SCENE_HEIGHT = 600;


    public DesignerSelectionPage(Stage stage, Scene previousScene) {
        this.stage = stage;
        this.previousScene = previousScene;
        initView(previousScene);
    }

    public void initView(Scene previouScene) {
        VBox root = new VBox(50);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        root.setStyle("-fx-background-color: #F0F8FF;");

        Label title = new Label("Select Designer");
        title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-text-fill: #333;");

        ImageView Manish_Malhotra = createImageView("/Designer/ManishMalhotra.jpg");
        ImageView Payal_Singhal = createImageView("/Designer/PayalSinghal.jpg");
        ImageView Ritu_Kumar = createImageView("/Designer/RituKumar.jpg");
        ImageView Rocky_Star = createImageView("/Designer/RockyStar.jpg");
        ImageView Sabyasachi_Mukherjee = createImageView("/Designer/SabyasachiMukherjee.jpg");
        ImageView Sandeep_Khosla_And_Abu_Jani = createImageView("/Designer/SandeepKhosla_And_AbuJani.jpg");
        ImageView Sanjay_Garg = createImageView("/Designer/SanjayGarg.jpg");
        ImageView Shantanu_Nikhil = createImageView("/Designer/ShantanuNikhil.jpg");
        ImageView Tarun_Tahiliani = createImageView("/Designer/TarunTahiliani.jpg");
        ImageView Bibhu_Mohapatra = createImageView("/Designer/BibhuMohapatra.jpg");

        Label mm = new Label("Manish Malhotra");
        Label ps = new Label("Payal Singhal");
        Label rk = new Label("Ritu Kumar");
        Label rs = new Label("Rocky Star");
        Label sm = new Label("Sabyasachi Mukherjee");
        Label sk__aj = new Label("Sandeep Khosla And Abu Jani");
        Label sg = new Label("Sanjay Garg");
        Label sn = new Label("Shantanu_Nikhil");
        Label tt = new Label("Tarun Tahiliani");
        Label bm = new Label("Bibhu Mohapatra");

        Label rating1 = new Label("Ratings - 4.7");
        Label rating2 = new Label("Ratings - 4.5");
        Label rating3 = new Label("Ratings - 4.6");
        Label rating4 = new Label("Ratings - 4.5");
        Label rating5 = new Label("Ratings - 4.4");
        Label rating6 = new Label("Ratings - 4.6");
        Label rating7 = new Label("Ratings - 4.1");
        Label rating8 = new Label("Ratings - 4.3");
        Label rating9 = new Label("Ratings - 4.5");
        Label rating10 = new Label("Ratings - 4.4");


        
        Button Button1=new Button("Select");
        Button1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedDesigner(mm.getText());
                Button1.setOnAction(e -> stage.setScene(new OrderSummaryPage1(stage, scene).getScene()) );

            }
            
        }); 

        Button Button2=new Button("Select");
        Button2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedDesigner(ps.getText());
                Button2.setOnAction(e -> stage.setScene(new OrderSummaryPage(stage, scene).getScene()) );

            }
            
        });

        Button Button3=new Button("Select");
        Button3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedDesigner(rk.getText());
                Button3.setOnAction(e -> stage.setScene(new OrderSummaryPage(stage, scene).getScene()) );


            }
            
        });

        Button Button4=new Button("Select");
        Button4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedDesigner(rs.getText());
                Button4.setOnAction(e -> stage.setScene(new OrderSummaryPage(stage, scene).getScene()) );


            }
            
        });

        Button Button5=new Button("Select");
        Button5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedDesigner(sm.getText());
                Button5.setOnAction(e -> stage.setScene(new OrderSummaryPage(stage, scene).getScene()) );


            }
            
        });

        Button Button6=new Button("Select");
        Button6.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedDesigner(sk__aj.getText());
                Button6.setOnAction(e -> stage.setScene(new OrderSummaryPage(stage, scene).getScene()) );


            }
            
        });

        Button Button7=new Button("Select");
        Button7.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedDesigner(sg.getText());
                Button7.setOnAction(e -> stage.setScene(new OrderSummaryPage(stage, scene).getScene()) );


            }
            
        });

        Button Button8=new Button("Select");
        Button8.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedDesigner(sn.getText());
                Button8.setOnAction(e -> stage.setScene(new OrderSummaryPage(stage, scene).getScene()) );


            }
            
        });

        Button Button9=new Button("Select");
        Button9.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedDesigner(tt.getText());
                Button9.setOnAction(e -> stage.setScene(new OrderSummaryPage(stage, scene).getScene()) );


            }
            
        });

        Button Button10=new Button("Select");
        Button10.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedDesigner(bm.getText());
                Button10.setOnAction(e -> stage.setScene(new OrderSummaryPage(stage, scene).getScene()) );


            }
            
        });


        
        VBox mm1 = new VBox(20,mm,rating1,Button1);
        VBox ps1 = new VBox(20, ps,rating2,Button2);
        VBox rk1 = new VBox(20,rk,rating3,Button3);
        VBox rs1 = new VBox(20,rs,rating4,Button4 );
        VBox sm1 = new VBox(20,sm,rating5,Button5);
        VBox sk_aj1 = new VBox(20,sk__aj,rating6,Button6);
        VBox sg1 = new VBox(20,sg,rating7,Button7);
        VBox sn1 = new VBox(20,sn,rating8,Button8);
        VBox tt1 = new VBox(20,tt,rating9,Button9);
        VBox  bm1 = new VBox(20,bm,rating10,Button10); 

        HBox mm2 = new HBox(30,Manish_Malhotra,mm1);
       // mm2.setAlignment(Pos.CENTER);
        mm2.setPadding(new Insets(10));
        mm2.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, new CornerRadii(10),Insets.EMPTY)));
        mm2.setEffect(new DropShadow(5, Color.GREENYELLOW));
        
        HBox ps2 = new HBox(30,Payal_Singhal,ps1);
        //ps2.setAlignment(Pos.CENTER);
        ps2.setPadding(new Insets(10));
        ps2.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, new CornerRadii(10),Insets.EMPTY)));
        ps2.setEffect(new DropShadow(5, Color.GREENYELLOW));
        
        HBox rk2 = new HBox(30, Ritu_Kumar,rk1);
        //rk2.setAlignment(Pos.CENTER);
        rk2.setPadding(new Insets(10));
        rk2.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, new CornerRadii(10),Insets.EMPTY)));
        rk2.setEffect(new DropShadow(5, Color.GREENYELLOW));
        
        HBox  rs2 = new HBox(30, Rocky_Star,rs1);
        //rs2.setAlignment(Pos.CENTER);
        rs2.setPadding(new Insets(10));
        rs2.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, new CornerRadii(10),Insets.EMPTY)));
        rs2.setEffect(new DropShadow(5, Color.GREENYELLOW));
        
        HBox sm2 = new HBox(30,Sabyasachi_Mukherjee,sm1);
        //sm2.setAlignment(Pos.CENTER);
        sm2.setPadding(new Insets(10));
        sm2.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, new CornerRadii(10),Insets.EMPTY)));
        sm2.setEffect(new DropShadow(5, Color.GREENYELLOW));
        
        HBox sk_aj2 = new HBox(30,Sandeep_Khosla_And_Abu_Jani,sk_aj1);
        //sk_aj2.setAlignment(Pos.CENTER);
        sk_aj2.setPadding(new Insets(10));
        sk_aj2.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, new CornerRadii(10),Insets.EMPTY)));
        sk_aj2.setEffect(new DropShadow(5, Color.GREENYELLOW));
        
        HBox sg2 = new HBox(30,Sanjay_Garg,sg1);
        //sg2.setAlignment(Pos.CENTER);
        sg2.setPadding(new Insets(10));
        sg2.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, new CornerRadii(10),Insets.EMPTY)));
        sg2.setEffect(new DropShadow(5, Color.GREENYELLOW));
        
        HBox sn2 = new HBox(30,Shantanu_Nikhil,sn1);
        //sn2.setAlignment(Pos.CENTER);
        sn2.setPadding(new Insets(10));
        sn2.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, new CornerRadii(10),Insets.EMPTY)));
        sn2.setEffect(new DropShadow(5, Color.GREENYELLOW));
        
        HBox tt2 = new HBox(30,Tarun_Tahiliani,tt1);
        //tt2.setAlignment(Pos.CENTER);
        tt2.setPadding(new Insets(10));
        tt2.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, new CornerRadii(10),Insets.EMPTY)));
        tt2.setEffect(new DropShadow(5, Color.GREENYELLOW));
        
        HBox bm2 = new HBox(30,Bibhu_Mohapatra,bm1);
        //bm2.setAlignment(Pos.CENTER);
        bm2.setPadding(new Insets(10));
        bm2.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, new CornerRadii(10),Insets.EMPTY)));
        bm2.setEffect(new DropShadow(5, Color.GREENYELLOW));
        

        VBox layout = new VBox(30,mm2,ps2,rk2,rs2,sm2,sk_aj2,sg2,sn2,tt2,bm2);

        
        ScrollPane scrollPane = new ScrollPane(layout);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);
        
        
        

        /*
        
        // Example designer buttons
        for (int i = 1; i <= 3; i++) {
            Button designerButton = new Button("Designer " + i + " (Rating: " + (5 - i) + " stars)");
            designerButton.setStyle("-fx-background-color: #FF9800; -fx-text-fill: white; -fx-padding: 10px 20px; -fx-font-size: 14px;");
            designerButton.setOnAction(e -> {
                // Navigate to the next step or process the selection
            });
            root.getChildren().add(designerButton);
        }
        */

        Button backButton = new Button("Back");
        backButton.setStyle("-fx-background-color: #9E9E9E; -fx-text-fill: white; -fx-padding: 10px 20px; -fx-font-size: 14px;");
        backButton.setOnAction(e -> stage.setScene(previousScene));

        root.getChildren().addAll(title, scrollPane , backButton);

        scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
    }
    private ImageView createImageView(String imagePath) {
        ImageView imageView = new ImageView();
        try {
            Image image = new Image(getClass().getResourceAsStream(imagePath));
            imageView.setImage(image);
            imageView.setFitWidth(200);
            imageView.setFitHeight(200);
            imageView.setPreserveRatio(true);
            imageView.setSmooth(true);
        } catch (Exception e) {
            System.out.println("Could not load image: " + imagePath);
            e.printStackTrace();
        }
        return imageView;
    }
    public Scene getScene() {
        return scene;
    }

    
}
