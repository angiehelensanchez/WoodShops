package aa4_woodshops;

/**
 * The type Produc ticket.
 */
public class ProducTicket {

    /**
     * The Name.
     */
    public String Name;
    /**
     * The Productcode.
     */
    public int productcode;
    /**
     * The Amount.
     */
    public int amount;
    /**
     * The Price.
     */
    public Float price;

    /**
     * Instantiates a new Produc ticket.
     *
     * @param name        the name
     * @param productcode the productcode
     * @param amount      the amount
     * @param price       the price
     */
    public ProducTicket(String name, int productcode, int amount, Float price) {
        Name = name;
        this.productcode = productcode;
        this.amount = amount;
        this.price = price;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * Gets productcode.
     *
     * @return the productcode
     */
    public int getProductcode() {
        return productcode;
    }

    /**
     * Sets productcode.
     *
     * @param productcode the productcode
     */
    public void setProductcode(int productcode) {
        this.productcode = productcode;
    }

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Gets totalprice.
     *
     * @return the totalprice
     */
    public Float getTotalprice() {
        return price;
    }

    /**
     * Sets totalprice.
     *
     * @param price the price
     */
    public void setTotalprice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "|Product Code: " + productcode +
                " |Amount: " + amount +
                " |Price: " + price +
                "€\n" ;
    }
}
