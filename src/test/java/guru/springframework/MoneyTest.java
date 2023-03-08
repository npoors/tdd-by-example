package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
    @Test
    void testMultiplication(){
        Dollar five = new Dollar(10);
        five.times(3);
        assertEquals(30, five.amount);
    }
}
