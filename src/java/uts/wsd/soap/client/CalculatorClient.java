/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd.soap.client;

/**
 *
 * @author srd
 */
public class CalculatorClient {

    public static void main(String[] args) {
        Calculator_Service locator = new Calculator_Service();
        Calculator cal = locator.getCalculatorPort();
        
        System.out.println("2+2 is " + cal.add(2, 2));
        System.out.println("7-3 is " + cal.sub(7, 3));
        System.out.println("8*8 is " + cal.mul(8, 8));
        System.out.println("10/5 is " + cal.div(10, 5));        
    }
    
}
