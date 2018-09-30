
package uts.wsd.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for circle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="circle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="circumference" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="diameter" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="radius" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "circle", propOrder = {
    "area",
    "circumference",
    "diameter",
    "radius"
})
public class Circle {

    protected double area;
    protected double circumference;
    protected double diameter;
    protected double radius;

    /**
     * Gets the value of the area property.
     * 
     */
    public double getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     */
    public void setArea(double value) {
        this.area = value;
    }

    /**
     * Gets the value of the circumference property.
     * 
     */
    public double getCircumference() {
        return circumference;
    }

    /**
     * Sets the value of the circumference property.
     * 
     */
    public void setCircumference(double value) {
        this.circumference = value;
    }

    /**
     * Gets the value of the diameter property.
     * 
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * Sets the value of the diameter property.
     * 
     */
    public void setDiameter(double value) {
        this.diameter = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     */
    public void setRadius(double value) {
        this.radius = value;
    }

}
