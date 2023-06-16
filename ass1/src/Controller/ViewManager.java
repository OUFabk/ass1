/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author WAFAco
 */


import Controller.CurrencyConverstionSystemControllerr;
import Controller.LoginController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewManager {
    private Stage stage;

    public static LoginController loginController;
    public static CurrencyConverstionSystemControllerr CurrencyConverstionSystemControllerr;
    
    private ViewManager(){   
    }
    public ViewManager(Stage stage) {
        this.stage = stage;
    }

    public void showLoginPage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("View/LoginPage.fxml"));
        Parent root = loader.load();
        stage.setScene(new Scene(root));

        LoginController loginPageController = loader.getController();
       // loginPageController.setViewManager(this);

        stage.show();
    }

    public void showCurrencyConversionPage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("View/CurrencyConversionPage.fxml"));
        Parent root = loader.load();
        stage.setScene(new Scene(root));

        CurrencyConverstionSystemControllerr currencyConversionPageController = loader.getController();
      //  currencyConversionPageControllerr.setViewManager(this);

        stage.show();
    }

    public void navigateToLoginPage() throws IOException {
        showLoginPage();
    }

    public void navigateToCurrencyConversionPage() throws IOException {
        showCurrencyConversionPage();
    }
}
