package uts.wsd;

/**
 *
 * @author sharad
 */

public class User implements java.io.Serializable {
    
   private String name;
   private String email;
   private String password;
   private String gender;
   private String favColor;
   
   

   public User() {
       
   }
   
   public User( String name, String email, String password,String gender, String favColor) {
       this.name = name;
       this.email = email;
       this.password = password;
       this.gender = gender;
       this.favColor = favColor;
       
   }
   
   
   
   public String getName(){
      return name;
   }
   public String getEmail(){
      return email;
   }
   public String getPassword(){
      return password;
   }
   public String getGender(){
      return gender;
   }
   public String getFavColor(){
      return favColor;
   }
   
   
   
   public void setName(String name){
      this.name = name;
   }
   public void setEmail(String email){
      this.email = email;
   }
   public void setPassword(String password){
      this.password = password;
   }
   public void setGender(String gender){
      this.gender = gender;
   }
   public void setFavColor(String favColor){
      this.favColor = favColor;
   }

}
    
