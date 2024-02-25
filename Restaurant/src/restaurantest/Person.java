
package restaurantest;
/**
 * 
 * @author Budur
 */
public class Person {
    protected String fname;
    protected String lname;
    protected long phoneNumber;
  
    /**
     * construct a person obj without a parameter
     */
    public Person() {
    }
    
    /**
     * Construct and initializes a Person with first and last name with phone number
     * @param fname  first name coordinate
     * @param lname last name coordinate
     * @param phoneNumber phone number coordinate
     */
    public Person(String fname, String lname, long phoneNumber) {
        this.fname = fname;
        this.lname = lname;
        this.phoneNumber = phoneNumber;
    }

    /**
     * This method return the id and the first and last name with the phone number
     * @return String
     */
    @Override
    public String toString() {
        return "User{" +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }  
}
