package aa4_woodshops;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * The type Aa 4 wood shops.
 */
public class AA4_WoodShops {

    /**
     * The constant headquarters1.
     */
    public static Headquarters headquarters1 = new Headquarters("Angie Helen Rodas Sánchez");

    /**
     * Exampleaa 3.
     */
    public static void exampleaa3() {
        Warehouse examplewarehouse3_1 = new Warehouse(1);
        Warehouse examplewarehouse3_2 = new Warehouse(2);
        Warehouse examplewarehouse3_3 = new Warehouse(3);
        Shop exampleshop3_1 = new Shop("Madrid", examplewarehouse3_1);
        Shop exampleshop3_2 = new Shop("Cordoba", examplewarehouse3_2);
        Shop exampleShop3_3 = new Shop("Santander", examplewarehouse3_3);
        Headquarters.newShop(exampleshop3_1);
        Headquarters.newShop(exampleshop3_2);
        Headquarters.newShop(exampleShop3_3);

        Supplier examplesupplier3_1 = new Supplier("58951237R", "All Things INC");
        Supplier examplesupplier3_2 = new Supplier("98745723T", "WoodSons INC");
        Supplier examplesupplier3_3 = new Supplier("12424567G", "RITZENHOFF INC");

        Product product = new Varnish(123, "Outdoor", 12.45f, 34, examplesupplier3_1, "Varnish", 546.20f, "Black");
        Headquarters.shops.get(2).warehouses.products.add(product);
        Headquarters.shops.get(1).warehouses.products.add(product);

        product = new Varnish(78, "Outdoor and indoor", 79.99f, 462, examplesupplier3_3, "Varnish", 90f, "Blue");
        Headquarters.shops.get(2).warehouses.products.add(product);
        product = new Varnish(986, "Indoor", 189.30f, 199, examplesupplier3_1, "Varnish", 1500f, "White");
        Headquarters.shops.get(0).warehouses.products.add(product);

        product = new Board(46, "Glass", 78.46f, 24, examplesupplier3_2, "Board", 180.50f, 80f, "Glass");
        Headquarters.shops.get(2).warehouses.products.add(product);
        Headquarters.shops.get(1).warehouses.products.add(product);

        product = new Board(51, "Wood", 105f, 70, examplesupplier3_2, "Board", 90f, 140f, "Pine");
        Headquarters.shops.get(0).warehouses.products.add(product);

        product = new Board(67, "PVC", 16.48f, 150, examplesupplier3_1, "Board", 40f, 30f, "PVC");
        Headquarters.shops.get(2).warehouses.products.add(product);

        product = new Article(76, "Chair", 29.99f, 50, examplesupplier3_1, "Article", "Pine chair");
        Headquarters.shops.get(2).warehouses.products.add(product);
        Headquarters.shops.get(1).warehouses.products.add(product);
        product = new Article(12, "Table", 90f, 14, examplesupplier3_1, "Article", "Table indoor");
        Headquarters.shops.get(0).warehouses.products.add(product);

        
        
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws ParseException the parse exception
     */
    public static void main(String[] args) throws ParseException {
        exampleaa3();
        start();
    }

    /**
     * Start.
     *
     * @throws ParseException the parse exception
     */
    public static void start() throws ParseException {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                              Wood Shops INC                                  ");
        System.out.println("------------------------------------------------------------------------------");
        boolean out = false;
        do {
            System.out.println("1. Add shops\n" + "2. Add products\n" + "3. List products of a shop\n" + 
                    "4. Search product for product code\n" + "5. Add customers\n" + "6. List customers\n" + "7. Add ticket in shop\n" + "8. Search ticket\n" + "0. Out");
            int number = menu();
            switch (number) {
                case 1:
                    Shop succours = addShop();
                    Headquarters.newShop(succours);
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    listProduct();
                    break;
                case 4:
                    searchProduct();
                    break;
                case 5:
                    addCustomers();
                    break;
                case 6:
                    listCustomers();
                    break;
                case 7:
                    addTicket();
                    break;
                case 8:
                    searchTicket();
                    break;
                case 0:
                    out = true;
            }
        } while (!out);
        System.out.println("------------------------------------------------------------------------------");
    }

    /**
     * Menu int.
     *
     * @return the int
     */
    public static int menu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Select an option (1, 2, 3 , 4, 5, 6, 7, 8 or 0): ");

        return keyboard.nextInt();
    }

