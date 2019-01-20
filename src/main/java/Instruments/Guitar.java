package Instruments;

public class Guitar extends Instrument {


    public Guitar(InstrumentFamily family, String type, double priceBoughtIn, double priceToSell) {
        super(family, type, priceBoughtIn, priceToSell);
    }

    @Override
    public String play() {
        return super.play() + "Freebird";
    }
}
