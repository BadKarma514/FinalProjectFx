package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;

import javax.swing.*;

public class Controller {

    @FXML
    private MenuBar MenuBar;

    @FXML
    private Button createAccountBtn;


    @FXML
    void print(ActionEvent event){
        System.out.println("This is a test");
    }



}
