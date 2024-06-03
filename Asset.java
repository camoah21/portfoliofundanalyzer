package com.realestatefundanalyzer.realestatefundanalyzer;

public class Asset {

    private Long id;
    private String symbol;
    private int quantity;
    private double purchasePrice;

    private User user;

    /**
     * The Asset function is a constructor that takes in the name of an asset,
     * its value, and its risk. It then sets these values to the corresponding
     * variables in this class.
     *
     *
     * @return A new asset object
     *
     * @docauthor Chris Amoah
     */
    public Asset() {
    }

    /**
     * The Asset function is a constructor that creates an Asset object.
     *
     *
     * @param Long id Set the id of the asset
     * @param String symbol Set the symbol of the asset
     * @param int quantity Set the quantity of the asset
     * @param double purchasePrice Set the purchase price of the asset
     * @param User user Set the user field of the asset object
     *
     * @return An asset object
     *
     * @docauthor Chris Amoah
     */
    public Asset(Long id, String symbol, int quantity, double purchasePrice, User user) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
        this.user = user;
    }

    /**
     * The getId function returns the id of a given object.
     *
     *
     *
     * @return The id of the object
     *
     * @docauthor Chris Amoah
     */
    public Long getId() {
        return id;
    }

    /**
     * The setId function is used to set the id of a particular instance of the
     * User class.
     *
     *
     * @param Long id Set the id field of the object
     *
     * @return Void
     *
     * @docauthor Chris Amoah
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * The setSymbol function sets the symbol of a stock.
     *
     *
     *
     * @return The symbol of the card
     *
     * @docauthor Chris Amoah
     */
    public String setSymbol() {
        return symbol;
    }

    /**
     * The getSymbol function returns the symbol of a stock.
     *
     *
     *
     * @return The symbol of the card
     *
     * @docauthor Chris Amoah
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * The setSymbol function sets the symbol of a stock object.
     *
     *
     * @param String symbol Set the symbol of the stock
     *
     * @return Nothing, so it is void
     *
     * @docauthor Chris Amoah
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * The getQuantity function returns the quantity of a product.
     *
     *
     *
     * @return The quantity of the item
     *
     * @docauthor Chris Amoah
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * The setQuantity function sets the quantity of a product.
     *
     *
     * @param int quantity Set the quantity of a product
     *
     * @return Nothing
     *
     * @docauthor Chris Amoah
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * The getPurchasePrice function returns the purchase price of a stock.
     *
     *
     *
     * @return The purchaseprice variable
     *
     * @docauthor Chris Amoah
     */
    public double getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * The setPurchasePrice function sets the purchase price of a car.
     *
     *
     * @param double purchasePrice Set the value of the purchaseprice variable
     *
     * @return Nothing, so it returns void
     *
     * @docauthor Chris Amoah
     */
    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    /**
     * The getUser function returns the user object.
     *
     *
     *
     * @return The user object
     *
     * @docauthor Chris Amoah
     */
    public User getUser() {
        return user;
    }

    /**
     * The setUser function sets the user variable to a new User object.
     *
     *
     * @param User user Set the user object
     *
     * @return Void
     *
     * @docauthor Chris Amoah
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * The getAssetValue function returns the value of the asset.
     *
     *
     *
     * @return The value of the asset
     *
     * @docauthor Chris Amoah
     */
    public double getAssetValue() {
        return quantity * purchasePrice;
    }

}
