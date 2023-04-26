package aa3_woodshops;

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
     * Instantiates a new Headquarters.
     *
     * @param manager the manager
     */
    public Headquarters(String manager) {
        this.manager = manager;
        this.shops = new ArrayList<>();
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
     * New shop.
     *
     * @param site the site
     */
    public static void newShop(Shop site){
        shops.add(site);
    }

    /**
     * Search product.
     *
     * @param productCode the product code
     */
    public static void searchProduct(int productCode){

    }

    public String toString() {
        return "Headquarters: " +
                "manager= " + manager;
    }
}
