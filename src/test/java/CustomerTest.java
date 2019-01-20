import Instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Kevin", 200.00);
    }

    @Test
    public void getName() {
        assertEquals("Kevin", customer.getName());
    }

    @Test
    public void getMoney() {
        assertEquals(200.00, customer.getMoney(), 0.01);
    }

    @Test
    public void setMoney() {
        customer.setMoney(100.00);
        assertEquals(100.00, customer.getMoney(), 0.01);
    }
}