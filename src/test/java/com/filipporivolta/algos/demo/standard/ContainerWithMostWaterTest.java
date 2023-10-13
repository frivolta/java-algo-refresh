package com.filipporivolta.algos.demo.standard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {

    private ContainerWithMostWater container;

    @BeforeEach
    public void setUp() {
        container = new ContainerWithMostWater();
    }

    @Test
    public void testSingleElementArray() {
        int[] height = {1};
        assertEquals(0, container.maxArea(height));
    }

    @Test
    public void testTwoElementArray() {
        int[] height1 = {1, 2};
        assertEquals(1, container.maxArea(height1));

        int[] height2 = {3, 1};
        assertEquals(1, container.maxArea(height2));
    }

    @Test
    public void testMultipleElementArray() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(49, container.maxArea(height));
    }

}
