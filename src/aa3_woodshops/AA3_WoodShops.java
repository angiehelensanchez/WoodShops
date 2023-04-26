
package aa3_woodshops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * The type Aa 3 wood shops.
 */
public class AA3_WoodShops {
    /**
     * The constant headquarters1.
     */
    public static  Headquarters headquarters1 = new Headquarters("Angie Helen Rodas Sánchez");

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        start();
    }

    /**
     * Start.
     */
    public static void start(){
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                              Wood Shops INC                                  ");
        System.out.println("------------------------------------------------------------------------------");
        boolean out = false;
        do {
            System.out.println("""
                    1. Add shops
                    2. Add products
                    3. List products of a shop
                    4. Search product for product code
                    0. Out""");
            int number = menu();
            switch (number) {
                case 1 -> {
                    Shop succours = addShop();
                    Headquarters.newShop(succours);
                }
                case 2 -> addProduct();
                case 3 -> listProduct();
                case 4 -> searchProduct();
                case 0 -> out = true;
            }
        } while (!out);
        System.out.println("------------------------------------------------------------------------------");
        
    }

    /**
     * Menu int.
     *
     * @return the int
     */
    public static int menu(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Select an option (1, 2, 3 , 4 or 0): ");

        return keyboard.nextInt();
    }

    /**
     * Add Shop shops.
     *
     * @return the shop
     */
    public static Shop addShop(){

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the region: ");
        String region = keyboard.nextLine();
        int warehouse = 1;
        Warehouse wh = new Warehouse(warehouse);

        return new Shop(region, wh);
    }

    /**
     * Add product.
     */
    public static void addProduct(){
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Select a shop: ");

            for (int i = 0; i < headquarters1.shops.size(); i++){
                System.out.println("Shop: " + headquarters1.shops.get(i).getRegion());
            }
            String ans = keyboard.nextLine();

            for (int i = 0; i < headquarters1.shops.size(); i++){

                if (headquarters1.shops.get(i).region.equals(ans)){

                        System.out.println("------------------------------------------------------------------------------");
                        System.out.println("Please, select a type of product: ");
                        System.out.println("""
                                1. Varnish
                                2. Article
                                3. Board
                                0. Out""");

                        int number = keyboard.nextInt();
                        keyboard.nextLine();

                        if (number == 0){
                            break;
                        }
                        Product products = doGeneric(number);

                        headquarters1.shops.get(i).warehouses.products.add(products);
                }
            }
    }


    /**
     * Do generic product.
     *
     * @param option the option
     * @return the product
     */
    public static Product doGeneric(int option) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the product code:");
        int productCode = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter the description:");
        String description = keyboard.nextLine();

        System.out.println("Enter the price:");
        Float retailPrice = keyboard.nextFloat();
        keyboard.nextLine();

        System.out.println("Enter stock");
        int stock = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter the supplier's name");
        String nameSupplier = keyboard.nextLine();

        System.out.println("Enter the supplier's nif");
        String nifSupplier = keyboard.nextLine();
        Supplier sp = new Supplier(nifSupplier, nameSupplier);
        Product product = null;

        switch (option) {
            case 1 -> {
                System.out.println("Introduce ml");
                Float ml = keyboard.nextFloat();
                keyboard.nextLine();

                System.out.println("Introduce colour");
                String colour = keyboard.nextLine();

                String varnish = "Varnish";

                product = new Varnish(productCode, description, retailPrice, stock, sp, varnish, ml, colour);
            }
            case 2 -> {
                System.out.println("Introduce the name: ");
                String name = keyboard.nextLine();

                String article = "Article";

                product = new Article(productCode, description, retailPrice, stock, sp, article, name);
            }
            case 3 -> {
                System.out.println("Introduce the type of board");
                String board = keyboard.nextLine();

                System.out.println("Introduce the height");
                Float height = keyboard.nextFloat();

                System.out.println("Introduce the width");
                Float width = keyboard.nextFloat();

                String board1 = "Board";

                product = new Board(productCode, description, retailPrice, stock, sp, board1, height, width, board);
            }
        }
        return product;
    }


    /**
     * List product.
     */
    public static void listProduct(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Select a shop: ");

        for (int i = 0; i < headquarters1.shops.size(); i++){

            System.out.println("Region: " + headquarters1.shops.get(i).getRegion());
        }

        String ans = keyboard.nextLine();

        for (int i = 0; i < headquarters1.shops.size(); i++){

            if (headquarters1.shops.get(i).region.equals(ans)){

                var z = headquarters1.shops.get(i).warehouses.products;

                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Please, choose a type of product: ");
                System.out.println("""
                        1. Varnish
                        2. Article
                        3. Board
                        0. Out""");

                int number = keyboard.nextInt();

                ArrayList<Product> list1 = new ArrayList<>();

                if(number == 1) {

                    for (Product product : z) {

                        if (product.objectType.equals("Varnish"))
                            list1.add(product);
                    }

                    if(list1.size() == 0)
                        System.out.println("No Varnish found in the warehouse: " + ans);
                }
                else if ( number == 2)
                {

                    for (Product product : z) {
                        if (product.objectType.equals("Article"))
                            list1.add(product);
                    }

                    if(list1.size() == 0)
                        System.out.println("No Article found in the warehouse: " + ans);
                }
                else if (number == 3)
                {

                    for (Product product : z) {
                        if (product.objectType.equals("Board"))
                            list1.add(product);
                    }

                    if(list1.size() == 0)
                        System.out.println("No Board found in the warehouse: " + ans);
                }

                if(list1.size() >= 1) {
                    System.out.println(list1);
                    System.out.println("------------------------------------------------------------------------------");
                }
            }
        }

    }

    /**
     * Search product.
     */
    public static void searchProduct(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the product code: ");
        int ans = keyboard.nextInt();

        List<String> region = new ArrayList<>();

        for (int i = 0; i < headquarters1.shops.size(); i++){

            var z = headquarters1.shops.get(i).warehouses.products;

            for (Product product : z) {
                if (product.productCode == ans) {
                    String result = "Region: " + headquarters1.shops.get(i).region + " " + "Stock: " + product.stock;
                    region.add(result);
                }
            }
        }
        if (region.size() >= 1){
            System.out.println(region);
            System.out.println("------------------------------------------------------------------------------");
        }

        else
            System.out.println("No product found with this code: " + ans);
    }
}