    /**
     * Add Shop shops.
     *
     * @return the shop
     */
    public static Shop addShop() {

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
    public static void addProduct() {
        String ans = Shop.selectShop();

        for (int i = 0; i < Headquarters.shops.size(); i++) {

            if (Headquarters.shops.get(i).region.equals(ans)) {

                int number = Warehouse.selectTypeProduct();

                if (number == 0) {
                    break;
                }
                Product products = doGeneric(number);

                Headquarters.shops.get(i).warehouses.products.add(products);
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
            case 1:
                System.out.println("Introduce ml");
                Float ml = keyboard.nextFloat();
                keyboard.nextLine();

                System.out.println("Introduce colour");
                String colour = keyboard.nextLine();

                String varnish = "Varnish";

                product = new Varnish(productCode, description, retailPrice, stock, sp, varnish, ml, colour);
                break;
            case 2: 
                System.out.println("Introduce the name: ");
                String name = keyboard.nextLine();

                String article = "Article";

                product = new Article(productCode, description, retailPrice, stock, sp, article, name);
                break;
            case 3: 
                System.out.println("Introduce the type of board");
                String board = keyboard.nextLine();

                System.out.println("Introduce the height");
                Float height = keyboard.nextFloat();

                System.out.println("Introduce the width");
                Float width = keyboard.nextFloat();

                String board1 = "Board";

                product = new Board(productCode, description, retailPrice, stock, sp, board1, height, width, board);
                break;
        }
        return product;
    }

    /**
     * List product.
     */
    public static void listProduct() {
        String ans = Shop.selectShop();

        for (int i = 0; i < Headquarters.shops.size(); i++) {

            if (Headquarters.shops.get(i).region.equals(ans)) {

                ArrayList<Product> z = Headquarters.shops.get(i).warehouses.products;

                int number = Warehouse.selectTypeProduct();
                while (number != 0) {
                    ArrayList<Product> list1 = Warehouse.productsTicket(number, z, ans);
                    if (list1.size() >= 1) {
                        System.out.println(list1);
                        System.out.println("------------------------------------------------------------------------------");
                    }
                    number = Warehouse.selectTypeProduct();
                }
            }
        }

    }

    /**
     * Search product.
     */
    public static void searchProduct() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the product code: ");
        int ans = keyboard.nextInt();

        List<String> region = new ArrayList<>();

        for (int i = 0; i < Headquarters.shops.size(); i++) {

            ArrayList<Product> z = Headquarters.shops.get(i).warehouses.products;

            for (Product product : z) {
                if (product.productCode == ans) {
                    String result = "Region: " + Headquarters.shops.get(i).region + " " + "Stock: " + product.stock;
                    region.add(result);
                }
            }
        }
        if (region.size() >= 1) {
            System.out.println(region);
            System.out.println("------------------------------------------------------------------------------");
        } else {
            System.out.println("No product found with this code: " + ans);
        }
    }

    /**
     * Add customers.
     */
    public static void addCustomers() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Select a type of customer: ");
        System.out.println("1. Professional\n" + "2. WoodFriend\n" + "0. Out\n");
        int number = keyboard.nextInt();
        if (number != 0) {
            Customer customers = doCustomer(number);
            Headquarters.newCustomer(customers);
        }
    }

