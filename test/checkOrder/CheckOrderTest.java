package checkOrder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import tdd.CheckOut;
import tdd.checkOrder.CheckOrder;
import tdd.checkOrder.Receipt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class CheckOrderTest {

    private CheckOrder order;
    private Receipt receipt;

    @BeforeEach
    public void setThisUp(){
        order = new CheckOrder("yam", 500, 8);
        order.setCashierName("Martha Danladi");
        order.setProduct("Beans");
        order.setPrice(100);
        order.setQuantity(100);
        receipt = new Receipt();
    }
    @Test
    public void testForTotalPrice(){
        order.setPrice(500);
        order.setQuantity(2);
        order.getTotalPrice();
        assertEquals(1000, order.getTotalPrice());
    }
    @Test
    public void testThatOrderCanBeAdded(){
        receipt.add(order);
        assertNotNull(order);
        receipt.display();
    }

}
