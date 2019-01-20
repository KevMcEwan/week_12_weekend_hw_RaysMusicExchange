package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar(InstrumentFamily.STRINGS, "six string", 70, 100);
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

    @Test
    public void canGetPriceBoughtIn(){
        assertEquals(70.00, guitar.getPriceBoughtIn(), 0.01);
    }

    @Test
    public void canGetPriceToSell(){
        assertEquals(100.00, guitar.getPriceToSell(), 0.01);
    }

    @Test
    public void canChangePriceBoughtIn(){
        assertEquals(70.00, guitar.getPriceBoughtIn(), 0.01);
        guitar.setPriceBoughtIn(75.00);
        assertEquals(75.00, guitar.getPriceBoughtIn(), 0.01);
    }

    @Test
    public void canChangePriceToSell(){
        assertEquals(100.00, guitar.getPriceToSell(), 0.01);
        guitar.setPriceToSell(110.00);
        assertEquals(110.00, guitar.getPriceToSell(), 0.01);
    }

    @Test
    public void canGetPercentageMarkup(){
        assertEquals(30.00, guitar.calculateMarkup(),0.01);
    }
}