package org.ext;

import monpackage.CalculImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestTest {

    @Test
    void testAddition() {
        OperationsMathematiques calculator = new CalculImpl();
        double result = calculator.addition(10, 5);
        assertEquals(15, result, 0.01);
    }

}
