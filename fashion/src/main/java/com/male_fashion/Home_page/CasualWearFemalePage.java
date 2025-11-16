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

public class CasualWearFemalePage{

    private Scene scene;
    private Stage stage;
    private FemaleSectionPage femaleSectionPage;
    static AnchorPane apane;

    private static final int SCENE_WIDTH = 1008;
    private static final int SCENE_HEIGHT = 600;

    public CasualWearFemalePage(Stage stage, FemaleSectionPage femaleSectionPage) {
        this.stage = stage;
        this.femaleSectionPage = femaleSectionPage;
        initView();
    }
   


   
    private void initView()   {

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

        
        Image ig1=new Image("/W_images/img1.jpg");
        ImageView wstrnImg1=new ImageView(ig1);
        wstrnImg1.setFitWidth(200);
        wstrnImg1.setFitHeight(200);

        Image ig2=new Image("/W_images/img2.jpg");
        ImageView wstrnImg2=new ImageView(ig2);
        wstrnImg2.setFitWidth(200);
        wstrnImg2.setFitHeight(200);

        Image ig3=new Image("/W_images/img3.jpg");
        ImageView wstrnImg3=new ImageView(ig3);
        wstrnImg3.setFitWidth(200);
        wstrnImg3.setFitHeight(200);

        Image ig4=new Image("/W_images/img4.jpg");
        ImageView wstrnImg4=new ImageView(ig4);
        wstrnImg4.setFitWidth(200);
        wstrnImg4.setFitHeight(200);

        Image ig5=new Image("/W_images/img5.jpg");
        ImageView wstrnImg5=new ImageView(ig5);
        wstrnImg5.setFitWidth(200);
        wstrnImg5.setFitHeight(200);

        Image ig6=new Image("/W_images/img6.jpg");
        ImageView wstrnImg6=new ImageView(ig6);
        wstrnImg6.setFitWidth(200);
        wstrnImg6.setFitHeight(200);

        Image ig7=new Image("/W_images/img7.jpg");
        ImageView wstrnImg7=new ImageView(ig7);
        wstrnImg7.setFitWidth(200);
        wstrnImg7.setFitHeight(200);

        Image ig8=new Image("/W_images/img8.jpeg");
        ImageView wstrnImg8=new ImageView(ig8);
        wstrnImg8.setFitWidth(200);
        wstrnImg8.setFitHeight(200);
        

        Image ig9=new Image("/W_images/img9.jpg");
        ImageView wstrnImg9=new ImageView(ig9);
        wstrnImg9.setFitWidth(200);
        wstrnImg9.setFitHeight(200);

        Image ig10=new Image("/W_images/img10.jpg");
        ImageView wstrnImg10=new ImageView(ig10);
        wstrnImg10.setFitWidth(200);
        wstrnImg10.setFitHeight(200);

        Image ig11=new Image("/W_images/img11.jpg");
        ImageView wstrnImg11=new ImageView(ig11);
        wstrnImg11.setFitWidth(200);
        wstrnImg11.setFitHeight(200);

        Image ig12=new Image("/W_images/img12.jpg");
        ImageView wstrnImg12=new ImageView(ig12);
        wstrnImg12.setFitWidth(200);
        wstrnImg12.setFitHeight(200);

        Image ig13=new Image("/W_images/img13.jpg");
        ImageView wstrnImg13=new ImageView(ig13);
        wstrnImg13.setFitWidth(200);
        wstrnImg13.setFitHeight(200);

        Image ig14=new Image("/W_images/img14.jpg");
        ImageView wstrnImg14=new ImageView(ig14);
        wstrnImg14.setFitWidth(200);
        wstrnImg14.setFitHeight(200);

        Image ig15=new Image("/W_images/img15.jpg");
        ImageView wstrnImg15=new ImageView(ig15);
        wstrnImg15.setFitWidth(200);
        wstrnImg15.setFitHeight(200);

        Image ig16=new Image("/W_images/img16.jpeg");
        ImageView wstrnImg16=new ImageView(ig16);
        wstrnImg16.setFitWidth(200);
        wstrnImg16.setFitHeight(200);

        Image ig17=new Image("/W_images/img17.jpg");
        ImageView wstrnImg17=new ImageView(ig17);
        wstrnImg17.setFitWidth(200);
        wstrnImg17.setFitHeight(200);

        Image ig18=new Image("/W_images/img18.jpg");
        ImageView wstrnImg18=new ImageView(ig18);
        wstrnImg18.setFitWidth(200);
        wstrnImg18.setFitHeight(200);

        Image ig19=new Image("/W_images/img19.jpg");
        ImageView wstrnImg19=new ImageView(ig19);
        wstrnImg19.setFitWidth(200);
        wstrnImg19.setFitHeight(200);

    

        Image ig20=new Image("/W_images/img20.jpg");
        ImageView wstrnImg20=new ImageView(ig20);
        wstrnImg20.setFitWidth(200);
        wstrnImg20.setFitHeight(200);


        Image ig21=new Image("/W_images/img21.jpg");
        ImageView wstrnImg21=new ImageView(ig21);
        wstrnImg21.setFitWidth(200);
        wstrnImg21.setFitHeight(200);


        Image ig22=new Image("/W_images/img22.jpg");
        ImageView wstrnImg22=new ImageView(ig22);
        wstrnImg22.setFitWidth(200);
        wstrnImg22.setFitHeight(200);


        Image ig23=new Image("/W_images/img23.jpg");
        ImageView wstrnImg23=new ImageView(ig23);
        wstrnImg23.setFitWidth(200);
        wstrnImg23.setFitHeight(200);

        Image ig24=new Image("/W_images/img24.jpg");
        ImageView wstrnImg24=new ImageView(ig24);
        wstrnImg24.setFitWidth(200);
        wstrnImg24.setFitHeight(200);

        Button Button1=new Button("Select");
        Button1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",500);
              Button1.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );

            }
            
        });

        Button Button2=new Button("Select");
        Button2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",400);
                Button2.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );

            }
            
        });

        Button Button3=new Button("Select");
        Button3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",600);
                Button3.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button4=new Button("Select");
        Button4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",700);
                Button4.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button5=new Button("Select");
        Button5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",500);
                Button5.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button6=new Button("Select");
        Button6.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",700);
                Button6.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button7=new Button("Select");
        Button7.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",800);
                Button7.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button8=new Button("Select");
        Button8.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",450);
                Button8.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button9=new Button("Select");
        Button9.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",700);
                Button9.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button10=new Button("Select");
        Button10.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",600);
                Button10.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button11=new Button("Select");
        Button11.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",500);
                Button11.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button12=new Button("Select");
        Button12.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",600);
                Button12.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button13=new Button("Select");
        Button13.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",500);
                Button13.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });


        Button Button14=new Button("Select");
        Button14.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",700);
                Button14.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });


        Button Button15=new Button("Select");
        Button15.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",700);
                Button15.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });


        Button Button16=new Button("Select");
        Button16.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",700);
                Button16.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });


        Button Button17=new Button("Select");
        Button17.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",700);
                Button17.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });



        Button Button18=new Button("Select");
        Button18.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",500);
                Button18.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });



        Button Button19=new Button("Select");
        Button19.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",600);
                Button19.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button20=new Button("Select");
        Button20.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",600);
                Button20.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button21=new Button("Select");
        Button21.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",600);
                Button21.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button22=new Button("Select");
        Button22.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",700);
                Button22.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button23=new Button("Select");
        Button23.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",600);
                Button23.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button24=new Button("Select");
        Button24.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedClothing("Casual Wear ",500);
                Button24.setOnAction(e -> stage.setScene(new FabricSelectionPage(stage, scene).getScene()) );


            }
            
        });
       

        VBox cslBox1 = new VBox(20, wstrnImg1,priceLabel1, Button1);
        gridPane.add(cslBox1, 0, 0);
        cslBox1.setPadding(new Insets(10));
        cslBox1.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox1.setEffect(new DropShadow(5, Color.GREENYELLOW));
        

        VBox cslBox2 = new VBox(20, wstrnImg2,priceLabel2, Button2);
        gridPane.add(cslBox2, 1, 0);
        cslBox2.setPadding(new Insets(10));
        cslBox2.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox2.setEffect(new DropShadow(5, Color.GREENYELLOW));


        VBox cslBox3 = new VBox(20, wstrnImg3, priceLabel3,Button3);
        gridPane.add(cslBox3, 2, 0);
        cslBox3.setPadding(new Insets(10));
        cslBox3.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox3.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox4 = new VBox(20, wstrnImg4,priceLabel4, Button4);
        gridPane.add(cslBox4, 3, 0);
        cslBox4.setPadding(new Insets(10));
        cslBox4.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox4.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox5 = new VBox(20, wstrnImg5,priceLabel5, Button5);
        gridPane.add(cslBox5, 0, 1);
        cslBox5.setPadding(new Insets(10));
        cslBox5.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox5.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox6 = new VBox(20, wstrnImg6, priceLabel6,Button6);
        gridPane.add(cslBox6, 1, 1);
        cslBox6.setPadding(new Insets(10));
        cslBox6.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox6.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox7 = new VBox(20, wstrnImg7,priceLabel7, Button7);
        gridPane.add(cslBox7, 2, 1);
        cslBox7.setPadding(new Insets(10));
        cslBox7.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox7.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox8 = new VBox(20, wstrnImg8, priceLabel8,Button8);
        gridPane.add(cslBox8, 3, 1);
        cslBox8.setPadding(new Insets(10));
        cslBox8.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox8.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox9 = new VBox(20, wstrnImg9, priceLabel9,Button9);
        gridPane.add(cslBox9, 0, 2);
        cslBox9.setPadding(new Insets(10));
        cslBox9.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox9.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox10 = new VBox(20, wstrnImg10,priceLabel10, Button10);
        gridPane.add(cslBox10, 1, 2);
        cslBox10.setPadding(new Insets(10));
        cslBox10.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox10.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox11 = new VBox(20, wstrnImg11,priceLabel11, Button11);
        gridPane.add(cslBox11, 2, 2);
        cslBox11.setPadding(new Insets(10));
        cslBox11.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox11.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox12 = new VBox(20, wstrnImg12,priceLabel12, Button12);
        gridPane.add(cslBox12, 3, 2);
        cslBox12.setPadding(new Insets(10));
        cslBox12.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox12.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox13 = new VBox(20, wstrnImg13, priceLabel13,Button13);
        gridPane.add(cslBox13, 0, 3);
        cslBox13.setPadding(new Insets(10));
        cslBox13.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox13.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox14 = new VBox(20, wstrnImg14,priceLabel14,Button14);
        gridPane.add(cslBox14, 1, 3);
        cslBox14.setPadding(new Insets(10));
        cslBox14.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox14.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox15 = new VBox(20, wstrnImg15, priceLabel15,Button15);
        gridPane.add(cslBox15, 2, 3);
        cslBox15.setPadding(new Insets(10));
        cslBox15.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox15.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox16 = new VBox(20, wstrnImg16,priceLabel16, Button16);
        gridPane.add(cslBox16, 3, 3);
        cslBox16.setPadding(new Insets(10));
        cslBox16.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox16.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox17 = new VBox(20, wstrnImg17, priceLabel17,Button17);
        gridPane.add(cslBox17, 0, 4);
        cslBox17.setPadding(new Insets(10));
        cslBox17.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox17.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox18 = new VBox(20, wstrnImg18,priceLabel18, Button18);
        gridPane.add(cslBox18, 1, 4);
        cslBox18.setPadding(new Insets(10));
        cslBox18.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox18.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox19 = new VBox(20, wstrnImg19,priceLabel19, Button19);
        gridPane.add(cslBox19, 2, 4);
        cslBox19.setPadding(new Insets(10));
        cslBox19.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox19.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox20 = new VBox(20, wstrnImg20, priceLabel20,Button20);
        gridPane.add(cslBox20, 3, 4);
        cslBox20.setPadding(new Insets(10));
        cslBox20.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox20.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox21 = new VBox(20, wstrnImg21, priceLabel21,Button21);
        gridPane.add(cslBox21, 0, 5);
        cslBox21.setPadding(new Insets(10));
        cslBox21.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox21.setEffect(new DropShadow(5, Color.GREENYELLOW));

        

        VBox cslBox22 = new VBox(20, wstrnImg22,priceLabel22, Button20);
        gridPane.add(cslBox22, 1, 5);
        cslBox22.setPadding(new Insets(10));
        cslBox22.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox22.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox23 = new VBox(20, wstrnImg23,priceLabel23, Button23);
        gridPane.add(cslBox23, 2, 5);
        cslBox23.setPadding(new Insets(10));
        cslBox23.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox23.setEffect(new DropShadow(5, Color.GREENYELLOW));

        
        VBox cslBox24 = new VBox(20, wstrnImg24,priceLabel24, Button24);
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
    


    