    /**
     * Do customer customer.
     *
     * @param option the option
     * @return the customer
     */
    public static Customer doCustomer(int option) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce the NIF: ");
        String nif = keyboard.nextLine();
        System.out.println("Introduce the name: ");
        String name = keyboard.nextLine();
        Customer customers = null;
        String customerType = " ";
        Float discount = 0f;
        switch (option) {
            case 1:
                customerType = "Professional";
                System.out.println("Introduce the discount: ");
                discount = keyboard.nextFloat();
                keyboard.nextLine();
                customers = new Professional(nif, name, customerType, discount);
                break;
            case 2:
                customerType = "Woodfriend";
                System.out.println("Introduce the customer number: ");
                int number = keyboard.nextInt();
                keyboard.nextLine();
                discount = 5f;
                customers = new Woodfriend(nif, name, customerType, discount, number);
                break;
        }
        return customers;
    }

    /**
     * List customers.
     */
    public static void listCustomers() {
        for (int i = 0; i < Headquarters.customers.size(); i++) {
            System.out.println(Headquarters.customers.get(i));
        }
    }

    /**
     * Add ticket.
     *
     * @throws ParseException the parse exception
     */
    public static  void addTicket() throws ParseException {
        Scanner keyboard = new Scanner(System.in);
        String ans = Shop.selectShop();
        for (int i = 0; i < Headquarters.shops.size(); i++) {
            if (Headquarters.shops.get(i).region.equals(ans)) {
                System.out.println("Introduce the ticket number: ");
                int numberTicket = keyboard.nextInt();
                keyboard.nextLine();
                System.out.println("Introduce the date: dd/MM/yyyy ");
                String datetext = keyboard.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date dateticket = sdf.parse(datetext);
                Ticket historial = new Ticket(numberTicket, dateticket);
                Headquarters.shops.get(i).tickets.add(historial);

                System.out.println("Is a register customer?: Y or N");
                String ansCustomer = keyboard.nextLine();
                if (ansCustomer.equalsIgnoreCase("Y")) {
                    System.out.println("Select a customer: ");
                    for (int a = 0; a < Headquarters.customers.size(); a++) {
                        System.out.println(Headquarters.customers.get(a));
                        System.out.println("------------------------------------------------------------------------------");
                    }
                    String namecustomer = keyboard.nextLine();
                    Headquarters.shops.get(i).customersTicket(numberTicket, namecustomer);

                }
                int typeProduct = Warehouse.selectTypeProduct();
                ArrayList<Product> z = Headquarters.shops.get(i).warehouses.products;
                Float totalprice = 0f;
                while (typeProduct != 0) {
                    ArrayList<Product> list1 = Warehouse.productsTicket(typeProduct, z, ans);
                    if (list1.size() >= 1) {
                        System.out.println(list1);
                        System.out.println("------------------------------------------------------------------------------");
                    }
                    System.out.println("Introduce the product code: ");
                    int productcode = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.println(("Introduce the amount: "));
                    int amount = keyboard.nextInt();
                    Headquarters.shops.get(i).productTicket(productcode, amount, numberTicket, ans);
                typeProduct = Warehouse.selectTypeProduct();
                }
                for(int b = 0; b< Headquarters.shops.get(i).tickets.size(); b++){
                    if (Headquarters.shops.get(i).tickets.get(b).numberticket == numberTicket){
                        for (int c = 0; c<Headquarters.shops.get(i).tickets.get(b).products.size(); c++){
                            Float price = Headquarters.shops.get(i).tickets.get(b).products.get(c).price;
                            int amount = Headquarters.shops.get(i).tickets.get(b).products.get(c).amount;
                            totalprice = totalprice + (price*amount);
                        }
                        if (ansCustomer.equals("Y")){
                                Float discount = Headquarters.shops.get(i).tickets.get(b).customers.getDiscount();
                                Float discountprice = totalprice*discount/100f;
                                Headquarters.shops.get(i).tickets.get(b).setTotalprice((totalprice - discountprice));
                                System.out.println(Headquarters.shops.get(i).tickets.get(b));
                        }else {
                            Headquarters.shops.get(i).tickets.get(b).setTotalprice(totalprice);
                            System.out.println(Headquarters.shops.get(i).tickets.get(b));
                        }
                    }
                }

            }
            
        }
        
    }

    /**
     * Search ticket.
     *
     * @throws ParseException the parse exception
     */
    public static void searchTicket() throws ParseException {
        Scanner keyboard = new Scanner(System.in);
        String ans = Shop.selectShop();

        for(int i = 0; i<Headquarters.shops.size();i++){
            if (Headquarters.shops.get(i).region.equals(ans)) {
                System.out.println("Introduce the start date: dd/MM/yyyy ");
                String datetext = keyboard.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date startdate = sdf.parse(datetext);
                System.out.println("Introduce the end date: dd/MM/yyyy ");
                datetext = keyboard.nextLine();
                Date enddate = sdf.parse(datetext);
                for (int a = 0; a < Headquarters.shops.get(i).tickets.size(); a++) {
                    if (Headquarters.shops.get(i).tickets.get(a).dateticket.before(enddate) && Headquarters.shops.get(i).tickets.get(a).dateticket.after(startdate)) {
                        System.out.println(Headquarters.shops.get(i).tickets.get(a));
                        if (Headquarters.shops.get(i).tickets.get(a).customers.discount != null){
                            System.out.println("Descuento aplicado: " + Headquarters.shops.get(i).tickets.get(a).customers.discount + "%");
                            System.out.println("------------------------------------------------------------------------------");
                        }else System.out.println("Not discount");
                    }
                }
            }
        }

    }
}
