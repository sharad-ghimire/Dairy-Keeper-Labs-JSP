package uts.wsd;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
//Maps all the java fields to XML element
@XmlRootElement(name="user")
public class User implements Serializable {
	
        @XmlElement(name = "email")
	private String email;
        @XmlElement(name = "name")
	private String name;
        @XmlElement(name = "password")
	private String password;
        @XmlElement(name = "gender")
	private String gender;
        @XmlElement(name = "favouriteColour")
	private String favouriteColour;
	
        public User() {
		super();
	}
	public User(String email, String name, String password, String gender,
			String favouriteColour) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.favouriteColour = favouriteColour;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFavouriteColour() {
		return favouriteColour;
	}
	public void setFavouriteColour(String favouriteColour) {
		this.favouriteColour = favouriteColour;
	}
}