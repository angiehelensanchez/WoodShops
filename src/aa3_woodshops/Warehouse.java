package aa3_woodshops;

import java.util.ArrayList;

/**
 * The type Warehouse.
 */
public class Warehouse {
    /**
     * The Number warehouse.
     */
    public int numberWarehouse;
    /**
     * The Products.
     */
    public ArrayList<Product> products;

    /**
     * Instantiates a new Warehouse.
     *
     * @param numberWarehouse the number warehouse
     */
    public Warehouse(int numberWarehouse) {
        this.numberWarehouse = numberWarehouse;
        this.products = new ArrayList<>();
    }

    /**
     * Gets number warehouse.
     *
     * @return the number warehouse
     */
    public int getNumberWarehouse() {
        return numberWarehouse;
    }

    /**
     * Sets number warehouse.
     *
     * @param numberWarehouse the number warehouse
     */
    public void setNumberWarehouse(int numberWarehouse) {
        this.numberWarehouse = numberWarehouse;
    }

    /**
     * Gets products.
     *
     * @return the products
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * Sets products.
     *
     * @param products the products
     */
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    /**
     * List products.
     */
    public void listProducts(){
        System.out.println(products);
    }


    public String toString() {
        return "Warehouse: " +
                "numberWarehouse= " + numberWarehouse +
                ", products= " + products;
    }
}
