/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.lab09;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
/**
 * FXML Controller class
 *
 * @author 2565007
 */
public class PrimaryController implements Initializable {

    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 1.0;

    @FXML
    private Slider redSlider;
    @FXML
    private Slider greenSlider;
    @FXML
    private Slider blueSlider;
    @FXML
    private Slider alphaSlider;
    @FXML
    private Label redLbl;
    @FXML
    private Label greenLbl;
    @FXML
    private Label blueLbl;
    @FXML
    private Label alphaLbl;
    @FXML
    private TextField greenTextField;
    @FXML
    private TextField blueTextField;
    @FXML
    private TextField alphaTextField;
    @FXML
    private TextField redTextField;
    @FXML
    private Rectangle colorRectangle;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //binding each property to their textField
        redTextField.textProperty().bind(redSlider.valueProperty().asString("%.0f"));
        greenTextField.textProperty().bind(greenSlider.valueProperty().asString("%.0f"));
        blueTextField.textProperty().bind(blueSlider.valueProperty().asString("%.0f"));
        alphaTextField.textProperty().bind(alphaSlider.valueProperty().asString("%.2f"));
        
        
        //adding listener to each property
        redSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            red = newVal.intValue();
            updateColor();
        });
        
        greenSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            green = newVal.intValue();
            updateColor();
        });
        
        blueSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            blue = newVal.intValue();
            updateColor();
        });
        
        alphaSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            alpha = newVal.doubleValue();
            updateColor();
        });
    }   
    
    /**
     * setting the RGB fill color of the rectangle
     */
    public void updateColor(){
        colorRectangle.setFill(
        Color.rgb(red, green, blue, alpha));
    }
}
