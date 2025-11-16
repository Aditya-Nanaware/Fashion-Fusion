package com.male_fashion.Home_page;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LoginPage extends Application {

    private static final int SCENE_WIDTH = 300;
    private static final int SCENE_HEIGHT = 600;


    private static final String USERS_FILE = "users.txt";

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login");

        VBox vbox = new VBox(10);
        vbox.setPadding(new javafx.geometry.Insets(15, 25, 25, 25));

        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();
        
       
        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
       
        Button loginButton = new Button("Login");
        Button signUpButton = new Button("Sign Up");

        loginButton.setOnAction(e -> handleLogin(usernameField, passwordField, primaryStage));
        signUpButton.setOnAction(e -> switchToSignUpPage(primaryStage));

        vbox.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField, loginButton, signUpButton);

        Scene scene = new Scene(vbox, SCENE_WIDTH, SCENE_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleLogin(TextField usernameField, PasswordField passwordField, Stage stage) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Login Error", "Please fill in all fields.");
            return;
        }

        if (isValidUser(username, password)) {
            navigateToHomePage(stage);
        } else {
            showAlert(Alert.AlertType.ERROR, "Login Error", "Invalid username or password.");
        }
    }

    private void switchToSignUpPage(Stage stage) {
        SignUpPage signUpPage = new SignUpPage();
        try {
            signUpPage.start(stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void navigateToHomePage(Stage stage) {
        Homepage homepage = new Homepage(stage);
        try {
            stage.setScene(homepage.getScene());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isValidUser(String username, String password) {
        Map<String, String> users = readUsersFromFile();
        return users.containsKey(username) && users.get(username).equals(password);
    }

    private Map<String, String> readUsersFromFile() {
        Map<String, String> users = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(USERS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    users.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return users;
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
