package aa4_woodshops;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The type Shop.
 */
public class Shop {
    /**
     * The Region.
     */
    public String region;
    /**
     * The Warehouses.
     */
    public Warehouse warehouses;

    /**
     * The Tickets.
     */
    public ArrayList<Ticket> tickets;

    /**
     * Instantiates a new Shop.
     *
     * @param region    the region
     * @param warehouse the warehouse
     */
    public Shop(String region, Warehouse warehouse) {
        this.region = region;
        this.warehouses = warehouse;
        this.tickets = new ArrayList<>();
    }

    /**
     * Gets region.
     *
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets region.
     *
     * @param region the region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Gets warehouses.
     *
     * @return the warehouses
     */
    public Warehouse getWarehouses() {
        return warehouses;
    }

    /**
     * Sets warehouses.
     *
     * @param warehouses the warehouses
     */
    public void setWarehouses(Warehouse warehouses) {
        this.warehouses = warehouses;
    }

    /**
     * Gets tickets.
     *
     * @return the tickets
     */
    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    /**
     * Sets tickets.
     *
     * @param tickets the tickets
     */
    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    /**
     * New ticket.
     *
     * @param ticket1 the ticket 1
     */
    public  void  newTicket(Ticket ticket1){
        tickets.add(ticket1);
    }

    /**
     * Select shop string.
     *
     * @return the string
     */
    public static String selectShop(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Select a shop: ");

        for (int i = 0; i < Headquarters.shops.size(); i++){

            System.out.println("Region: " + Headquarters.shops.get(i).getRegion());
        }
        String ans = keyboard.nextLine();
        return ans;
    }

    /**
     * Customers ticket int.
     *
     * @param number       the number
     * @param namecustomer the namecustomer
     * @return the int
     */
    public int customersTicket(int number, String namecustomer) {
        int a = 0;
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).numberticket == number) {
                for (a = 0; a < Headquarters.customers.size(); a++) {
                    if (Headquarters.customers.get(a).name.equals(namecustomer)) {
                        tickets.get(i).setCustomers(Headquarters.customers.get(a));
                    }
                }
            }
        }
        return a;
    }

    /**
     * Product ticket.
     *
     * @param productcodticket the productcodticket
     * @param amount           the amount
     * @param number           the number
     * @param ans              the ans
     */
    public void productTicket (int productcodticket, int amount, int number, String ans){
        for(int i = 0; i < tickets.size(); i++){
            if (tickets.get(i).numberticket == number){
                for( int a = 0; a< Headquarters.shops.size(); a++){
                    if (Headquarters.shops.get(a).region.equals(ans)){
                       for (int b = 0; b < Headquarters.shops.get(a).warehouses.products.size(); b++){
                            if (warehouses.products.get(b).productCode == productcodticket && warehouses.products.get(b).stock>=amount && amount!=0){
                                String nombreproduct = warehouses.products.get(b).description;
                                Float  priceproduct = warehouses.products.get(b).retailPrice;
                                ProducTicket product = new ProducTicket(nombreproduct, productcodticket, amount, priceproduct);
                                tickets.get(i).products.add(product);
                                restProduct(productcodticket, amount, ans);
                            }
                        } 
                    }
                }
            }
        }
    }

    /**
     * Rest product.
     *
     * @param code   the code
     * @param amount the amount
     * @param ans    the ans
     */
    public void restProduct(int code, int amount, String ans){
        for( int a = 0; a< Headquarters.shops.size(); a++){
                    if (Headquarters.shops.get(a).region.equals(ans)){
                       for (int b = 0; b < Headquarters.shops.get(a).warehouses.products.size(); b++){
                            if (Headquarters.shops.get(a).warehouses.products.get(b).productCode == code){
                                int stockinit = Headquarters.shops.get(a).warehouses.products.get(b).getStock();
                                if (amount <= stockinit){
                                    int stockend = stockinit - amount;
                                    Headquarters.shops.get(a).warehouses.products.get(b).setStock(stockend);
                                }
                            }
                        } 
                    }
                }
    }
}
