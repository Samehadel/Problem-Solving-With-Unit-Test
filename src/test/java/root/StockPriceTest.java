package root;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.TreeSet;

public class StockPriceTest {

    @Test
    public void checkStockPrice(){
        StockPrice stockPrice = new StockPrice();

        stockPrice.update(1, 10);
        stockPrice.update(2, 5);
        Assertions.assertEquals(5, stockPrice.current());
        Assertions.assertEquals(10, stockPrice.maximum());

        stockPrice.update(1, 3);
        Assertions.assertEquals(5, stockPrice.maximum());

        stockPrice.update(4, 2);
        Assertions.assertEquals(2, stockPrice.minimum());


    }
}
