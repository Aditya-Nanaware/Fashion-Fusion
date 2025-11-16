package com.male_fashion.Home_page;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
//import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class CasualWearPage {
    private Scene scene;
    private Stage stage;
    private MaleSectionPage maleSectionPage;
    static AnchorPane apane;

    @SuppressWarnings("unused")
    private Selection selectedCloth;

    private static final int SCENE_WIDTH = 1008;
    private static final int SCENE_HEIGHT = 600;

    public CasualWearPage(Stage stage, MaleSectionPage maleSectionPage) {
        this.stage = stage;
        this.maleSectionPage = maleSectionPage;
        initView();
    }

    private void initView() {
        Label label = new Label("Casual Wear");
        label.setFont(Font.font("Georgia", FontWeight.BOLD, 25));
        label.setTextFill(Color.WHITE);
        label.setPadding(new Insets(20));
        label.setStyle("-fx-background-color:black; -fx-background-radius: 10;");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setHgap(20);
        gridPane.setVgap(20);
        gridPane.setAlignment(Pos.CENTER);

        ImageView imageView1 = createImageView("/casual_Images/casualimg1.jpg");
        ImageView imageView2 = createImageView("/casual_Images/casualimg2.jpg");
        ImageView imageView3 = createImageView("/casual_Images/casualimg3.jpg");
        ImageView imageView4 = createImageView("/casual_Images/casualimg4.jpg");
        ImageView imageView5 = createImageView("/casual_Images/casualimg5.jpg");
        ImageView imageView6 = createImageView("/casual_Images/casualimg6.jpg");
        ImageView imageView7 = createImageView("/casual_Images/casualimg7.jpg");
        ImageView imageView8 = createImageView("/casual_Images/casualimg8.jpg");
        ImageView imageView9 = createImageView("/casual_Images/casualimg9.jpg");
        ImageView imageView10 = createImageView("/casual_Images/casualimg10.jpg");
        ImageView imageView11 = createImageView("/casual_Images/casualimg11.jpg");
        ImageView imageView12 = createImageView("/casual_Images/casualimg12.jpg");
        ImageView imageView13 = createImageView("/casual_Images/casualimg13.jpg");
        ImageView imageView14 = createImageView("/casual_Images/casualimg14.jpg");
        ImageView imageView15 = createImageView("/casual_Images/casualimg15.jpg");
        ImageView imageView16 = createImageView("/casual_Images/casualimg16.jpg");
        ImageView imageView17 = createImageView("/casual_Images/casualimg17.jpg");
        ImageView imageView18 = createImageView("/casual_Images/casualimg18.jpg");
        ImageView imageView19 = createImageView("/casual_Images/casualimg19.jpg");
        ImageView imageView20 = createImageView("/casual_Images/casualimg20.jpg");
        ImageView imageView21 = createImageView("/casual_Images/casualimg21.jpg");
        ImageView imageView22 = createImageView("/casual_Images/casualimg22.jpg");
        ImageView imageView23 = createImageView("/casual_Images/casualimg23.jpg");
        ImageView imageView24 = createImageView("/casual_Images/digu.jpg");
        
        //Label casualLabel = new Label("Casual Shirt");
        Label priceLabel1 = new Label("Price - 500");
        Label priceLabel2 = new Label("Price - 400");
        Label priceLabel3 = new Label("Price - 600");
        Label priceLabel4 = new Label("Price - 700");
        Label priceLabel5 = new Label("Price - 500");
        Label priceLabel6 = new Label("Price - 700");
        Label priceLabel7 = new Label("Price - 800");
        Label priceLabel8 = new Label("Price - 450");
        Label priceLabel9 = new Label("Price - 700");
        Label priceLabel10 = new Label("Price - 600");
        Label priceLabel11 = new Label("Price - 500");
        Label priceLabel12 = new Label("Price - 600");
        Label priceLabel13 = new Label("Price - 500");
        Label priceLabel14 = new Label("Price - 700");
        Label priceLabel15 = new Label("Price - 700");
        Label priceLabel16 = new Label("Price - 700");
        Label priceLabel17 = new Label("Price - 700");
        Label priceLabel18 = new Label("Price - 500");
        Label priceLabel19 = new Label("Price - 600");
        Label priceLabel20 = new Label("Price - 600");
        Label priceLabel21 = new Label("Price - 600");
        Label priceLabel22 = new Label("Price - 700");
        Label priceLabel23 = new Label("Price - 600");
        Label priceLabel24 = new Label("Price - 500");
 
        
        

        
        
        Button cslButton1=new Button("Select");
        cslButton1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",500);
              cslButton1.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );

            }
            
        });

        Button cslButton2=new Button("Select");
        cslButton2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",400);
                cslButton2.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );

            }
            
        });

        Button cslButton3=new Button("Select");
        cslButton3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",600);
                cslButton3.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button cslButton4=new Button("Select");
        cslButton4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",700);
                cslButton4.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button cslButton5=new Button("Select");
        cslButton5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",500);
                cslButton5.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button cslButton6=new Button("Select");
        cslButton6.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",700);
                cslButton6.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button cslButton7=new Button("Select");
        cslButton7.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",800);
                cslButton7.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button cslButton8=new Button("Select");
        cslButton8.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",450);
                cslButton8.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button cslButton9=new Button("Select");
        cslButton9.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",700);
                cslButton9.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button cslButton10=new Button("Select");
        cslButton10.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",600);
                cslButton10.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button cslButton11=new Button("Select");
        cslButton11.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",500);
                cslButton11.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button cslButton12=new Button("Select");
        cslButton12.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",600);
                cslButton12.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button cslButton13=new Button("Select");
        cslButton13.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",500);
                cslButton13.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });


        Button cslButton14=new Button("Select");
        cslButton14.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",700);
                cslButton14.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });


        Button cslButton15=new Button("Select");
        cslButton15.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",700);
                cslButton15.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });


        Button cslButton16=new Button("Select");
        cslButton16.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",700);
                cslButton16.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });


        Button cslButton17=new Button("Select");
        cslButton17.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",700);
                cslButton17.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });



        Button cslButton18=new Button("Select");
        cslButton18.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",500);
                cslButton18.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });



        Button cslButton19=new Button("Select");
        cslButton19.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",600);
                cslButton19.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button cslButton20=new Button("Select");
        cslButton20.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",600);
                cslButton20.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button cslButton21=new Button("Select");
        cslButton21.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",600);
                cslButton21.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button cslButton22=new Button("Select");
        cslButton22.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",700);
                cslButton22.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button cslButton23=new Button("Select");
        cslButton23.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",600);
                cslButton23.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button cslButton24=new Button("Select");
        cslButton24.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",500);
                cslButton24.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });
    
        VBox cslBox1 = new VBox(20, imageView1,priceLabel1, cslButton1);
        gridPane.add(cslBox1, 0, 0);
        cslBox1.setPadding(new Insets(10));
        cslBox1.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox1.setEffect(new DropShadow(5, Color.GREENYELLOW));
        

        VBox cslBox2 = new VBox(20, imageView2,priceLabel2, cslButton2);
        gridPane.add(cslBox2, 1, 0);
        cslBox2.setPadding(new Insets(10));
        cslBox2.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox2.setEffect(new DropShadow(5, Color.GREENYELLOW));


        VBox cslBox3 = new VBox(20, imageView3, priceLabel3,cslButton3);
        gridPane.add(cslBox3, 2, 0);
        cslBox3.setPadding(new Insets(10));
        cslBox3.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox3.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox4 = new VBox(20, imageView4,priceLabel4, cslButton4);
        gridPane.add(cslBox4, 3, 0);
        cslBox4.setPadding(new Insets(10));
        cslBox4.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox4.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox5 = new VBox(20, imageView5,priceLabel5, cslButton5);
        gridPane.add(cslBox5, 0, 1);
        cslBox5.setPadding(new Insets(10));
        cslBox5.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox5.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox6 = new VBox(20, imageView6, priceLabel6,cslButton6);
        gridPane.add(cslBox6, 1, 1);
        cslBox6.setPadding(new Insets(10));
        cslBox6.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox6.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox7 = new VBox(20, imageView7,priceLabel7, cslButton7);
        gridPane.add(cslBox7, 2, 1);
        cslBox7.setPadding(new Insets(10));
        cslBox7.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox7.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox8 = new VBox(20, imageView8, priceLabel8,cslButton8);
        gridPane.add(cslBox8, 3, 1);
        cslBox8.setPadding(new Insets(10));
        cslBox8.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox8.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox9 = new VBox(20, imageView9, priceLabel9,cslButton9);
        gridPane.add(cslBox9, 0, 2);
        cslBox9.setPadding(new Insets(10));
        cslBox9.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox9.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox10 = new VBox(20, imageView10,priceLabel10, cslButton10);
        gridPane.add(cslBox10, 1, 2);
        cslBox10.setPadding(new Insets(10));
        cslBox10.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox10.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox11 = new VBox(20, imageView11,priceLabel11, cslButton11);
        gridPane.add(cslBox11, 2, 2);
        cslBox11.setPadding(new Insets(10));
        cslBox11.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox11.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox12 = new VBox(20, imageView12,priceLabel12, cslButton12);
        gridPane.add(cslBox12, 3, 2);
        cslBox12.setPadding(new Insets(10));
        cslBox12.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox12.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox13 = new VBox(20, imageView13, priceLabel13,cslButton13);
        gridPane.add(cslBox13, 0, 3);
        cslBox13.setPadding(new Insets(10));
        cslBox13.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox13.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox14 = new VBox(20, imageView14,priceLabel14, cslButton14);
        gridPane.add(cslBox14, 1, 3);
        cslBox14.setPadding(new Insets(10));
        cslBox14.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox14.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox15 = new VBox(20, imageView15, priceLabel15,cslButton15);
        gridPane.add(cslBox15, 2, 3);
        cslBox15.setPadding(new Insets(10));
        cslBox15.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox15.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox16 = new VBox(20, imageView16,priceLabel16, cslButton16);
        gridPane.add(cslBox16, 3, 3);
        cslBox16.setPadding(new Insets(10));
        cslBox16.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox16.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox17 = new VBox(20, imageView17, priceLabel17,cslButton17);
        gridPane.add(cslBox17, 0, 4);
        cslBox17.setPadding(new Insets(10));
        cslBox17.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox17.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox18 = new VBox(20, imageView18,priceLabel18, cslButton18);
        gridPane.add(cslBox18, 1, 4);
        cslBox18.setPadding(new Insets(10));
        cslBox18.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox18.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox19 = new VBox(20, imageView19,priceLabel19, cslButton19);
        gridPane.add(cslBox19, 2, 4);
        cslBox19.setPadding(new Insets(10));
        cslBox19.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox19.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox20 = new VBox(20, imageView20, priceLabel20,cslButton20);
        gridPane.add(cslBox20, 3, 4);
        cslBox20.setPadding(new Insets(10));
        cslBox20.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox20.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox21 = new VBox(20, imageView21, priceLabel21,cslButton21);
        gridPane.add(cslBox21, 0, 5);
        cslBox21.setPadding(new Insets(10));
        cslBox21.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox21.setEffect(new DropShadow(5, Color.GREENYELLOW));

        

        VBox cslBox22 = new VBox(20, imageView22,priceLabel22, cslButton20);
        gridPane.add(cslBox22, 1, 5);
        cslBox22.setPadding(new Insets(10));
        cslBox22.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox22.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox23 = new VBox(20, imageView23,priceLabel23, cslButton23);
        gridPane.add(cslBox23, 2, 5);
        cslBox23.setPadding(new Insets(10));
        cslBox23.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox23.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox24 = new VBox(20, imageView24,priceLabel24, cslButton24);
        gridPane.add(cslBox24, 3, 5);
        cslBox24.setPadding(new Insets(10));
        cslBox24.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox24.setEffect(new DropShadow(5, Color.GREENYELLOW));

        


        
        ScrollPane scrollPane = new ScrollPane(gridPane);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);
        
       
        // Back button to navigate back to the male or female section
        Button backButton = new Button("Back");
        backButton.setOnAction(event -> stage.setScene(maleSectionPage.getScene()));
        styleButton(backButton);

    

        // Background image
        Image bgImage = new Image(getClass().getResourceAsStream("/images/6.jpg"));
        BackgroundImage backgroundImage = new BackgroundImage(
                bgImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true));
        gridPane.setBackground(new Background(backgroundImage));

        VBox rooBox = new VBox(10,label,scrollPane,backButton);
        rooBox.setAlignment(Pos.TOP_CENTER);

        scene = new Scene(rooBox, SCENE_WIDTH, SCENE_HEIGHT);
        


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
    
    private void styleButton(Button button) {
        button.setFont(Font.font("Arial", FontWeight.BOLD, 10));
        button.setStyle("-fx-background-color: #FF5733; -fx-text-fill: white; -fx-padding: 10 20 10 20;");
        button.setEffect(new DropShadow(2, Color.GRAY));
        
        button.setOnMouseEntered(event -> button.setStyle("-fx-background-color: #C70039; -fx-text-fill: white; -fx-padding: 10 20 10 20;"));
        button.setOnMouseExited(event -> button.setStyle("-fx-background-color: #FF5733; -fx-text-fill: white; -fx-padding: 10 20 10 20;"));
    }
         

    public Scene getScene() {
        return scene;
    }
}


