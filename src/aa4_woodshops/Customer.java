package aa4_woodshops;

/**
 * The type Customer.
 */
public abstract class Customer {
    /**
     * The Nif.
     */
    public String nif;
    /**
     * The Name.
     */
    public String name;
    /**
     * The Customer type.
     */
    public String customerType;
    /**
     * The Discount.
     */
    public Float discount;

    /**
     * Instantiates a new Customer.
     *
     * @param nif          the nif
     * @param name         the name
     * @param customerType the customer type
     * @param discount     the discount
     */
    public Customer(String nif, String name, String customerType, Float discount) {
        this.nif = nif;
        this.name = name;
        this.customerType = customerType;
        this.discount = discount;
    }

    /**
     * Gets nif.
     *
     * @return the nif
     */
    public String getNif() {
        return nif;
    }

    /**
     * Sets nif.
     *
     * @param nif the nif
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets discount.
     *
     * @return the discount
     */
    public Float getDiscount() {
        return discount;
    }

    /**
     * Sets discount.
     *
     * @param discount the discount
     */
    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    /**
     * Gets customer type.
     *
     * @return the customer type
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets customer type.
     *
     * @param customerType the customer type
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    
    public String toString() {
        return "Customer{" + "nif=" + nif + ", name=" + name + ", customerType=" + customerType + ", discount=" + discount + '}';
    }

    
}
