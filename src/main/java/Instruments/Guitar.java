package Instruments;

public class Guitar extends Instrument {


    public Guitar(InstrumentFamily family, String type) {
        super(family, type);
    }

    @Override
    public String play() {
        return super.play() + "Freebird";
    }
}
