package point.of.sale;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestSale {

    @Test
    public void test(){
        FakeDisplay fakeDisplay = new FakeDisplay();
        FakeStorage fakeStorage = new FakeStorage();

        Sale sale = new Sale(fakeDisplay, fakeStorage);
        sale.scan("123");
        assertEquals("123", fakeDisplay.getLastLine());
    }

}