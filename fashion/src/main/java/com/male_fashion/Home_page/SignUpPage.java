package com.male_fashion.Home_page;




import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SignUpPage extends Application {

    private static final int SCENE_WIDTH = 300;
    private static final int SCENE_HEIGHT = 600;


    private static final String USERS_FILE = "users.txt";

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sign Up");

        VBox vbox = new VBox(10);
        vbox.setPadding(new javafx.geometry.Insets(15, 25, 25, 25));

        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();
       
        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
       
        Label confirmPasswordLabel = new Label("Confirm Password:");
        PasswordField confirmPasswordField = new PasswordField();
       
        Button signUpButton = new Button("Sign Up");
        Button backToLoginButton = new Button("Back to Login");

        signUpButton.setOnAction(e -> handleSignUp(usernameField, passwordField, confirmPasswordField));
        backToLoginButton.setOnAction(e -> switchToLoginPage(primaryStage));

        vbox.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField, confirmPasswordLabel, confirmPasswordField, signUpButton, backToLoginButton);

        Scene scene = new Scene(vbox, SCENE_WIDTH, SCENE_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleSignUp(TextField usernameField, PasswordField passwordField, PasswordField confirmPasswordField) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (username.isEmpty() || password.isEmpty() || !password.equals(confirmPassword)) {
            showAlert(Alert.AlertType.ERROR, "Sign Up Error", "Please fill in all fields and make sure passwords match.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USERS_FILE, true))) {
            writer.write(username + ":" + password);
            writer.newLine();
        } catch (IOException e) {
            showAlert(Alert.AlertType.ERROR, "Sign Up Error", "An error occurred while saving your data.");
            e.printStackTrace();
            return;
        }

        showAlert(Alert.AlertType.INFORMATION, "Sign Up Successful", "You can now log in.");
        switchToLoginPage((Stage) usernameField.getScene().getWindow());
    }

    private void switchToLoginPage(Stage stage) {
        LoginPage loginPage = new LoginPage();
        try {
            loginPage.start(stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
