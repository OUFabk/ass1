/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author WAFAco
 */




import java.awt.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CurrencyConverstionSystemControllerr {

    @FXML
    private AnchorPane nisfield;

    @FXML
    private TextField usdfield;



  @FXML
    void loginButtonClicked(ActionEvent event) {

    }
    @FXML
    void fcf9f9(ActionEvent event) {

    }

    @FXML
    void convertButtonClicked(ActionEvent event) {

    }

 private ViewManager viewManager;

    public void setViewManager(ViewManager viewManager) {
        this.viewManager = viewManager;
    }

    @FXML
    private void handleConvertButtonAction() {

         usdfield.CurrencyConverter;      
        
    }

    @FXML
    private void logoutButtonClicked() throws IOException {
        viewManager.navigateToLoginPage();
    }
}

