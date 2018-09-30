package uts.wsd.soap;
import javax.jws.WebMethod;
import javax.jws.WebService;
import uts.wsd.Circle;
import uts.wsd.Rectangle;

/**
 *
 * @author srd
 */
@WebService(serviceName = "Geometry")
public class Geometry {

    
    @WebMethod
    public Rectangle getRectangleGeometry( double width, double height){
       return new Rectangle(width, height);
    }
    @WebMethod
    public Circle getCircleGeometry(double radius){
       return new Circle(radius);
    }
}
