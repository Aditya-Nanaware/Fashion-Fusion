package com.male_fashion.Home_page;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
//import javafx.scene.control.ScrollBar;
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
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
//import javafx.scene.paint.ImagePattern;
import javafx.stage.Stage;

public class FabricSelectionPage {

    
    private Scene scene;
    private Stage stage;
    @SuppressWarnings("unused")
    private Scene previouScene;

    @SuppressWarnings("unused")
    private Selection selectedFabric;
   
    static AnchorPane apane;

    private static final int SCENE_WIDTH = 1008;
    private static final int SCENE_HEIGHT = 600;


    public FabricSelectionPage(Stage stage, Scene previouScene){
        this.stage = stage;
        this.previouScene = previouScene;
        initView(previouScene);
    }
   
    public void initView(Scene previouScene) {
        Label label = new Label("Fabrics");
        label.setFont(Font.font("Georgia", FontWeight.BOLD, 25));
        label.setTextFill(Color.WHITE);
        label.setPadding(new Insets(20));
        label.setStyle("-fx-background-color:black; -fx-background-radius: 10;");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setHgap(20);
        gridPane.setVgap(20);
        gridPane.setAlignment(Pos.CENTER);


        Label priceLabel1 = new Label("Price - 500");
        Label priceLabel2 = new Label("Price - 500");
        Label priceLabel3 = new Label("Price - 500");
        Label priceLabel4 = new Label("Price - 500");
        Label priceLabel5 = new Label("Price - 500");
        Label priceLabel6 = new Label("Price - 500");
        Label priceLabel7 = new Label("Price - 500");
        Label priceLabel8 = new Label("Price - 500");
        Label priceLabel9 = new Label("Price - 500");
        Label priceLabel10 = new Label("Price - 500");
        Label priceLabel11 = new Label("Price - 500");
        Label priceLabel12 = new Label("Price - 500");
        Label priceLabel13 = new Label("Price - 500");
        Label priceLabel14 = new Label("Price - 500");
        Label priceLabel15 = new Label("Price - 500");
        Label priceLabel16 = new Label("Price - 500");
        Label priceLabel17 = new Label("Price - 500");
        Label priceLabel18 = new Label("Price - 500");

        

        Label lb1=new Label("KHADI COTTON");
        lb1.setFont(new Font(30));
        lb1.setTextFill(Color.BLACK);

        Image ig1=new Image("/F_images/khadi cotton ig1.jpg");
        ImageView fbcImg1=new ImageView(ig1);
        fbcImg1.setFitWidth(200);
        fbcImg1.setFitHeight(200);

        Label lb2=new Label("COTTON");
        lb2.setFont(new Font(30));
        lb2.setTextFill(Color.BLACK);

        Image ig2=new Image("/F_images/plain cotton ig2.jpg");
        ImageView fbcImg2=new ImageView(ig2);
        fbcImg2.setFitWidth(200);
        fbcImg2.setFitHeight(200); 

        Label lb3=new Label("VELVET");
        lb3.setFont(new Font(30));
        lb3.setTextFill(Color.BLACK);

        Image ig3=new Image("/F_images/velvet ig3.jpg");
        ImageView fbcImg3=new ImageView(ig3);
        fbcImg3.setFitWidth(200);
        fbcImg3.setFitHeight(200);

        Label lb4=new Label("JERCY");
        lb4.setFont(new Font(30));
        lb4.setTextFill(Color.BLACK);

        Image ig4=new Image("/F_images/jercy ig4.jpg");
        ImageView fbcImg4=new ImageView(ig4);
        fbcImg4.setFitWidth(200);
        fbcImg4.setFitHeight(200);

        Label lb5=new Label("SILK");
        lb5.setFont(new Font(30));
        lb5.setTextFill(Color.BLACK);

        Image ig5=new Image("/F_images/silk ig5.jpg");
        ImageView fbcImg5=new ImageView(ig5);
        fbcImg5.setFitWidth(200);
        fbcImg5.setFitHeight(200);

        Label lb6=new Label("WOOL");
        lb6.setFont(new Font(30));
        lb6.setTextFill(Color.BLACK);

        Image ig6=new Image("/F_images/wool ig6.jpg");
        ImageView fbcImg6=new ImageView(ig6);
        fbcImg6.setFitWidth(200);
        fbcImg6.setFitHeight(200);

        Label lb7=new Label("DENIM");
        lb7.setFont(new Font(30));
        lb7.setTextFill(Color.BLACK);

        Image ig7=new Image("/F_images/denim ig7.jpg");
        ImageView fbcImg7=new ImageView(ig7);
        fbcImg7.setFitWidth(200);
        fbcImg7.setFitHeight(200);

        Label lb8=new Label("SATIN");
        lb8.setFont(new Font(30));
        lb8.setTextFill(Color.BLACK);

        Image ig8=new Image("/F_images/satin ig 8...jpg");
        ImageView fbcImg8=new ImageView(ig8);
        fbcImg8.setFitWidth(200);
        fbcImg8.setFitHeight(200);

        Label lb9=new Label("LINEN");
        lb9.setFont(new Font(30));
        lb9.setTextFill(Color.BLACK);
        

        Image ig9=new Image("/F_images/linen ig 9.jpg");
        ImageView fbcImg9=new ImageView(ig9);
        fbcImg9.setFitWidth(200);
        fbcImg9.setFitHeight(200);

        Label lb10=new Label("RAYON");
        lb10.setFont(new Font(30));
        lb10.setTextFill(Color.BLACK);

        Image ig10=new Image("/F_images/rayon ig 10.jpg");
        ImageView fbcImg10=new ImageView(ig10);
        fbcImg10.setFitWidth(200);
        fbcImg10.setFitHeight(200);

        Label lb11=new Label("CHIFFON");
        lb11.setFont(new Font(30));
        lb11.setTextFill(Color.BLACK);

        Image ig11=new Image("/F_images/chiffon ig 11.jpg");
        ImageView fbcImg11=new ImageView(ig11);
        fbcImg11.setFitWidth(200);
        fbcImg11.setFitHeight(200);

        Label lb12=new Label("CHENILLE");
        lb12.setFont(new Font(30));
        lb12.setTextFill(Color.BLACK);

        Image ig12=new Image("/F_images/chenille ig 12.jpg");
        ImageView fbcImg12=new ImageView(ig12);
        fbcImg12.setFitWidth(200);
        fbcImg12.setFitHeight(200);

        Label lb13=new Label("BAIZE");
        lb13.setFont(new Font(30));
        lb13.setTextFill(Color.BLACK);

        Image ig13=new Image("/F_images/baize ig 13.jpg");
        ImageView fbcImg13=new ImageView(ig13);
        fbcImg13.setFitWidth(200);
        fbcImg13.setFitHeight(200);

        Label lb14=new Label("CHARMEUSE");
        lb14.setFont(new Font(30));
        lb14.setTextFill(Color.BLACK);

        Image ig14=new Image("/F_images/Charmeuse ig 14.jpg");
        ImageView fbcImg14=new ImageView(ig14);
        fbcImg14.setFitWidth(200);
        fbcImg14.setFitHeight(200);

        Label lb15=new Label("DEMITY");
        lb15.setFont(new Font(30));
        lb15.setTextFill(Color.BLACK);

        Image ig15=new Image("/F_images/demity ig 15.jpg");
        ImageView fbcImg15=new ImageView(ig15);
        fbcImg15.setFitWidth(200);
        fbcImg15.setFitHeight(200);

        Label lb16=new Label("DRILL");
        lb16.setFont(new Font(30));
        lb16.setTextFill(Color.BLACK);

        Image ig16=new Image("/F_images/drill ig 16.jpg");
        ImageView fbcImg16=new ImageView(ig16);
        fbcImg16.setFitWidth(200);
        fbcImg16.setFitHeight(200);

        Label lb17=new Label("FELT");
        lb17.setFont(new Font(30));
        lb17.setTextFill(Color.BLACK);

        Image ig17=new Image("/F_images/felt ig 17.jpg");
        ImageView fbcImg17=new ImageView(ig17);
        fbcImg17.setFitWidth(200);
        fbcImg17.setFitHeight(200);

        Label lb18=new Label("GEORGETTE");
        lb18.setFont(new Font(30));
        lb18.setTextFill(Color.BLACK);

        Image ig18=new Image("/F_images/geoegette ig 18.jpg");
        ImageView fbcImg18=new ImageView(ig18);
        fbcImg18.setFitWidth(200);
        fbcImg18.setFitHeight(200);

    
    
        Button Button1=new Button("Select");
        Button1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedFabric(lb1.getText(),500);
                Button1.setOnAction(e -> stage.setScene(new ColorSelectionPage(stage, scene).getScene()) );

              

            }
            
        }); 

        Button Button2=new Button("Select");
        Button2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedFabric(lb2.getText(),500);
                Button2.setOnAction(e -> stage.setScene(new ColorSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button3=new Button("Select");
        Button3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedFabric(lb3.getText(),500);
                Button3.setOnAction(e -> stage.setScene(new ColorSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button4=new Button("Select");
        Button4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedFabric(lb4.getText(),500);
                Button4.setOnAction(e -> stage.setScene(new ColorSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button5=new Button("Select");
        Button5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedFabric(lb5.getText(),500);
                Button5.setOnAction(e -> stage.setScene(new ColorSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button6=new Button("Select");
        Button6.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedFabric(lb6.getText(),500);
                Button6.setOnAction(e -> stage.setScene(new ColorSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button7=new Button("Select");
        Button7.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedFabric(lb7.getText(),500);
                Button7.setOnAction(e -> stage.setScene(new ColorSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button8=new Button("Select");
        Button8.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedFabric(lb8.getText(),500);
                Button8.setOnAction(e -> stage.setScene(new ColorSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button9=new Button("Select");
        Button9.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedFabric(lb9.getText(),500);
                Button9.setOnAction(e -> stage.setScene(new ColorSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button10=new Button("Select");
        Button10.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedFabric(lb10.getText(),500);
                Button10.setOnAction(e -> stage.setScene(new ColorSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button11=new Button("Select");
        Button11.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedFabric(lb11.getText(),500);
                Button11.setOnAction(e -> stage.setScene(new ColorSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button12=new Button("Select");
        Button12.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedFabric(lb12.getText(),500);
                Button12.setOnAction(e -> stage.setScene(new ColorSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button13=new Button("Select");
        Button13.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedFabric(lb13.getText(),500);
                Button13.setOnAction(e -> stage.setScene(new ColorSelectionPage(stage, scene).getScene()) );


            }
            
        });


        Button Button14=new Button("Select");
        Button14.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedFabric(lb14.getText(),500);
                Button14.setOnAction(e -> stage.setScene(new ColorSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button15=new Button("Select");
        Button15.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedFabric(lb15.getText(),500);
                Button15.setOnAction(e -> stage.setScene(new ColorSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button16=new Button("Select");
        Button16.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedFabric(lb16.getText(),500);
                Button16.setOnAction(e -> stage.setScene(new ColorSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button17=new Button("Select");
        Button17.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedFabric(lb17.getText(),500);
                Button17.setOnAction(e -> stage.setScene(new ColorSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button18=new Button("Select");
        Button18.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedFabric(lb18.getText(),500);
                Button18.setOnAction(e -> stage.setScene(new ColorSelectionPage(stage, scene).getScene()) );


            }
            
        });

        
        
        
        VBox cslBox1 = new VBox(20, lb1,fbcImg1,priceLabel1, Button1);
        gridPane.add(cslBox1, 0, 0);
        cslBox1.setPadding(new Insets(10));
        cslBox1.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox1.setEffect(new DropShadow(5, Color.GREENYELLOW));

        VBox cslBox2 = new VBox(20,lb2, fbcImg2,priceLabel2, Button2);
        gridPane.add(cslBox2, 1, 0);
        cslBox2.setPadding(new Insets(10));
        cslBox2.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox2.setEffect(new DropShadow(5, Color.GREENYELLOW));



        VBox cslBox3 = new VBox(20,lb3, fbcImg3,priceLabel3, Button3);
        gridPane.add(cslBox3, 2, 0);
        cslBox3.setPadding(new Insets(10));
        cslBox3.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox3.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox4 = new VBox(20,lb4, fbcImg4,priceLabel4, Button4);
        gridPane.add(cslBox4, 3, 0);
        cslBox4.setPadding(new Insets(10));
        cslBox4.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox4.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox5 = new VBox(20,lb5, fbcImg5, priceLabel5,Button5);
        gridPane.add(cslBox5, 0, 1);
        cslBox5.setPadding(new Insets(10));
        cslBox5.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox5.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox6 = new VBox(20,lb6, fbcImg6,priceLabel6, Button6);
        gridPane.add(cslBox6, 1, 1);
        cslBox6.setPadding(new Insets(10));
        cslBox6.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox6.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox7 = new VBox(20,lb7, fbcImg7,priceLabel7, Button7);
        gridPane.add(cslBox7, 2, 1);
        cslBox7.setPadding(new Insets(10));
        cslBox7.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox7.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox8 = new VBox(20,lb8, fbcImg8,priceLabel8, Button8);
        gridPane.add(cslBox8, 3, 1);
        cslBox8.setPadding(new Insets(10));
        cslBox8.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox8.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox9 = new VBox(20, lb9,fbcImg9,priceLabel9, Button9);
        gridPane.add(cslBox9, 0, 2);
        cslBox9.setPadding(new Insets(10));
        cslBox9.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox9.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox10 = new VBox(20,lb10, fbcImg10,priceLabel10, Button10);
        gridPane.add(cslBox10, 1, 2);
        cslBox10.setPadding(new Insets(10));
        cslBox10.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox10.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox11 = new VBox(20, lb11,fbcImg11,priceLabel11, Button11);
        gridPane.add(cslBox11, 2, 2);
        cslBox11.setPadding(new Insets(10));
        cslBox11.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox11.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox12 = new VBox(20, lb12,fbcImg12,priceLabel12, Button12);
        gridPane.add(cslBox12, 3, 2);
        cslBox12.setPadding(new Insets(10));
        cslBox12.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox12.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox13 = new VBox(20, lb13,fbcImg13,priceLabel13, Button13);
        gridPane.add(cslBox13, 0, 3);
        cslBox13.setPadding(new Insets(10));
        cslBox13.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox13.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox14 = new VBox(20, lb14,fbcImg14,priceLabel14, Button14);
        gridPane.add(cslBox14, 1, 3);
        cslBox14.setPadding(new Insets(10));
        cslBox14.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox14.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox15 = new VBox(20,lb15, fbcImg15,priceLabel15, Button15);
        gridPane.add(cslBox15, 2, 3);
        cslBox15.setPadding(new Insets(10));
        cslBox15.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox15.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox16 = new VBox(20, lb16,fbcImg16,priceLabel16, Button16);
        gridPane.add(cslBox16, 3, 3);
        cslBox16.setPadding(new Insets(10));
        cslBox16.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox16.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox17 = new VBox(20, lb17,fbcImg17,priceLabel17, Button17);
        gridPane.add(cslBox17, 0, 4);
        cslBox17.setPadding(new Insets(10));
        cslBox17.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox17.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox18 = new VBox(20, lb18,fbcImg18,priceLabel18, Button18);
        gridPane.add(cslBox18, 1, 4);
        cslBox18.setPadding(new Insets(10));
        cslBox18.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox18.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        ScrollPane scrollPane = new ScrollPane(gridPane);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);
        
       
        // Back button to navigate back to the male or female section
        Button backButton = new Button("Back");
        backButton.setOnAction(event -> stage.setScene(previouScene));
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



