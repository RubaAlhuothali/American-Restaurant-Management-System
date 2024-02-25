
package restaurantest;
/**
 * @author Shahad
 */
import java.util.ArrayList;
public class Order implements Receipt {
    private static int orderLastId = 1;
    private int orderId;
    private float cost;
    Customer custemor;
    private ArrayList<Dishes> orderDishes;
    private PaymentType paymentType;
    

    /**
     * Costructor
     */
     public Order() {
        orderId = orderLastId;
        orderLastId++;
    }
     
    /**
     * 
     * @param customer
     * @param orderDishes
     * @param paymentType
     */
     public Order( Customer customer, ArrayList<Dishes> orderDishes, PaymentType paymentType) {
        this.orderId = orderLastId;
        this.custemor = customer;
        this.orderDishes = orderDishes;
        this.paymentType = paymentType;
        orderLastId++;
    }

    /**
     * this getter get the number for the order id
     * @return int
     */
    public int getOrderId() {
        return orderId;
    }
    /**
     * this setter set the number for the order id
     * @param orderId 
     */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    /**
     * this is to get the dishes the costumer choose 
     * @return ArrayList of Dishes
     */
    public ArrayList<Dishes> getOrderDishes() {
        return orderDishes;
    }
    /**
     * this to set the dishes the costumer take
     * @param orderDishes 
     */
    public void setOrderDishes(ArrayList<Dishes> orderDishes) {
        this.orderDishes = orderDishes;
    }
    /**
     * this to get the payment type the costumer choose
     * @return PaymentType
     */
    public PaymentType getPaymentType() {
        return paymentType;
    }
    /**
     * this to set the payment type the costumer choose
     * @param paymentType 
     */
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
    
    /**
     * getter for the cost
     * @return float
     */
    public float getCost() {
        return cost;
    }
    
    /**
     * set the cost
     * @param cost 
     */
    public void setCost(float cost) {
        this.cost = cost;
    }
   
    
    /**
     * this method return the order id and the payment type he/she choose and the cost for there orders
     * @return String
     */
    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderId + 
                ", paymentType=" + paymentType + 
                ", cost=" + calculateTotalPrice() + 
                "}\n Dishes: "+orderDishes;
    }
    
      /**
     * This methos calculate the total Price of the orders 
     * @return double
     */
    @Override
    public double calculateTotalPrice() {
        double res = 0.0;
        for (Dishes orderDish : orderDishes) {
            res += orderDish.getPrice();
        }
        return res;
    }

}
