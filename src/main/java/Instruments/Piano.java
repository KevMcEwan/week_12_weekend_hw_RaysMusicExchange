package Instruments;

public class Piano extends Instrument {


    public Piano(InstrumentFamily family, String type) {
        super(family, type);
    }

    @Override
    public String play() {
        return super.play() + "Moonlight Sonata";
    }
}
