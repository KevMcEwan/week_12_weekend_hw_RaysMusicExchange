package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano(InstrumentFamily.KEYBOARD, "Grand",800.00, 1000.00);
    }

    @Test
    public void getFamily() {
        assertEquals(InstrumentFamily.KEYBOARD, piano.getFamily());
    }

    @Test
    public void getType() {
        assertEquals("Grand", piano.getType());
    }

    @Test
    public void pianoCanPlay(){
        assertEquals("I can play Moonlight Sonata", piano.play());
    }
}