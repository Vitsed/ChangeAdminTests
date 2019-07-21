package com.vitsed.myWork.authorization;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AuthorizationController {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField password_field;

    @FXML
    private TextField login_field;

    @FXML
    private Button authSignUpButton;

    @FXML
    private Button enterBtn;

    @FXML
    void initialize() {
        authSignUpButton.setOnAction(event -> {
            System.out.println("You pressed enter button");
        });
    }
}