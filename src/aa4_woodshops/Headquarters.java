package aa4_woodshops;

import java.util.ArrayList;

/**
 * The type Headquarters.
 */
public class Headquarters {
    /**
     * The Manager.
     */
    private String manager;
    /**
     * The Shops.
     */
    public static ArrayList<Shop> shops;

    /**
     * The Customers.
     */
    public static ArrayList<Customer> customers;


    /**
     * Instantiates a new Headquarters.
     *
     * @param manager the manager
     */
    public Headquarters(String manager) {
        this.manager = manager;
        this.shops = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    /**
     * Gets manager.
     *
     * @return the manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Sets manager.
     *
     * @param manager the manager
     */
    public void setManager(String manager) {
        this.manager = manager;
    }

    /**
     * Gets shops.
     *
     * @return the shops
     */
    public static ArrayList<Shop> getShops() {
        return shops;
    }

    /**
     * Sets shops.
     *
     * @param shops the shops
     */
    public static void setShops(ArrayList<Shop> shops) {
        Headquarters.shops = shops;
    }

    /**
     * Gets customers.
     *
     * @return the customers
     */
    public static ArrayList<Customer> getCustomers() {
        return customers;
    }

    /**
     * Sets customers.
     *
     * @param customers the customers
     */
    public static void setCustomers(ArrayList<Customer> customers) {
        Headquarters.customers = customers;
    }

    /**
     * New shop.
     *
     * @param site the site
     */
    public static void newShop(Shop site){
        shops.add(site);
    }

    /**
     * New customer.
     *
     * @param register the register
     */
    public static void  newCustomer(Customer register){
        customers.add(register);
    }

    public String toString() {
        return "Headquarters{" +
                "manager='" + manager + '\'' +
                '}';
    }
}
