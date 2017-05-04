package com.company.springbootjavafx.controllers;

import com.company.springbootjavafx.services.text.TextService;
import de.felixroske.jfxsupport.FXMLController;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Semih on 5/4/2017.
 */

@FXMLController
public class MainController extends BaseController
{
    @FXML
    private Button button;

    @FXML
    private TextField textField;

    @FXML
    private Label label;

    @Autowired
    private TextService textService;

    @FXML
    private void setHelloText(final Event event)
    {
        label.setText(textField.getText() + " " + textService.generateRandomString());
    }
}
