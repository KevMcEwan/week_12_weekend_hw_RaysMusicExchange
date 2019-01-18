package Instruments;

public class Ocarina extends Instrument {


    public Ocarina(InstrumentFamily family, String type) {
        super(family, type);
    }

    @Override
    public String play() {
        return super.play() + "Saria's Song";
    }
}
