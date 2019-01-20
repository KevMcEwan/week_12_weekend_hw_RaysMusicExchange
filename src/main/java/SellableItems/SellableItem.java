package SellableItems;

import behaviours.ISell;

public class SellableItem implements ISell {

    private String description;
    private double priceBoughtIn;
    private double priceToSell;

    public SellableItem(String description, double priceBoughtIn, double priceToSell) {
        this.description = description;
        this.priceBoughtIn = priceBoughtIn;
        this.priceToSell = priceToSell;
    }

    public String getDescription() {
        return description;
    }

    public double getPriceBoughtIn() {
        return priceBoughtIn;
    }

    public void setPriceBoughtIn(double priceBoughtIn) {
        this.priceBoughtIn = priceBoughtIn;
    }

    public double getPriceToSell() {
        return priceToSell;
    }

    public void setPriceToSell(double priceToSell) {
        this.priceToSell = priceToSell;
    }

    @Override
    public double calculateMarkup() {
        return priceToSell - priceBoughtIn;
    }
}
