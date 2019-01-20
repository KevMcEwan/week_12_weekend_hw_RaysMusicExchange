package Instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private InstrumentFamily family;
    private String type;
    private double priceBoughtIn;
    private double priceToSell;

    public Instrument(InstrumentFamily family, String type, double priceBoughtIn, double priceToSell) {
        this.family = family;
        this.type = type;
        this.priceBoughtIn = priceBoughtIn;
        this.priceToSell = priceToSell;
    }

    public InstrumentFamily getFamily() {
        return family;
    }

    public String getType() {
        return type;
    }

    public String play(){
        return "I can play ";
    }

    public double calculateMarkup(){
        return priceToSell - priceBoughtIn;
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


}
