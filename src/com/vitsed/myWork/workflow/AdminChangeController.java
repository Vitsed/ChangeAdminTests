package com.vitsed.myWork.workflow;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminChangeController {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField oldAdminField;

    @FXML
    private TextField newAdminField;

    @FXML
    private TextField loginField;

    @FXML
    private Button sentMailBtn;

    @FXML
    private TextField domainsField;

    @FXML
    private TextField docNumberField;

    @FXML
    private Label currentData;

    @FXML
    private Label emailTextExample;

    @FXML
    private TextField oldAdminEmailField;

    @FXML
    private Button clearBtn;

    @FXML
    private Button addCommentBtn;

    @FXML
    private Button showExampleBtn;

    @FXML
    private TextField newAdminEmailField;

    @FXML
    private Label fieldsLabel;

    @FXML
    private TextArea textArea;

    @FXML
    public void showExampleLetter() {
        String text = "Нами (ООО Регтайм) было получено заявление от (" + oldAdminField.getText() + ") \n" +
                "о смене администратора домен(а)ов: \n\t" + getDomains(domainsField.getText()) + "\n" +
                "Новым администратором является: " + newAdminField.getText();
        textArea.setText(text);
    }

    @FXML
    public void clearExampleText() {
        textArea.setText("");
    }

    @FXML
    void initialize() {
        
    }


    private String getDomains(String domains) {
        StringBuilder sb = new StringBuilder();
        String[] gDomains = domains.split(" ");

        for(String domain : gDomains) {
            sb.append("\t");
            sb.append(domain);
            sb.append("\n");
        }
        return sb.toString().trim();
    }
}
