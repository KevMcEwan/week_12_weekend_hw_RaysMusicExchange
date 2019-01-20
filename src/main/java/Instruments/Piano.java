package Instruments;

public class Piano extends Instrument {


    public Piano(InstrumentFamily family, String type, double priceBoughtIn, double priceToSell) {
        super(family, type, priceBoughtIn, priceToSell);
    }

    @Override
    public String play() {
        return super.play() + "Moonlight Sonata";
    }
}
