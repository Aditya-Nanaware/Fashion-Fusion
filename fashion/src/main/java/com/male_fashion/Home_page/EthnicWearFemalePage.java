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
import javafx.stage.Stage;

public class EthnicWearFemalePage  {

    private Scene scene;
    private Stage stage;
    private FemaleSectionPage femaleSectionPage;
    static AnchorPane apane;

    private static final int SCENE_WIDTH = 1008;
    private static final int SCENE_HEIGHT = 600;

    public EthnicWearFemalePage(Stage stage, FemaleSectionPage femaleSectionPage) {
        this.stage = stage;
        this.femaleSectionPage = femaleSectionPage;
        initView();
    }
   
    private void initView()  {
        Label label = new Label("Ethnic Wear");
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



        Image ig1=new Image("/T_images/T 1.jpg");
        ImageView trdnlImg1=new ImageView(ig1);
        trdnlImg1.setFitWidth(200);
        trdnlImg1.setFitHeight(200);

        Image ig2=new Image("/T_images/T 2.jpg");
        ImageView trdnlImg2=new ImageView(ig2);
        trdnlImg2.setFitWidth(200);
        trdnlImg2.setFitHeight(200);

        Image ig3=new Image("/T_images/T 3.jpg");
        ImageView trdnlImg3=new ImageView(ig3);
        trdnlImg3.setFitWidth(200);
        trdnlImg3.setFitHeight(200);

        Image ig4=new Image("/T_images/T 4.jpg");
        ImageView trdnlImg4=new ImageView(ig4);
        trdnlImg4.setFitWidth(200);
        trdnlImg4.setFitHeight(200);

        Image ig5=new Image("/T_images/T 5.jpg");
        ImageView trdnlImg5=new ImageView(ig5);
        trdnlImg5.setFitWidth(200);
        trdnlImg5.setFitHeight(200);

        Image ig6=new Image("/T_images/T 6.jpg");
        ImageView trdnlImg6=new ImageView(ig6);
        trdnlImg6.setFitWidth(200);
        trdnlImg6.setFitHeight(200);

        Image ig7=new Image("/T_images/T 7.jpg");
        ImageView trdnlImg7=new ImageView(ig7);
        trdnlImg7.setFitWidth(200);
        trdnlImg7.setFitHeight(200);

        Image ig8=new Image("/T_images/T 8.jpg");
        ImageView trdnlImg8=new ImageView(ig8);
        trdnlImg8.setFitWidth(200);
        trdnlImg8.setFitHeight(200);
        

        Image ig9=new Image("/T_images/T 9.jpg");
        ImageView trdnlImg9=new ImageView(ig9);
        trdnlImg9.setFitWidth(200);
        trdnlImg9.setFitHeight(200);

        Image ig10=new Image("/T_images/T 10.jpg");
        ImageView trdnlImg10=new ImageView(ig10);
        trdnlImg10.setFitWidth(200);
        trdnlImg10.setFitHeight(200);

        Image ig11=new Image("/T_images/T 11.jpg");
        ImageView trdnlImg11=new ImageView(ig11);
        trdnlImg11.setFitWidth(200);
        trdnlImg11.setFitHeight(200);

        Image ig12=new Image("/T_images/T 12.jpg");
        ImageView trdnlImg12=new ImageView(ig12);
        trdnlImg12.setFitWidth(200);
        trdnlImg12.setFitHeight(200);

        Image ig13=new Image("/T_images/T 13.jpg");
        ImageView trdnlImg13=new ImageView(ig13);
        trdnlImg13.setFitWidth(200);
        trdnlImg13.setFitHeight(200);

        Image ig14=new Image("/T_images/T 14.jpg");
        ImageView trdnlImg14=new ImageView(ig14);
        trdnlImg14.setFitWidth(200);
        trdnlImg14.setFitHeight(200);

        Image ig15=new Image("/T_images/T 15.jpg");
        ImageView trdnlImg15=new ImageView(ig15);
        trdnlImg15.setFitWidth(200);
        trdnlImg15.setFitHeight(200);

        Image ig16=new Image("/T_images/T 16.jpg");
        ImageView trdnlImg16=new ImageView(ig16);
        trdnlImg16.setFitWidth(200);
        trdnlImg16.setFitHeight(200);

        Image ig17=new Image("/T_images/T 17.jpg");
        ImageView trdnlImg17=new ImageView(ig17);
        trdnlImg17.setFitWidth(200);
        trdnlImg17.setFitHeight(200);

        Image ig18=new Image("/T_images/T 18.jpg");
        ImageView trdnlImg18=new ImageView(ig18);
        trdnlImg18.setFitWidth(200);
        trdnlImg18.setFitHeight(200);

        Image ig19=new Image("/T_images/T 19.jpg");
        ImageView trdnlImg19=new ImageView(ig19);
        trdnlImg19.setFitWidth(200);
        trdnlImg19.setFitHeight(200);

    

        Image ig20=new Image("/T_images/T 20.jpg");
        ImageView trdnlImg20=new ImageView(ig20);
        trdnlImg20.setFitWidth(200);
        trdnlImg20.setFitHeight(200);


        Image ig21=new Image("/T_images/T 21.jpg");
        ImageView trdnlImg21=new ImageView(ig21);
        trdnlImg21.setFitWidth(200);
        trdnlImg21.setFitHeight(200);


        Image ig22=new Image("/T_images/T 22.jpg");
        ImageView trdnlImg22=new ImageView(ig22);
        trdnlImg22.setFitWidth(200);
        trdnlImg22.setFitHeight(200);


        Image ig23=new Image("/T_images/T 23.jpg");
        ImageView trdnlImg23=new ImageView(ig23);
        trdnlImg23.setFitWidth(200);
        trdnlImg23.setFitHeight(200);

        Image ig24=new Image("/T_images/T 24.jpg");
        ImageView trdnlImg24=new ImageView(ig24);
        trdnlImg24.setFitWidth(200);
        trdnlImg24.setFitHeight(200);

        
        Button Button1=new Button("Select");
        Button1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",500);
              Button1.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );

            }
            
        });

        Button Button2=new Button("Select");
        Button2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",400);
                Button2.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );

            }
            
        });

        Button Button3=new Button("Select");
        Button3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",600);
                Button3.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button4=new Button("Select");
        Button4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",700);
                Button4.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button5=new Button("Select");
        Button5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",500);
                Button5.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button6=new Button("Select");
        Button6.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",700);
                Button6.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button7=new Button("Select");
        Button7.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",800);
                Button7.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button8=new Button("Select");
        Button8.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",450);
                Button8.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button9=new Button("Select");
        Button9.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",700);
                Button9.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button10=new Button("Select");
        Button10.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",600);
                Button10.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button11=new Button("Select");
        Button11.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",500);
                Button11.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button12=new Button("Select");
        Button12.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",600);
                Button12.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button13=new Button("Select");
        Button13.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",500);
                Button13.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });


        Button Button14=new Button("Select");
        Button14.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",700);
                Button14.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });


        Button Button15=new Button("Select");
        Button15.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",700);
                Button15.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });


        Button Button16=new Button("Select");
        Button16.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",700);
                Button16.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });


        Button Button17=new Button("Select");
        Button17.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",700);
                Button17.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });



        Button Button18=new Button("Select");
        Button18.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",500);
                Button18.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });



        Button Button19=new Button("Select");
        Button19.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",600);
                Button19.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button20=new Button("Select");
        Button20.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",600);
                Button20.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button21=new Button("Select");
        Button21.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",600);
                Button21.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button22=new Button("Select");
        Button22.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",700);
                Button22.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button23=new Button("Select");
        Button23.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",600);
                Button23.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button24=new Button("Select");
        Button24.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Ehnic Wear ",500);
                Button24.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        VBox cslBox1 = new VBox(20, trdnlImg1,priceLabel1, Button1);
        gridPane.add(cslBox1, 0, 0);
        cslBox1.setPadding(new Insets(10));
        cslBox1.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox1.setEffect(new DropShadow(5, Color.GREENYELLOW));
        

        VBox cslBox2 = new VBox(20, trdnlImg2,priceLabel2, Button2);
        gridPane.add(cslBox2, 1, 0);
        cslBox2.setPadding(new Insets(10));
        cslBox2.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox2.setEffect(new DropShadow(5, Color.GREENYELLOW));


        VBox cslBox3 = new VBox(20, trdnlImg3, priceLabel3,Button3);
        gridPane.add(cslBox3, 2, 0);
        cslBox3.setPadding(new Insets(10));
        cslBox3.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox3.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox4 = new VBox(20, trdnlImg4,priceLabel4, Button4);
        gridPane.add(cslBox4, 3, 0);
        cslBox4.setPadding(new Insets(10));
        cslBox4.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox4.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox5 = new VBox(20, trdnlImg5,priceLabel5, Button5);
        gridPane.add(cslBox5, 0, 1);
        cslBox5.setPadding(new Insets(10));
        cslBox5.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox5.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox6 = new VBox(20, trdnlImg6, priceLabel6,Button6);
        gridPane.add(cslBox6, 1, 1);
        cslBox6.setPadding(new Insets(10));
        cslBox6.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox6.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox7 = new VBox(20, trdnlImg7,priceLabel7, Button7);
        gridPane.add(cslBox7, 2, 1);
        cslBox7.setPadding(new Insets(10));
        cslBox7.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox7.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox8 = new VBox(20, trdnlImg8, priceLabel8,Button8);
        gridPane.add(cslBox8, 3, 1);
        cslBox8.setPadding(new Insets(10));
        cslBox8.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox8.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox9 = new VBox(20, trdnlImg9, priceLabel9,Button9);
        gridPane.add(cslBox9, 0, 2);
        cslBox9.setPadding(new Insets(10));
        cslBox9.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox9.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox10 = new VBox(20, trdnlImg10,priceLabel10, Button10);
        gridPane.add(cslBox10, 1, 2);
        cslBox10.setPadding(new Insets(10));
        cslBox10.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox10.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox11 = new VBox(20, trdnlImg11,priceLabel11, Button11);
        gridPane.add(cslBox11, 2, 2);
        cslBox11.setPadding(new Insets(10));
        cslBox11.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox11.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox12 = new VBox(20, trdnlImg12,priceLabel12, Button12);
        gridPane.add(cslBox12, 3, 2);
        cslBox12.setPadding(new Insets(10));
        cslBox12.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox12.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox13 = new VBox(20, trdnlImg13, priceLabel13,Button13);
        gridPane.add(cslBox13, 0, 3);
        cslBox13.setPadding(new Insets(10));
        cslBox13.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox13.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox14 = new VBox(20, trdnlImg14,priceLabel14,Button14);
        gridPane.add(cslBox14, 1, 3);
        cslBox14.setPadding(new Insets(10));
        cslBox14.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox14.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox15 = new VBox(20, trdnlImg15, priceLabel15,Button15);
        gridPane.add(cslBox15, 2, 3);
        cslBox15.setPadding(new Insets(10));
        cslBox15.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox15.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox16 = new VBox(20, trdnlImg16,priceLabel16, Button16);
        gridPane.add(cslBox16, 3, 3);
        cslBox16.setPadding(new Insets(10));
        cslBox16.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox16.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox17 = new VBox(20, trdnlImg17, priceLabel17,Button17);
        gridPane.add(cslBox17, 0, 4);
        cslBox17.setPadding(new Insets(10));
        cslBox17.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox17.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox18 = new VBox(20, trdnlImg18,priceLabel18, Button18);
        gridPane.add(cslBox18, 1, 4);
        cslBox18.setPadding(new Insets(10));
        cslBox18.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox18.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox19 = new VBox(20, trdnlImg19,priceLabel19, Button19);
        gridPane.add(cslBox19, 2, 4);
        cslBox19.setPadding(new Insets(10));
        cslBox19.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox19.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox20 = new VBox(20, trdnlImg20, priceLabel20,Button20);
        gridPane.add(cslBox20, 3, 4);
        cslBox20.setPadding(new Insets(10));
        cslBox20.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox20.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox21 = new VBox(20, trdnlImg21, priceLabel21,Button21);
        gridPane.add(cslBox21, 0, 5);
        cslBox21.setPadding(new Insets(10));
        cslBox21.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox21.setEffect(new DropShadow(5, Color.GREENYELLOW));

        

        VBox cslBox22 = new VBox(20, trdnlImg22,priceLabel22, Button20);
        gridPane.add(cslBox22, 1, 5);
        cslBox22.setPadding(new Insets(10));
        cslBox22.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox22.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox23 = new VBox(20, trdnlImg22,priceLabel23, Button23);
        gridPane.add(cslBox23, 2, 5);
        cslBox23.setPadding(new Insets(10));
        cslBox23.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox23.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox24 = new VBox(20, trdnlImg24,priceLabel24, Button24);
        gridPane.add(cslBox24, 3, 5);
        cslBox24.setPadding(new Insets(10));
        cslBox24.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox24.setEffect(new DropShadow(5, Color.GREENYELLOW));
        


        
        ScrollPane scrollPane = new ScrollPane(gridPane);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);
        
       
        // Back button to navigate back to the male or female section
        Button backButton = new Button("Back");
        backButton.setOnAction(event -> stage.setScene(femaleSectionPage.getScene()));
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
    



