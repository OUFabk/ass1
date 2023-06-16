/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author WAFAco
 */
public class CurrencyConverter {
    private static final double SHEKEL_TO_DOLLAR_RATE = 0.28;
    
    public static double dollarsToShekels(double dollars) {
        
        return dollars / SHEKEL_TO_DOLLAR_RATE;
    }
    
    public static double shekelsToDollars(double shekels) {
        return shekels * SHEKEL_TO_DOLLAR_RATE;
    }
}
