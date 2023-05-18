package aa4_woodshops;

import java.util.ArrayList;
import java.util.Date;


/**
 * The type Ticket.
 */
public class Ticket {

    /**
     * The Number ticket.
     */
    public int numberticket;
    /**
     * The Date ticket.
     */
    public Date dateticket;
    /**
     * The Customers.
     */
    public Customer customers;
    /**
     * The Products.
     */
    public ArrayList<ProducTicket> products;
    /**
     * The Totalprice.
     */
    public Float totalprice;

    /**
     * Instantiates a new Ticket.
     *
     * @param numberticket the number ticket
     * @param dateticket   the date ticket
     */
    public Ticket(int numberticket, Date dateticket) {
        this.numberticket = numberticket;
        this.dateticket = dateticket;
        this.products = new ArrayList<>();

    }

    /**
     * Gets number ticket.
     *
     * @return the number ticket
     */
    public int getNumberTicket() {
        return numberticket;
    }

    /**
     * Sets number ticket.
     *
     * @param numberticket the number ticket
     */
    public void setNumberTicket(int numberticket) {
        this.numberticket = numberticket;
    }

    /**
     * Gets date ticket.
     *
     * @return the date ticket
     */
    public Date getDateticket() {
        return dateticket;
    }

    /**
     * Sets date ticket.
     *
     * @param dateticket the date ticket
     */
    public void setDateticket(Date dateticket) {
        this.dateticket = dateticket;
    }

    /**
     * Gets customers.
     *
     * @return the customers
     */
    public Customer getCustomers() {
        return customers;
    }

    /**
     * Sets customers.
     *
     * @param customers the customers
     */
    public void setCustomers(Customer customers) {
        this.customers = customers;
    
    }

    /**
     * Gets products.
     *
     * @return the products
     */
    public ArrayList<ProducTicket> getProducts() {
        return products;
    }

    /**
     * Sets products.
     *
     * @param products the products
     */
    public void setProducts(ArrayList<ProducTicket> products) {
        this.products = products;
    }

    /**
     * Gets totalprice.
     *
     * @return the totalprice
     */
    public Float getTotalprice() {
        return totalprice;
    }

    /**
     * Sets totalprice.
     *
     * @param totalprice the totalprice
     */
    public void setTotalprice(Float totalprice) {
        this.totalprice = totalprice;
    }

    @Override
    public String toString() {
        return "Ticket: " + numberticket+
                "\n |Date: " + dateticket +
                "\n |Customer: " + customers+
                "\n |"+ products +
                "\n |Total Price: " + totalprice;

    }
    
}
