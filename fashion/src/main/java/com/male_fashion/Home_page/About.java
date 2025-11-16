package com.male_fashion.Home_page;



import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class About{

    private Scene scene;
    @SuppressWarnings("unused")
    private Stage stage;
    @SuppressWarnings("unused")
    private Scene previouScene;

    @SuppressWarnings("unused")
    private Selection selectedColor;
   
    static AnchorPane apane;

    private static final int SCENE_WIDTH = 1008;
    private static final int SCENE_HEIGHT = 600;

/*
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        launch(args);
    } */

    
    public About(Stage stage, Scene previouScene){
        this.stage = stage;
        this.previouScene = previouScene;
        initView(previouScene);
    }
   
    
    public void initView(Scene previouScene) {
     
        Label l1 = new Label("ABOUT US");
        l1.setLayoutX(10);
        l1.setLayoutY(20);
        l1.setFont(Font.font("TYPEWRITER", FontWeight.BOLD, 40));

        Text text = new Text("As we reflect on our journey in learing programing.We cannot help but feel immensely"+
        "geateful your \nguidance,patence,and dedication.your passion for teaching and your expertise"+
        "in the world of coding\n havemade a profound impact om my understanding and growth in this "+
        "field.thank you for investing\n your time and ebergy into nurturing our curiosity and igniting"+
        "our passion for programming.your\n commitment to excellence has inspired its to strive for mastery"+
        "in every line of code we write.\n\n"+
        "Beyond the technical aspects of programmimg.you have also imparted invaluable lessons on perseverance"+
        "resiliepce,\n and collaboration. your emphasis on the impoetance of continuous learning and asaptabillty "+
        "has instilled in us \na growth mindset that we carry with us not only in coding but in all aspects of me "+
        "Thank you SHASHI SIR.\n for being an exceptional educator, mentor,and rol model. Your dedication to "+
        "teaching and your passicn for \nprogramming have made a lastion impact on our me,and for that,we are "+
        "eternally grateful.");
        text.setLayoutX(10);
        text.setLayoutY(90);

        text.setFont(Font.font("TYPEWRITER", FontWeight.BOLD, 25));
        
       Image img1 = new Image("/images/IMG-20240720-WA0000.jpg");
       ImageView iv1=new ImageView(img1);
       iv1.setPreserveRatio(true);
       iv1.setFitHeight(400);
       iv1.setFitWidth(400);
        /*

       Image img2 = new Image("com/hospitall/img/digvijay.jpg");
       ImageView iv2=new ImageView(img2);
       iv2.setPreserveRatio(true);
       iv2.setFitHeight(150);
       iv2.setFitWidth(150);
       
       Image img3 = new Image("com/hospitall/img/siddesh.jpg");
       ImageView iv3=new ImageView(img3);
       iv3.setFitHeight(150);
       iv3.setFitWidth(150);

       Image img4 = new Image("com/hospitall/img/ayan_p.jpg");
       ImageView iv4=new ImageView(img4);
       iv4.setFitHeight(150);
       iv4.setFitWidth(150);

       Image img5 = new Image("com/hospitall/img/sir1.jpg");
       ImageView iv5=new ImageView(img5);
     //  iv5.setFitHeight(200);
      // iv5.setFitWidth(200);
       iv5.setLayoutX(900);
       iv5.setLayoutY(90);
        */
       
        
        Label label1 = new Label("AYUSH MANE");
        label1.setFont(Font.font("TYPEWRITER", FontWeight.BOLD, 23));
        label1.setLayoutX(400);
        label1.setLayoutY(300);
        label1.setTextFill(Color.BLACK);

        Label label2 = new Label("ADITYA NANAWARE");
        label2.setFont(Font.font("TYPEWRITER", FontWeight.BOLD, 23));
        label2.setLayoutX(400);
        label2.setLayoutY(300);
        label2.setTextFill(Color.BLACK);

        Label label3 = new Label("ASMITA KHAMGAL");
        label3.setFont(Font.font("TYPEWRITER", FontWeight.BOLD, 23));
        label3.setLayoutX(400);
        label3.setLayoutY(300);
        label3.setTextFill(Color.BLACK);

        Label label4 = new Label("SAKSHI MAHAMUNI");
        label4.setFont(Font.font("TYPEWRITER", FontWeight.BOLD, 23));
        label4.setLayoutX(400);
        label4.setLayoutY(300);
        label4.setTextFill(Color.BLACK);

        Label team = new Label("TEAM MEMBERS:");
        team.setFont(Font.font("TYPEWRITER", FontWeight.BOLD, 23));
        team.setLayoutX(400);
        team.setLayoutY(300);
        team.setTextFill(Color.BLACK);

        team.setLayoutY(480);
        team.setLayoutX(90);

        


        Text text1 = new Text("Big thanks to : Shashi Sir,\n     Sachin Sir,Pramod Sir"+"\n\n Project Mentor : Shiv sir"); 
        text1.setFont(Font.font("TYPEWRITER", FontWeight.BOLD, 18));
        text1.setLayoutX(570);
        text1.setLayoutY(500);

        iv1.setLayoutX(920);
        iv1.setLayoutY(470);

    
         VBox hb = new VBox(10,label1,label3);
        // hb.setPrefSize(10, 10);
         hb.setLayoutX(90);
         hb.setLayoutY(500);
        
         VBox hp = new VBox(10,label2,label4);
        // hp.setPrefSize(10, 10);
         hp.setLayoutX(320);
         hp.setLayoutY(500);
         

         
        
         Parent gr = new javafx.scene.Group(text,text1,iv1,l1,team,hb,hp);
         scene = new Scene(gr, SCENE_WIDTH, SCENE_HEIGHT);
           // vbox.setStyle("-fx-background-color:PINK");
            scene.setCursor(Cursor.OPEN_HAND);
            scene.setFill(new ImagePattern(new Image("/images/clothes_background.jpeg")));
    
    
            //stage.setScene(scene);
    
            //scene = new Scene(gr, SCENE_WIDTH, SCENE_HEIGHT);
    
            //stage.show();
         
    }   
    public Scene getScene() {
        return scene;
    }

}


