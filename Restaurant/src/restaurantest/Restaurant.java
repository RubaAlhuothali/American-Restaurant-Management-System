
package restaurantest;
import java.util.ArrayList;
/**
 *
 * @author Noran
 */
public class Restaurant {
 private String name;
    private String address;
    private long phone;
    private float rating;
    private ArrayList<Order> customerOrders;

    /**
     * Construct an abject of Resturant
     */
    public Restaurant(){
    }
    
    /**
     * Construct and initalizes a Resturant 
     * @param name The name of the resturant
     * @param address The name of the resturant
     * @param phone The number phone of the resturant
     * @param rating The rating of the resturant
     */
    public Restaurant(String name, String address, long phone, float rating) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.rating = rating;
    }

    /**
     * this method to add new order 
     * @param order 
     */
    public void addOrder(Order order){
     customerOrders.add(order);
    }
    
    /**
     * this method to display the costumer order
     * @param order 
     */
    public void displayOrder(Order order){
       System.out.println(order);
    }
    
    /**
     * to get the restaurant name
     * @return String 
     */
        public String getName() {
        return name;
    }
        
    /**
     * to set the restaurant name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * to get the restaurant address
     * @return String
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * to set the restaurant address
     * @param address 
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * to get the restaurant phone number
     * @return long
     */
    public long getPhone() {
        return phone;
    }
    
    /**
     * to set the restaurant phone number
     * @param phone 
     */
    public void setPhone(long phone) {
        this.phone = phone;
    }
    /**
     * to get the restaurent rate
     * @return float
     */
    public float getRating() {
        return rating;
    }
    
    /**
     * to set the restaurant rate
     * @param rating 
     */
    public void setRating(float rating) {
        this.rating = rating;
    }
    
    /**
     * to get the costumer orders
     * @return ArrayList of type Order
     */
    public ArrayList<Order> getCustomerOrders() {
        return customerOrders;
    }
    
    /**
     * to set the costumer orders
     * @param customerOrders 
     */
    public void setCustomerOrders(ArrayList<Order> customerOrders) {
        this.customerOrders = customerOrders;
    }
    
    /**
     * this method returd the restuarant information
     * @return String
     */
    @Override
    public String toString() {
        return "The Restaurant " + 
                "address in " + address +
                "   phone number " + phone + 
                "   rating " + rating ; }      
}
