package uts.wsd;
 
import javax.xml.bind.annotation.*;
 
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Circle {
 private double radius;
 
 public Circle() {
  super();
 }
 
    public Circle(double radius) {
        this.radius = radius;
    }

    @XmlElement
    public double getDiameter() {
        return radius*2;
    }
    
    @XmlElement
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @XmlElement
    public double getArea() {
        return Math.PI*radius*radius;
    }
 
    @XmlElement
    public double getCircumference() {
      return 2*Math.PI*radius;
    }
 
 
 }