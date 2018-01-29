package point.of.sale;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestSale {

    @Test
    public void testFake(){
        FakeDisplay fakeDisplay = new FakeDisplay();
        FakeStorage fakeStorage = new FakeStorage();
        Sale sale = new Sale(fakeDisplay, fakeStorage);


        sale.scan("123");
        assertEquals("Milk, 3.99", fakeDisplay.getLastLine());
    }

    @Test
    public void testHashStorage() {
        FakeDisplay fakeDisplay = new FakeDisplay();
        HashStorage hashStorage = new HashStorage();

        hashStorage.put("1", "Bread, 1.99");
        hashStorage.put("2","Meat, 5.99");

        Sale sale = new Sale(fakeDisplay, hashStorage);
        sale.scan("1");
        assertEquals("Bread, 1.99", fakeDisplay.getLastLine());

        sale.scan("2");
        assertEquals("Meat, 5.99", fakeDisplay.getLastLine());

    }

}