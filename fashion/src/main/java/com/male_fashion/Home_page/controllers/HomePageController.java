package com.male_fashion.Home_page.controllers;

import com.male_fashion.Home_page.FemaleSectionPage;
import com.male_fashion.Home_page.Homepage;
import com.male_fashion.Home_page.MaleSectionPage;

//import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomePageController {
    private Homepage homepage;

    public HomePageController(Homepage homepage){
        this.homepage = homepage;
    }

    public void handleGenderSelection(String gender){
        Stage stage = homepage.getStage();
        if(gender.equals("Male")){
            MaleSectionPage maleSectionPage = new  MaleSectionPage(stage,homepage);
            stage.setScene(maleSectionPage.getScene());
        }else{
            FemaleSectionPage femaleSectionPage = new FemaleSectionPage(stage,homepage);
            stage.setScene(femaleSectionPage.getScene());
        }

        
    }
    
}
