
package restaurantest;
/**
 * 
 * @author Ruba
 */
public class Mangar extends Person{
   private String password;
   
    /**
    * Construct an object of Manger 
    */
    public Mangar() {
    }
    /**
     * Construct and initializes the manager with first and last name with phone number
     * @param fname
     * @param lname
     * @param phoneNumber 
     */
    public Mangar(String fname, String lname, long phoneNumber) {
        super(fname, lname, phoneNumber);
    }
    /**
     * return the password
     * @return String
     */
    public String getPassword() {
        return password;
    }
    /**
     * set the value of the password
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password;
    }
  
    /**
     * this method to return the manger information
     * @return String
     */
    @Override
    public String toString() {
        return  fname + lname +
                " Your phone number is:" + phoneNumber  ;
    }
}
