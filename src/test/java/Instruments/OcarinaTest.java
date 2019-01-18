package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OcarinaTest {

    Ocarina ocarina;

    @Before
    public void setUp() throws Exception {
        ocarina = new Ocarina(InstrumentFamily.WOODWIND, "Ocarina of Time");
    }

    @Test
    public void ocarinaHasFamily(){
        assertEquals(InstrumentFamily.WOODWIND, ocarina.getFamily());
    }

    @Test
    public void ocarinaHasType(){
        assertEquals("Ocarina of Time", ocarina.getType());
    }

    @Test
    public void ocarinaCanPlay(){
        assertEquals("I can play Saria's Song", ocarina.play());
    }
}