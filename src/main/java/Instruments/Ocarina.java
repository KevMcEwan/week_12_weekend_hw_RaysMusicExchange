package Instruments;

public class Ocarina extends Instrument {


    public Ocarina(InstrumentFamily family, String type, double priceBoughtIn, double priceToSell) {
        super(family, type, priceBoughtIn, priceToSell);
    }

    @Override
    public String play() {
        return super.play() + "Saria's Song";
    }
}
