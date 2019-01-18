package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar(InstrumentFamily.STRINGS, "six string");
    }

    @Test
    public void guitarHasFamily(){
        assertEquals(InstrumentFamily.STRINGS, guitar.getFamily());
    }

    @Test
    public void guitarHasType(){
        assertEquals("six string", guitar.getType());
    }

    @Test
    public void guitarCanPlay(){
        assertEquals("I can play Freebird", guitar.play());
    }
}