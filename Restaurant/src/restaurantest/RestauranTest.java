package restaurantest;

/**
 * @author Budur, Noran, Shahad, Mysam, Ruba
 */
import java.util.ArrayList;
import java.util.Scanner;

public class RestauranTest {
    static Restaurant restaurant;
    static ArrayList<Dishes> menu = new ArrayList<>();

    //Polymorphism
    static Person currentUser;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        addItemsToMenu();
        restaurant = new Restaurant();
        restaurant.setCustomerOrders(new ArrayList<>());
        System.out.println("---------------------------------------------------------------");
        System.out.println("Welcome to restaurant management system");
        System.out.println("If you the manager Enter 1 if you are customer Enter 2");
        System.out.println("---------------------------------------------------------------");
        int j = sc.nextInt();
        if (j == 1) {//option 1 for the manager 
            {
            System.out.println("Please enter your password:");
            String pass = sc.next();
            boolean b=pass.equalsIgnoreCase("B*a1234");
            while(!b){ //
              System.out.println("wrong password, Please enter your password again:"); 
               pass = sc.next();
               b=pass.equals("Bn123456");
            }
            if(b){//to check if this is the mangar 
            System.out.println("Please enter your first name");
            String fName = sc.next();
            System.out.println("Please enter your last name");
            String lName = sc.next();
            System.out.println("Please enter your phone number");
            int phoneNumber = sc.nextInt();
            currentUser = new Mangar(fName, lName, phoneNumber);
            System.out.println("Hello " + currentUser.toString());
            System.out.println("Please enter your resturanr name");
            String na = sc.next();
            System.out.println("Please enter your resturanr address");
            String add = sc.next();
            System.out.println("Please enter your resturanr phone number");
            int ph = sc.nextInt();
            System.out.println("Please enter your resturanr rating");
            float rat = sc.nextFloat();
            Restaurant ra = new Restaurant(na, add, ph, rat);
            System.out.println(ra.toString());}
        }//end for
        }//end if statment 
        else { //option 2 for the customer 
            int in = 0;
            while (in != 5) { //4 choices
                System.out.println("---------------------------------------------------------------");
                System.out.println("\nPlease select from the following:\n1.Display Menu \n2.Display Orders"
                        + "\n3.Create new Order\n4.Cancel Order\n5.Exit");
                System.out.println("---------------------------------------------------------------");
                in = sc.nextInt();
                switch (in) {
                    case (1):
                        System.out.println("---------------------------------------------------------------");
                        displayMenu();
                        break;
                    case (2):
                        System.out.println("---------------------------------------------------------------");
                        displayOrders();
                        break;
                    case (3):
                        System.out.println("---------------------------------------------------------------");
                        createOrder();
                        break;
                    case (4):
                        System.out.println("---------------------------------------------------------------");
                        cancelOrder();
                        break;
                }//switch end
            }//while end
        }//else end
    }//main end 

    /**
     * this method add the dishes to the menu 
     */
    private static void addItemsToMenu() {
       Dishes Winges=new Dishes("5 winges","1 flavor & 1 dressing",28,350);
       Dishes boneless=new Dishes("5 boneless","1 flavor & 1 dressing",22,480);
       Dishes sweet=new Dishes("Sweet potato fries",
        "Basket of tasty strips of sweet potatoes deep fried and served with a side of honey mustard",15,250);
       Dishes beef=new Dishes("Beef chili","A spicy favourite made fresh daily, with ground beef , kindney beef",18,370);
       Dishes nachos=new Dishes("Nachos",
        "Tortilla chips heaped with chili, cheddar cheese, lettuce, tomatoes, jalapeños, salsa and sour cream",12,200);
       Dishes onion=new Dishes("Onion rings","1 flavor & 1 dressing",14,130);
       Dishes Cheeseburger=new Dishes("Cheeseburger",
       "American cheese, tomato, pickles, lettuce and onion with our proprietary blend of spices",32,456);
       Dishes buffalo=new Dishes("Buffalo Tender wrap",
        "Crispy strips of breaded chicken tossed in spicy buffalo sauce in spinach-herb wrap served with a side of ranch or cheese dressing",25,347);
        Dishes philly=new Dishes("Philly cheese steak","A classic with ribeye steak grilled green peppers, onions, mushrooms and melted cheese",40,687);
        Dishes salmon=new Dishes("Grilled Salmon","salmon with honey mustard sauce served with rice",48,230);
        Dishes wrap=new Dishes("Shrimp wrap","Shrimp with avocado, mixed greens, salsa and mayo in a tomato tortilla",37,395);
        Dishes water=new Dishes("Water"," ",2,35);
        Dishes tiramisu=new Dishes(" Tiramisu","espresso-soaked lady fingers layered with cocoa and sweet italian mascarpone",33,230);
        Dishes cake=new Dishes(" Carrot cake","Four layers of homemade cake with organic cream cheese",23,160);
        Dishes brownie=new Dishes(" Double chocolate brownie","a rich fudge brownie served with French vanilla ice cream",21,270);
        Dishes p=new Dishes("Pepsi","",6,170);
        Dishes s=new Dishes(" 7Up","",6,170);
        menu.add(Winges);
        menu.add(boneless);
        menu.add(sweet);
        menu.add(beef);
        menu.add(nachos);
        menu.add(onion);
        menu.add(Cheeseburger);
        menu.add(buffalo);
        menu.add(philly);
        menu.add(salmon);
        menu.add(wrap);
        menu.add(tiramisu);
        menu.add(cake);
        menu.add(brownie);
        menu.add(water);
        menu.add(s);
        menu.add(p);
    }//addItemsToMenu method end 

    /**
     * this method display the orders (the Reciept)
     */
    private static void displayOrders() {
        for (Order customerOrder : restaurant.getCustomerOrders()) {
            System.out.println(customerOrder);
        }//for end
    }//displayOrders method end 
    
    /**
     * this mehod creat the order 
     */
    private static void createOrder() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Dishes> orderDishes = new ArrayList<>();
        while (true) {
            System.out.println("Please choose the dish number");
            System.out.println("Enter done to submit order");
            String dishInput = sc.next();
            if (dishInput.equalsIgnoreCase("done")) {
                Customer customer = readCustomerData();
                PaymentType type = readPaymentType();
                Order newOrder = new Order(customer, orderDishes, type);
                restaurant.getCustomerOrders().add(newOrder);
                return;
            }//if end  
            //check if the customer enter an integer 
            try {
                //read a string then conver it to integer
                //wrapper class 
                int dishIndex = Integer.parseInt(dishInput);
                orderDishes.add(menu.get(dishIndex));
                System.out.println("Dish added successfully");
            }//try end
            //if the customer didn't enter an integer
            catch (Exception e) {
                System.err.println("Invalid Input try again");
            }//catch end
        }//while end
    }//createOrder method end 
    
    /**
     * this method read the Customer Data
     * like: first name , last name , phone number 
     * @return obj (Customer)
     */
    private static Customer readCustomerData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Customer First name");
        String fname = sc.next();
        System.out.println("Please enter Customer Last name");
        String lname = sc.next();
        System.out.println("Please enter Customer Phone number");
        long phone = sc.nextLong();
        Customer c = new Customer(fname, lname, phone);
        return c;
    }//readCustomerData method end 

    /**
     * this method determine the payment type 
     * @return paymenttype
     */
    private static PaymentType readPaymentType() {
        System.out.println("Please Choose input method 1- Cash 2- Credit");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        return i == 1 ? PaymentType.CASH : PaymentType.CREDIT;
    }//readPaymentType method end 

    /**
     * this method display the menu
     */
    private static void displayMenu() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println("" + i + menu.get(i));
        }//for end
    }//displayMenu method end 

    /**
     * this method cancle the odrer with the order id in the reciept 
     */
    private static void cancelOrder() {
        System.out.println("Please Enter the order id");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        //remove all of the elements of this order ArrayList that have the same id that the customer enter 
        boolean res = restaurant.getCustomerOrders().removeIf(order -> order.getOrderId() == id);
        System.out.println(res ? "Order canceled" : "Invalid order Id");
    }// cancelOrder method end 
}//class end
