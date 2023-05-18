package aa4_woodshops;

import java.util.ArrayList;
import java.util.Scanner;

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


    /**
     * Products ticket array list.
     *
     * @param number the number
     * @param z      the z
     * @param ans    the ans
     * @return the array list
     */
    public static ArrayList<Product> productsTicket(int number, ArrayList<Product> z, String ans){

        ArrayList<Product> list1 = new ArrayList<>();

        switch (number) {
            case 1:
                for (Product product : z) {
                    
                    if (product.objectType.equals("Varnish"))
                        list1.add(product);
                }   if(list1.isEmpty())
                    System.out.println("No Varnish found in the shop: " + ans);
                break;
            case 2:
                for (Product product : z) {
                    if (product.objectType.equals("Article"))
                        list1.add(product);
                }
                if(list1.isEmpty()){
                    System.out.println("No Article found in the shop: " + ans);
                }
                break;
            case 3:
                for (Product product : z) {
                    if (product.objectType.equals("Board"))
                        list1.add(product);
                }
                if(list1.isEmpty()){
                    System.out.println("No Board found in the shop: " + ans);
                }
                break;
            default:
                break;
        }

        return list1;
    }

    /**
     * Select type product int.
     *
     * @return the int
     */
    public static int selectTypeProduct(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Select a type of product: ");
        System.out.println("1. Varnish\n" + "2. Article\n" + "3. Board\n" + "0. Out");

        int number = keyboard.nextInt();
        return number;
    }



    public String toString() {
        return "Warehouse: " +
                "numberWarehouse= " + numberWarehouse +
                ", products= " + products;
    }
}
