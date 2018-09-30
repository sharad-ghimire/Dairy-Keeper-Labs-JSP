/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd.soap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author srd
 */
@WebService(serviceName = "Calculator")
public class Calculator {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod
    public int add(int a, int b) {
        return a+b;
    }
    @WebMethod
    public int sub(int a, int b) {
        return a-b;
    }
    @WebMethod
    public int mul(int a, int b) {
        return a*b;
    }
    @WebMethod
    public int div(int a, int b) {
        return a/b;
    }
}
