package aa3_woodshops;


/**
 * The type Product.
 */
public abstract class Product {
    /**
     * The Product code.
     */
    public int productCode;
    /**
     * The Description.
     */
    public  String description;
    /**
     * The Supplier.
     */
    public Supplier supplier;
    /**
     * The Retail price.
     */
    public Float retailPrice;
    /**
     * The Stock.
     */
    public int stock;
    /**
     * The Object type.
     */
    public String objectType;

    /**
     * Instantiates a new Product.
     *
     * @param productCode the product code
     * @param description the description
     * @param retailPrice the retail price
     * @param stock       the stock
     * @param supplier    the supplier
     * @param objectType  the object type
     */
    public Product(int productCode, String description, Float retailPrice, int stock, Supplier supplier, String objectType) {
        this.productCode = productCode;
        this.description = description;
        this.retailPrice = retailPrice;
        this.stock = stock;
        this.supplier = supplier;
        this.objectType = objectType;
    }

    /**
     * Gets product code.
     *
     * @return the product code
     */
    public int getProductCode() {
        return productCode;
    }

    /**
     * Sets product code.
     *
     * @param productCode the product code
     */
    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets supplier.
     *
     * @return the supplier
     */
    public Supplier getSupplier() {
        return supplier;
    }

    /**
     * Sets supplier.
     *
     * @param supplier the supplier
     */
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    /**
     * Gets object type.
     *
     * @return the object type
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets object type.
     *
     * @param objectType the object type
     */
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    /**
     * Gets retail price.
     *
     * @return the retail price
     */
    public Float getRetailPrice() {
        return retailPrice;
    }

    /**
     * Sets retail price.
     *
     * @param retailPrice the retail price
     */
    public void setRetailPrice(Float retailPrice) {
        this.retailPrice = retailPrice;
    }

    /**
     * Gets stock.
     *
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * Sets stock.
     *
     * @param stock the stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    public String toString() {
        return "Product: " +
                "product code= " + productCode +
                ", description= " + description + '\'' +
                ", price= " + retailPrice +
                ", stock= " + stock ;
    }

}

