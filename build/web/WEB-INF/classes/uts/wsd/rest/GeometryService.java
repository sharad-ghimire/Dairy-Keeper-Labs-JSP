package uts.wsd.rest;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import uts.wsd.Circle;
import uts.wsd.Rectangle;

/**
 *
 * @author srd
 */
@Path("/geometry")
public class GeometryService {
    
    @GET
    @Path("hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello World";
    }
    
    @GET
    @Path("rectangle")
    @Produces(MediaType.APPLICATION_XML)
    public Rectangle rectangle(@QueryParam("width") double width, @QueryParam("height") double height){
       return new Rectangle(width, height);
    }
     
    @GET
    @Path("circle")
    @Produces(MediaType.APPLICATION_XML)
    public Circle circle(@QueryParam("radius") double radius){
       return new Circle(radius);
    }  
    
}
