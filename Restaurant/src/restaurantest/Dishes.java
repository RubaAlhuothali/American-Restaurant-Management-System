
package restaurantest;
/**
 * 
 * @author Mysem
 */
public class Dishes {
    private String title;
    private String description;
    private float price;
    private int calories;
    
    /**
     * Construct an object of a dish 
     */
    public Dishes(){}
    
    /**
     * Construct and initializes a dish 
     * @param title name of the dish
     * @param description descripe the dish
     * @param price of the dish 
     * @param calories of the dish
     */
    public Dishes( String title,String description  , float price,int calories){
     this.title = title;
     this.description = description;
     this.price = price;
     this.calories = calories;}
    
    /**
     * to get the title for the dish
     * @return String
     */
    public String getTitle() {
        return title;
    }
    /**
     * to set the title for the dish
     * @param title (name of the dish)
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * to get a description for the dish
     * @return String
     */
    public String getDescription() {
        return description;
    }
    /**
     *  to set a description for the dish
     * @param description (descripe the dish)
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * to get a price for the dish
     * @return double
     */
    public float getPrice() {
        return price;
    }
    /**
     * to set a price for the dish
     * @param price of the dish
     */
    public void setPrice(float price) {
        this.price = price;
    }
    /**
     * to get calories for the dish
     * @return int
     */
    public int getCalories() {
        return calories;
    }
    /**
     * to set calories for the dish
     * @param calories of the dish
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }

    /**
     * this method to return the dish information
     * @return String
     */
    @Override
    public String toString() {
        return "  Dishe name: " + title +
                ", Description: " + description + 
                "\n  price: " + price + 
                "SAR   ,calories:  " + calories + "  Cal";
    }    
}
