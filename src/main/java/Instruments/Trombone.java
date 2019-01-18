package Instruments;

public class Trombone extends Instrument {


    public Trombone(InstrumentFamily family, String type) {
        super(family, type);
    }

    @Override
    public String play() {
        return super.play() + "A Motorbike Odyssey";
    }
}
