package aa3_woodshops;

/**
 * The type Supplier.
 */
public class Supplier {
    /**
     * The Nif.
     */
    public String nif;
    /**
     * The Name.
     */
    public String name;

    /**
     * Instantiates a new Supplier.
     *
     * @param nif  the nif
     * @param name the name
     */
    public Supplier(String nif, String name) {
        this.nif = nif;
        this.name = name;
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

    public String toString() {
        return "Supplier: " +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'';
    }
}
