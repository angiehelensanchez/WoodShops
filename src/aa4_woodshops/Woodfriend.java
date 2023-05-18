package aa4_woodshops;

/**
 * The type Woodfriend.
 */
public class Woodfriend extends Customer {
    /**
     * The Number.
     */
    public int number;


    /**
     * Instantiates a new Woodfriend.
     *
     * @param nif          the nif
     * @param name         the name
     * @param customerType the customer type
     * @param discount     the discount
     * @param number       the number
     */
    public Woodfriend(String nif, String name, String customerType, Float discount, int number) {
        super(nif, name, customerType, discount);
        this.number = number;
    }

    /**
     * Gets number.
     *
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets number.
     *
     * @param number the number
     */
    public void setNumber(int number) {
        this.number = number;
    }



    @Override
    public String toString() {
        return "\n  |Nif= " + nif + "\n" +
                "\n  |Name= " + name + "\n" +
                "\n  |Number= " + number + "\n" +
                "\n  |Discount= " + discount + "\n" +
                "\n  |Type=" + customerType + "\n";
    }
}

