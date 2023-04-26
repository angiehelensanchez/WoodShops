package aa3_woodshops;

/**
 * The type Board.
 */
public class Board extends Product{
    /**
     * The Height.
     */
    public Float height;
    /**
     * The Width.
     */
    public Float width;
    /**
     * The Type board.
     */
    public String typeBoard;

    /**
     * Instantiates a new Board.
     *
     * @param productCode the product code
     * @param description the description
     * @param retailPrice the retail price
     * @param stock       the stock
     * @param supplier    the supplier
     * @param objectType  the object type
     * @param height      the height
     * @param width       the width
     * @param typeBoard   the type board
     */
    public Board(int productCode, String description, Float retailPrice, int stock, Supplier supplier, String objectType, Float height, Float width, String typeBoard) {
        super(productCode, description, retailPrice, stock, supplier, objectType);
        this.height = height;
        this.width = width;
        this.typeBoard = typeBoard;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public Float getHeight() {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(Float height) {
        this.height = height;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public Float getWidth() {
        return width;
    }

    /**
     * Sets width.
     *
     * @param width the width
     */
    public void setWidth(Float width) {
        this.width = width;
    }

    /**
     * Gets type board.
     *
     * @return the type board
     */
    public String getTypeBoard() {
        return typeBoard;
    }

    /**
     * Sets type board.
     *
     * @param typeBoard the type board
     */
    public void setTypeBoard(String typeBoard) {
        this.typeBoard = typeBoard;
    }
    @Override
    public String toString() {
        return "Product: " +
                "Height= " + height +
                ", Width= " + width +
                ", Description= " + typeBoard +
                ", Product Code= " + productCode +
                ", Description= " + description +
                ", Price= " + retailPrice + "€" +
                ", Stock= " + stock + "\n";
    }
}
