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

public class ColorSelectionPage {

    
    private Scene scene;
    private Stage stage;
    @SuppressWarnings("unused")
    private Scene previouScene;

    @SuppressWarnings("unused")
    private Selection selectedColor;
   
    static AnchorPane apane;

    private static final int SCENE_WIDTH = 1008;
    private static final int SCENE_HEIGHT = 600;


    public ColorSelectionPage(Stage stage, Scene previouScene){
        this.stage = stage;
        this.previouScene = previouScene;
        initView(previouScene);
    }
   
    public void initView(Scene previouScene) {
        

        Label label = new Label("Colors");
        label.setFont(Font.font("Georgia", FontWeight.BOLD, 25));
        label.setTextFill(Color.WHITE);
        label.setPadding(new Insets(20));
        label.setStyle("-fx-background-color:black; -fx-background-radius: 10;");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setHgap(20);
        gridPane.setVgap(20);
        gridPane.setAlignment(Pos.CENTER);

        Label priceLabel1 = new Label("Price - 200");
        Label priceLabel2 = new Label("Price - 200");
        Label priceLabel3 = new Label("Price - 200");
        Label priceLabel4 = new Label("Price - 200");
        Label priceLabel5 = new Label("Price - 200");
        Label priceLabel6 = new Label("Price - 200");
        Label priceLabel7 = new Label("Price - 200");
        Label priceLabel8 = new Label("Price - 200");
        Label priceLabel9 = new Label("Price - 200");
        Label priceLabel10 = new Label("Price - 200");
        Label priceLabel11 = new Label("Price - 200");
        Label priceLabel12 = new Label("Price - 200");
        Label priceLabel13 = new Label("Price - 200");
        Label priceLabel14 = new Label("Price - 200");
        Label priceLabel15 = new Label("Price - 200");
        Label priceLabel16 = new Label("Price - 200");
        Label priceLabel17 = new Label("Price - 200");
        Label priceLabel18 = new Label("Price - 200");
        Label priceLabel19 = new Label("Price - 200");
        Label priceLabel20 = new Label("Price - 200");
        Label priceLabel21 = new Label("Price - 200");
        Label priceLabel22 = new Label("Price - 200");
        Label priceLabel23 = new Label("Price - 200");
        Label priceLabel24 = new Label("Price - 200");


        Label lb1=new Label("RED");
        lb1.setFont(new Font(30));
        lb1.setTextFill(Color.BLACK);

        Image ig1=new Image("/C_images/red ig1.jpg");
        ImageView colourfbcImg1=new ImageView(ig1);
        colourfbcImg1.setFitWidth(200);
        colourfbcImg1.setFitHeight(200);

        Label lb2=new Label("BLUE");
        lb2.setFont(new Font(30));
        lb2.setTextFill(Color.BLACK);

        Image ig2=new Image("/C_images/blue ig 2.jpg");
        ImageView colourfbcImg2=new ImageView(ig2);
        colourfbcImg2.setFitWidth(200);
        colourfbcImg2.setFitHeight(200); 

        Label lb3=new Label("YELLOW");
        lb3.setFont(new Font(30));
        lb3.setTextFill(Color.BLACK);

        Image ig3=new Image("/C_images/yellow ig3.jpg");
        ImageView colourfbcImg3=new ImageView(ig3);
        colourfbcImg3.setFitWidth(200);
        colourfbcImg3.setFitHeight(200);

        Label lb4=new Label("BRIGHT PINK");
        lb4.setFont(new Font(30));
        lb4.setTextFill(Color.BLACK);

        Image ig4=new Image("/C_images/bright pink ig4.....jpg");
        ImageView colourfbcImg4=new ImageView(ig4);
        colourfbcImg4.setFitWidth(200);
        colourfbcImg4.setFitHeight(200);

        Label lb5=new Label("ORANGE");
        lb5.setFont(new Font(30));
        lb5.setTextFill(Color.BLACK);

        Image ig5=new Image("/C_images/orange ig5.jpg");
        ImageView colourfbcImg5=new ImageView(ig5);
        colourfbcImg5.setFitWidth(200);
        colourfbcImg5.setFitHeight(200);

        Label lb6=new Label("MAROON");
        lb6.setFont(new Font(30));
        lb6.setTextFill(Color.BLACK);

        Image ig6=new Image("/C_images/maroon ig6.jpg");
        ImageView colourfbcImg6=new ImageView(ig6);
        colourfbcImg6.setFitWidth(200);
        colourfbcImg6.setFitHeight(200);

        Label lb7=new Label("GREEN");
        lb7.setFont(new Font(30));
        lb7.setTextFill(Color.BLACK);

        Image ig7=new Image("/C_images/green ig7.png");
        ImageView colourfbcImg7=new ImageView(ig7);
        colourfbcImg7.setFitWidth(200);
        colourfbcImg7.setFitHeight(200);

        Label lb8=new Label("PEACOCK BLUE");
        lb8.setFont(new Font(30));
        lb8.setTextFill(Color.BLACK);

        Image ig8=new Image("/C_images/peacock blue ig8.png");
        ImageView colourfbcImg8=new ImageView(ig8);
        colourfbcImg8.setFitWidth(200);
        colourfbcImg8.setFitHeight(200);

        Label lb9=new Label("PEACH");
        lb9.setFont(new Font(30));
        lb9.setTextFill(Color.BLACK);
        

        Image ig9=new Image("/C_images/peach ig9.jpg");
        ImageView colourfbcImg9=new ImageView(ig9);
        colourfbcImg9.setFitWidth(200);
        colourfbcImg9.setFitHeight(200);

        Label lb10=new Label("PURPLE");
        lb10.setFont(new Font(30));
        lb10.setTextFill(Color.BLACK);

        Image ig10=new Image("/C_images/purple ig10.jpg");
        ImageView colourfbcImg10=new ImageView(ig10);
        colourfbcImg10.setFitWidth(200);
        colourfbcImg10.setFitHeight(200);

        Label lb11=new Label("WHITE");
        lb11.setFont(new Font(30));
        lb11.setTextFill(Color.BLACK);

        Image ig11=new Image("/C_images/white ig11...jpg");
        ImageView colourfbcImg11=new ImageView(ig11);
        colourfbcImg11.setFitWidth(200);
        colourfbcImg11.setFitHeight(200);

        Label lb12=new Label("LAVENDER");
        lb12.setFont(new Font(30));
        lb12.setTextFill(Color.BLACK);

        Image ig12=new Image("/C_images/lavender ig12.jpg");
        ImageView colourfbcImg12=new ImageView(ig12);
        colourfbcImg12.setFitWidth(200);
        colourfbcImg12.setFitHeight(200);

        Label lb13=new Label("BLACK");
        lb13.setFont(new Font(30));
        lb13.setTextFill(Color.BLACK);

        Image ig13=new Image("/C_images/black ig13.jpg");
        ImageView colourfbcImg13=new ImageView(ig13);
        colourfbcImg13.setFitWidth(200);
        colourfbcImg13.setFitHeight(200);

        Label lb14=new Label("LIGHT PINK");
        lb14.setFont(new Font(30));
        lb14.setTextFill(Color.BLACK);

        Image ig14=new Image("/C_images/light pink ig14.jpg");
        ImageView colourfbcImg14=new ImageView(ig14);
        colourfbcImg14.setFitWidth(200);
        colourfbcImg14.setFitHeight(200);

        Label lb15=new Label("BROWN");
        lb15.setFont(new Font(30));
        lb15.setTextFill(Color.BLACK);

        Image ig15=new Image("/C_images/brown ig15...jpg");
        ImageView colourfbcImg15=new ImageView(ig15);
        colourfbcImg15.setFitWidth(200);
        colourfbcImg15.setFitHeight(200);

        Label lb16=new Label("GREY");
        lb16.setFont(new Font(30));
        lb16.setTextFill(Color.BLACK);

        Image ig16=new Image("/C_images/grey ig16.png");
        ImageView colourfbcImg16=new ImageView(ig16);
        colourfbcImg16.setFitWidth(200);
        colourfbcImg16.setFitHeight(200);

        Label lb17=new Label("ROYAL BLUE");
        lb17.setFont(new Font(30));
        lb17.setTextFill(Color.BLACK);

        Image ig17=new Image("/C_images/royal blue ig17.jpg");
        ImageView colourfbcImg17=new ImageView(ig17);
        colourfbcImg17.setFitWidth(200);
        colourfbcImg17.setFitHeight(200);

        Label lb18=new Label("SWEET YELLOW");
        lb18.setFont(new Font(30));
        lb18.setTextFill(Color.BLACK);

        Image ig18=new Image("/C_images/sweet yellow ig 18.jpg");
        ImageView colourfbcImg18=new ImageView(ig18);
        colourfbcImg18.setFitWidth(200);
        colourfbcImg18.setFitHeight(200);

        Label lb19=new Label("SKY BLUE");
        lb19.setFont(new Font(30));
        lb19.setTextFill(Color.BLACK);

        Image ig19=new Image("/C_images/sky blue ig 19.jpg");
        ImageView colourfbcImg19=new ImageView(ig19);
        colourfbcImg19.setFitWidth(200);
        colourfbcImg19.setFitHeight(200);

        Label lb20=new Label("CREAM");
        lb20.setFont(new Font(30));
        lb20.setTextFill(Color.BLACK);

        Image ig20=new Image("/C_images/cream ig 20.jpg");
        ImageView colourfbcImg20=new ImageView(ig20);
        colourfbcImg20.setFitWidth(200);
        colourfbcImg20.setFitHeight(200);

        Label lb21=new Label("MAGENTA");
        lb21.setFont(new Font(30));
        lb21.setTextFill(Color.BLACK);

        Image ig21=new Image("/C_images/magenta ig 21.jpg");
        ImageView colourfbcImg21=new ImageView(ig21);
        colourfbcImg21.setFitWidth(200);
        colourfbcImg21.setFitHeight(200);

        Label lb22=new Label("PARROT GREEN");
        lb22.setFont(new Font(30));
        lb22.setTextFill(Color.BLACK);

        Image ig22=new Image("/C_images/Parrot greeen ig22.png");
        ImageView colourfbcImg22=new ImageView(ig22);
        colourfbcImg22.setFitWidth(200);
        colourfbcImg22.setFitHeight(200);

        Label lb23=new Label("MEHANDI");
        lb23.setFont(new Font(30));
        lb23.setTextFill(Color.BLACK);

        Image ig23=new Image("/C_images/mehandi ig23.jpg");
        ImageView colourfbcImg23=new ImageView(ig23);
        colourfbcImg23.setFitWidth(200);
        colourfbcImg23.setFitHeight(200);

        Label lb24=new Label("DARK BROWN");
        lb24.setFont(new Font(30));
        lb24.setTextFill(Color.BLACK);

        Image ig24=new Image("/C_images/dark brown ig24.jpg");
        ImageView colourfbcImg24=new ImageView(ig24);
        colourfbcImg24.setFitWidth(200);
        colourfbcImg24.setFitHeight(200);

        

        
        Button Button1=new Button("Select");
        Button1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                selectedColor = new Selection(colourfbcImg1, lb1.getText(), 500);
                //App.setSelectedColor(lb1,200);
                Button1.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );
                //Button1.setOnAction(e -> stage.setScene(new OrderSummaryPage(stage, scene).getScene()));
            
            }
            
        }); 

        Button Button2=new Button("Select");
        Button2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb2.getText(),200);
                Button2.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button3=new Button("Select");
        Button3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb3.getText(),200);
                Button3.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button4=new Button("Select");
        Button4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb4.getText(),200);
                Button4.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button5=new Button("Select");
        Button5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb5.getText(),200);
                Button5.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button6=new Button("Select");
        Button6.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb6.getText(),200);
                Button6.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button7=new Button("Select");
        Button7.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb7.getText(),200);
                Button7.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button8=new Button("Select");
        Button8.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb8.getText(),200);
                Button8.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button9=new Button("Select");
        Button9.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb9.getText(),200);
                Button9.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button10=new Button("Select");
        Button10.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb10.getText(),200);
                Button10.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button11=new Button("Select");
        Button11.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb11.getText(),200);
                Button11.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button12=new Button("Select");
        Button12.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb12.getText(),200);
                Button12.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button13=new Button("Select");
        Button13.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb13.getText(),200);
                Button13.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });


        Button Button14=new Button("Select");
        Button14.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb14.getText(),200);
                Button14.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button15=new Button("Select");
        Button15.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb15.getText(),200);
                Button15.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button16=new Button("Select");
        Button16.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb16.getText(),200);
                Button16.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button17=new Button("Select");
        Button17.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb17.getText(),200);
                Button17.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button18=new Button("Select");
        Button18.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb18.getText(),200);
                Button18.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button19=new Button("Select");
        Button19.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb19.getText(),200);
                Button19.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button20=new Button("Select");
        Button20.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb20.getText(),200);
                Button20.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button21=new Button("Select");
        Button21.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb21.getText(),200);
                Button21.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button22=new Button("Select");
        Button22.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb22.getText(),200);
                Button22.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button23=new Button("Select");
        Button23.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb23.getText(),200);
                Button23.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        Button Button24=new Button("Select");
        Button24.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                App.setSelectedColor(lb24.getText(),200);
                Button24.setOnAction(e -> stage.setScene(new MeasurementOptionPage(stage, scene).getScene()) );


            }
            
        });

        
        VBox cslBox1 = new VBox(20, lb1,colourfbcImg1,priceLabel1, Button1);
        gridPane.add(cslBox1, 0, 0);
        cslBox1.setPadding(new Insets(10));
        cslBox1.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox1.setEffect(new DropShadow(5, Color.GREENYELLOW));

        VBox cslBox2 = new VBox(20,lb2, colourfbcImg2,priceLabel2, Button2);
        gridPane.add(cslBox2, 1, 0);
        cslBox2.setPadding(new Insets(10));
        cslBox2.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox2.setEffect(new DropShadow(5, Color.GREENYELLOW));



        VBox cslBox3 = new VBox(20,lb3, colourfbcImg3,priceLabel3, Button3);
        gridPane.add(cslBox3, 2, 0);
        cslBox3.setPadding(new Insets(10));
        cslBox3.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox3.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox4 = new VBox(20,lb4, colourfbcImg4,priceLabel4, Button4);
        gridPane.add(cslBox4, 3, 0);
        cslBox4.setPadding(new Insets(10));
        cslBox4.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox4.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox5 = new VBox(20,lb5, colourfbcImg5, priceLabel5,Button5);
        gridPane.add(cslBox5, 0, 1);
        cslBox5.setPadding(new Insets(10));
        cslBox5.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox5.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox6 = new VBox(20,lb6, colourfbcImg6,priceLabel6, Button6);
        gridPane.add(cslBox6, 1, 1);
        cslBox6.setPadding(new Insets(10));
        cslBox6.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox6.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox7 = new VBox(20,lb7, colourfbcImg7,priceLabel7, Button7);
        gridPane.add(cslBox7, 2, 1);
        cslBox7.setPadding(new Insets(10));
        cslBox7.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox7.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox8 = new VBox(20,lb8, colourfbcImg8,priceLabel8, Button8);
        gridPane.add(cslBox8, 3, 1);
        cslBox8.setPadding(new Insets(10));
        cslBox8.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox8.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox9 = new VBox(20, lb9,colourfbcImg9,priceLabel9, Button9);
        gridPane.add(cslBox9, 0, 2);
        cslBox9.setPadding(new Insets(10));
        cslBox9.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox9.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox10 = new VBox(20,lb10, colourfbcImg10,priceLabel10, Button10);
        gridPane.add(cslBox10, 1, 2);
        cslBox10.setPadding(new Insets(10));
        cslBox10.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox10.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox11 = new VBox(20, lb11,colourfbcImg11,priceLabel11, Button11);
        gridPane.add(cslBox11, 2, 2);
        cslBox11.setPadding(new Insets(10));
        cslBox11.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox11.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox12 = new VBox(20, lb12,colourfbcImg12,priceLabel12, Button12);
        gridPane.add(cslBox12, 3, 2);
        cslBox12.setPadding(new Insets(10));
        cslBox12.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox12.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox13 = new VBox(20, lb13,colourfbcImg13,priceLabel13, Button13);
        gridPane.add(cslBox13, 0, 3);
        cslBox13.setPadding(new Insets(10));
        cslBox13.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox13.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox14 = new VBox(20, lb14,colourfbcImg14,priceLabel14, Button14);
        gridPane.add(cslBox14, 1, 3);
        cslBox14.setPadding(new Insets(10));
        cslBox14.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox14.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox15 = new VBox(20,lb15, colourfbcImg15,priceLabel15, Button15);
        gridPane.add(cslBox15, 2, 3);
        cslBox15.setPadding(new Insets(10));
        cslBox15.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox15.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox16 = new VBox(20, lb16,colourfbcImg16,priceLabel16, Button16);
        gridPane.add(cslBox16, 3, 3);
        cslBox16.setPadding(new Insets(10));
        cslBox16.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox16.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox17 = new VBox(20, lb17,colourfbcImg17,priceLabel17, Button17);
        gridPane.add(cslBox17, 0, 4);
        cslBox17.setPadding(new Insets(10));
        cslBox17.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox17.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox18 = new VBox(20, lb18,colourfbcImg18,priceLabel18, Button18);
        gridPane.add(cslBox18, 1, 4);
        cslBox18.setPadding(new Insets(10));
        cslBox18.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox18.setEffect(new DropShadow(5, Color.GREENYELLOW));

        VBox cslBox19 = new VBox(20, lb19,colourfbcImg19,priceLabel19, Button19);
        gridPane.add(cslBox19, 0, 0);
        cslBox19.setPadding(new Insets(10));
        cslBox19.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox19.setEffect(new DropShadow(5, Color.GREENYELLOW));

        VBox cslBox20 = new VBox(20,lb20, colourfbcImg20,priceLabel20, Button20);
        gridPane.add(cslBox20, 1, 0);
        cslBox20.setPadding(new Insets(10));
        cslBox20.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox20.setEffect(new DropShadow(5, Color.GREENYELLOW));



        VBox cslBox21 = new VBox(20,lb21, colourfbcImg21,priceLabel21, Button21);
        gridPane.add(cslBox21, 2, 0);
        cslBox21.setPadding(new Insets(10));
        cslBox21.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox21.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox22 = new VBox(20,lb22, colourfbcImg22,priceLabel22, Button22);
        gridPane.add(cslBox22, 3, 0);
        cslBox22.setPadding(new Insets(10));
        cslBox22.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox22.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox23 = new VBox(20,lb23, colourfbcImg23, priceLabel23,Button23);
        gridPane.add(cslBox23, 0, 1);
        cslBox23.setPadding(new Insets(10));
        cslBox23.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox23.setEffect(new DropShadow(5, Color.GREENYELLOW));


        
        VBox cslBox24 = new VBox(20,lb24, colourfbcImg24,priceLabel24, Button24);
        gridPane.add(cslBox24, 1, 1);
        cslBox24.setPadding(new Insets(10));
        cslBox24.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(10),Insets.EMPTY)));
        cslBox24.setEffect(new DropShadow(5, Color.GREENYELLOW));




        
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
    


    






