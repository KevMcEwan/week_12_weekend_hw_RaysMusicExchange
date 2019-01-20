package SellableItems;

import Instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SellableItemTest {

    SellableItem guitarStrings;
    SellableItem drumSticks;

    @Before
    public void setUp() throws Exception {
        guitarStrings = new SellableItem("Guitar Strings", 3.00, 5.00);
        drumSticks = new SellableItem("Drum Sticks", 6, 10);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Guitar Strings", guitarStrings.getDescription());
    }

    @Test
    public void canGetPriceBoughtIn(){
        assertEquals(6.00, drumSticks.getPriceBoughtIn(), 0.01);
    }

    @Test
    public void canChangePriceBoughtIn(){
        assertEquals(6.00, drumSticks.getPriceBoughtIn(), 0.01);
        drumSticks.setPriceBoughtIn(6.50);
        assertEquals(6.50, drumSticks.getPriceBoughtIn(), 0.01);
    }

    @Test
    public void canGetPriceToSell(){
        assertEquals(5.00,  guitarStrings.getPriceToSell(), 0.01);
    }

    @Test
    public void canChangePriceToSell(){
        assertEquals(5.00,  guitarStrings.getPriceToSell(), 0.01);
        guitarStrings.setPriceToSell(5.40);
        assertEquals(5.40, guitarStrings.getPriceToSell(), 0.01);

    }

    @Test
    public void calculatePercentageMarkup() {
        assertEquals(2, guitarStrings.calculateMarkup(), 0.01);
    }
}