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
    Customer customer;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("Ray's Music Exchange", 50.00);
        guitar = new Guitar(InstrumentFamily.STRINGS, "bass", 70.00, 100.00);
        drumStick = new SellableItem("Drum Sticks", 6.00, 10.00);
        customer = new Customer("Kevin", 200.00);
    }

    @Test
    public void getShopName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void canGetTill(){
        assertEquals(50.00, shop.getTill(), 0.01);
    }

    @Test
    public void canChangeTill(){
        assertEquals(50.00, shop.getTill(), 0.01);
        shop.setTill(75.00);
        assertEquals(75.00, shop.getTill(), 0.01);

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

    @Test
    public void canGetItemPriceToSell(){
        assertEquals(100, shop.getItemPriceForSell(guitar), 0.01);
    }

    @Test
    public void canSellItemToCustomer__customerHasEnoughMoney(){
        shop.addItemToStock(guitar);
        shop.addItemToStock(drumStick);
        assertEquals(2, shop.getTotalNumberOfItemsInStock());
        shop.sellItemToCustomer(customer, guitar);
        assertEquals(1, shop.getTotalNumberOfItemsInStock() );
        assertEquals(100.00, customer.getMoney(), 0.01);
        assertEquals(150.00, shop.getTill(), 0.01);
    }

    @Test
    public void canSellItemToCustomer__customerDoesNotHaveEnoughMoney(){
        shop.addItemToStock(guitar);
        shop.addItemToStock(drumStick);
        assertEquals(2, shop.getTotalNumberOfItemsInStock());
        customer.setMoney(90.00);
        shop.sellItemToCustomer(customer, guitar);
        assertEquals(2, shop.getTotalNumberOfItemsInStock() );
        assertEquals(90.00, customer.getMoney(), 0.01);
        assertEquals(50.00, shop.getTill(), 0.01);
    }

    @Test
    public void canBuyItemFromCustomer__tillHasEnoughMoney(){
        assertEquals(0, shop.getTotalNumberOfItemsInStock());
        customer.addItemToPurchasedItems(drumStick);
        shop.buyItemFromCustomer(customer, drumStick);
        assertEquals(1, shop.getTotalNumberOfItemsInStock());
        assertEquals(206.00, customer.getMoney(), 0.01);
        assertEquals(44.00, shop.getTill(), 0.01);
    }

    @Test
    public void canBuyItemFromCutsomer__tillDoesNotHaveEnoughMoney(){
        assertEquals(0, shop.getTotalNumberOfItemsInStock());
        customer.addItemToPurchasedItems(guitar);
        shop.buyItemFromCustomer(customer, guitar);
        assertEquals(0, shop.getTotalNumberOfItemsInStock());
        assertEquals(200.00, customer.getMoney(), 0.01);
        assertEquals(50.00, shop.getTill(), 0.01);
    }


}