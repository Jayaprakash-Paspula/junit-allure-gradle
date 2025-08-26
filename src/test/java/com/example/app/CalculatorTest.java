package com.example.app;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;

@Epic("Calculator Operations")
@Feature("Addition Feature")
public class CalculatorTest {

    @Test
    @Story("Addition of two positive numbers")
    @Description("Verify addition of two positive numbers")
    @Severity(SeverityLevel.CRITICAL)
    public void testAddition() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(5, calculator.add(2, 3));
    }
}
