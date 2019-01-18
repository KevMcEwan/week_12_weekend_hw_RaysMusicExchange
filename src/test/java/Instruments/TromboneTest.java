package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TromboneTest  {

    Trombone trombone;

    @Before
    public void setUp() throws Exception {
        trombone = new Trombone(InstrumentFamily.BRASS, "Tenor");
    }

    @Test
    public void getFamily() {
        assertEquals(InstrumentFamily.BRASS, trombone.getFamily());
    }

    @Test
    public void getType() {
        assertEquals("Tenor", trombone.getType());
    }

    @Test
    public void tromboneCanPlay(){
        assertEquals("I can play A Motorbike Odyssey", trombone.play());
    }
}