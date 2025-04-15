package org.ext;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestTest {

    @Test
    void testAddition() {
        CalculatorTest calculator = new CalculatorTest();
        int result = calculator.addition(10, 5);
        assertEquals(15, result, "10 + 5 doit être égal à 15");
    }

    @Test
    void testSoustraction() {
        CalculatorTest calculator = new CalculatorTest();
        int result = calculator.soustraction(10, 5);
        assertEquals(5, result, "10 - 5 doit être égal à 5");
    }

    @Test
    void testAdditionAvecValeursNegatives() {
        CalculatorTest calculator = new CalculatorTest();
        int result = calculator.addition(-3, -7);
        assertEquals(-10, result, "-3 + (-7) doit être égal à -10");
    }

    @Test
    void SoustractionAvecZero() {
        CalculatorTest calculator = new CalculatorTest();
        int result = calculator.soustraction(0, 5);
        assertEquals(-5, result, "0 - 5 doit être égal à -5");
    }
}
