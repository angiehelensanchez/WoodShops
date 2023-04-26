package aa3_woodshops;

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
     * Instantiates a new Shop.
     *
     * @param region    the region
     * @param warehouse the warehouse
     */
    public Shop(String region, Warehouse warehouse) {
        this.region = region;
        this.warehouses = warehouse;
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


    public String toString() {
        return "Shop:" +
                "region= " + region + '\'' +
                ", warehouses= " + warehouses;
    }
}
