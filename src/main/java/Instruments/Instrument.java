package Instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private InstrumentFamily family;
    private String type;

    public Instrument(InstrumentFamily family, String type) {
        this.family = family;
        this.type = type;
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
}
