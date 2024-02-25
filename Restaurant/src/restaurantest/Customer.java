
package restaurantest;
/**
 * @author Ruba
 */
public class Customer extends Person {
    Order order;
    
     /**
     * Construct an object of a customer
     */   
    public Customer() {
    }

    /**
     * Construct and initializes the customer with first and last name with phone number
     * @param fname take the first name of the customer
     * @param lname take the last name of the customer
     * @param phoneNumber take the pohone number of the customer
     */
    public Customer(String fname, String lname, long phoneNumber) {
        super(fname, lname, phoneNumber);
    }

    /**
     * this method return customer  order 
     * @return String 
     */
    @Override
    public String toString() {
        return "Customer{" + "order=" + order + '}';
    }

}
