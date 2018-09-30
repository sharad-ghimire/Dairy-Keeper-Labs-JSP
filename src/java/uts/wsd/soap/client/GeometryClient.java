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
public class GeometryClient {
    Geometry_Service locator = new Geometry_Service();
    Geometry geo = locator.getGeometryPort();
    
    Rectangle myRect = geo.getRectangleGeometry(4.0, 5.0);
    Circle myCir = geo.hello(4.0);
    

//    System.out.println("Circle radius is " + myCir.getRadius());
    
    
//    
    
    
    
    
    
//Circle radius is 4.0
//Circle area is 50.26548245743669
//Circle diameter is 8.0
//Circle circumference is 25.132741228718345
//Rectangle width is 4.0
//Rectangle height is 5.0
//Rectangle area is 20.0
//Rectangle perimeter is 18.0
    
}
