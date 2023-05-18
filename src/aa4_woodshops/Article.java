package aa4_woodshops;

/**
 * The type Article.
 */
public class Article extends Product{
    /**
     * The Name.
     */
    public String name;

    /**
     * Instantiates a new Article.
     *
     * @param productCode the product code
     * @param description the description
     * @param retailPrice the retail price
     * @param stock       the stock
     * @param supplier    the supplier
     * @param objectType  the object type
     * @param name        the name
     */
    public Article(int productCode, String description, Float retailPrice, int stock, Supplier supplier, String objectType, String name) {
        super(productCode, description, retailPrice, stock, supplier, objectType);
        this.name = name;
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


    public String toString() {
        return "Product: " +
                "Name= " + name +
                ", Product Code= " + productCode +
                ", Description= " + description +
                ", Price= " + retailPrice + "€" +
                ", Stock= " + stock + "\n";
    }
}
