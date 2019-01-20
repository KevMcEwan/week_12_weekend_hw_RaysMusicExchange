package Instruments;

public class Trombone extends Instrument {


    public Trombone(InstrumentFamily family, String type, double priceBoughtIn, double priceToSell) {
        super(family, type, priceBoughtIn, priceToSell);
    }

    @Override
    public String play() {
        return super.play() + "A Motorbike Odyssey";
    }
}
