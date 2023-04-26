package aa3_woodshops;

/**
 * The type Varnish.
 */
public class Varnish extends Product{
    /**
     * The Ml.
     */
    public Float ml;
    /**
     * The Colour.
     */
    public String colour;

    /**
     * Instantiates a new Varnish.
     *
     * @param productCode the product code
     * @param description the description
     * @param retailPrice the retail price
     * @param stock       the stock
     * @param supplier    the supplier
     * @param objectType  the object type
     * @param ml          the ml
     * @param colour      the colour
     */
    public Varnish(int productCode, String description, Float retailPrice, int stock, Supplier supplier, String objectType, Float ml, String colour) {
        super(productCode, description, retailPrice, stock, supplier, objectType);
        this.ml = ml;
        this.colour = colour;
    }

    /**
     * Gets ml.
     *
     * @return the ml
     */
    public Float getMl() {
        return ml;
    }

    /**
     * Sets ml.
     *
     * @param ml the ml
     */
    public void setMl(Float ml) {
        this.ml = ml;
    }

    /**
     * Gets colour.
     *
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * Sets colour.
     *
     * @param colour the colour
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    public String toString() {
        return "Product: " +
                "ml= " + ml +
                ", Colour= " + colour +
                ", Product Code= " + productCode +
                ", Description= " + description+
                ", Price= " + retailPrice + "€" +
                ", Stock= " + stock + "\n";
    }
}
