package fr.itakademy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void should_add_correctly() {
        assertEquals(8, calculator.addition(4, 4));
    }

    @Test
    void should_not_add_correctly() {
        assertNotEquals(12, calculator.addition(5, 8));
    }
}
