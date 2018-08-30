package uts.wsd;

/**
 *
 * @author sharad
 */
import java.util.*;
import java.io.Serializable;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="users")
public class Users implements Serializable {
    
    
    @XmlElement(name = "user")
    private ArrayList<User> user = new ArrayList<User>();
 
    
    public ArrayList<User> getList() {
        return user;
    }
    public void addUser(User user) {
        this.user.add(user);
    }
    public void removeUser(User user) {
        this.user.remove(user);
    }
    
    public User login(String email, String password) {
        // For each user in the list...
        for (User user : user) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password))
                return user; // Login correct. Return this user.
        }
        return null; // Login incorrect. Return null.
    }
    
    //Checks if the email exists
    public User emailChecker(String email) {
        // For each user in the list...
        for (User user : user) {
            if (user.getEmail().equals(email))
                return user; 
        }
        return null; // Login incorrect. Return null.
    }
}