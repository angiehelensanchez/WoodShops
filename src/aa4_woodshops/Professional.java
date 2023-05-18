package aa4_woodshops;

public class Professional extends Customer{

    public Professional(String nif, String name, String customerType, Float discount) {
        super(nif, name, customerType, discount);
    }

    /**
     *
     * @return
     */
    @Override
    public Float getDiscount() {
        return discount;
    }

    /**
     *
     * @param discount
     */
    @Override
    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
         return "\n  |Nif= " + nif + "\n" +
                "\n  |Name= " + name + "\n" +
                "\n  |Discount= " + discount + "\n" +
                "\n  |Type=" + customerType + "\n";
    }
}
