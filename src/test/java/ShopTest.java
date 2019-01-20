import Instruments.Guitar;
import Instruments.Instrument;
import Instruments.InstrumentFamily;
import SellableItems.SellableItem;
import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    ISell guitar;
    ISell drumStick;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("Ray's Music Exchange");
        guitar = new Guitar(InstrumentFamily.STRINGS, "bass", 70.00, 100.00);
        drumStick = new SellableItem("Drum Sticks", 6.00, 10.00);
    }

    @Test
    public void getShopName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void shopStartsWithNoStock() {
        assertEquals(0, shop.getTotalNumberOfItemsInStock());
    }

    @Test
    public void canAddItemToStock() {
        shop.addItemToStock(guitar);
        assertEquals(1, shop.getTotalNumberOfItemsInStock());
    }

    @Test
    public void removeItemFromStock() {
        shop.addItemToStock(guitar);
        assertEquals(1, shop.getTotalNumberOfItemsInStock());
        shop.removeItemFromStock(guitar);
        assertEquals(0, shop.getTotalNumberOfItemsInStock());
    }

    @Test
    public void canCalculateTotalPotentialProfitOfStock(){
        shop.addItemToStock(guitar);
        shop.addItemToStock(drumStick);
        assertEquals(34.00, shop.getTotalPotentialProfitOfStock(), 0.01);
    }

}