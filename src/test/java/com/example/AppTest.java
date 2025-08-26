package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import io.qameta.allure.Step;

public class AppTest {

    @Test
    void testAddition() {
        int sum = add(2, 3);
        assertEquals(5, sum, "Sum should be 5");
    }

    @Step("Adding two numbers: {a} + {b}")
    int add(int a, int b) {
        return a + b;
    }
}
