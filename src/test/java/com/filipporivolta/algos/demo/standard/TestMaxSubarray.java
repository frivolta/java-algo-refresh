package com.filipporivolta.algos.demo.standard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMaxSubarray {
    @Test
    public void testMaxSubarray() {
        MaxSubarray solution = new MaxSubarray();

        // Test case 1: Basic test
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected1 = 6; // [4, -1, 2, 1] has the largest sum
        assertEquals(expected1, solution.maxSubArray(nums1));

        // Test case 2: All positive numbers
        int[] nums2 = {1, 2, 3, 4, 5};
        int expected2 = 15; // Entire array has the largest sum
        assertEquals(expected2, solution.maxSubArray(nums2));

        // Test case 3: All negative numbers
        int[] nums3 = {-1, -2, -3, -4, -5};
        int expected3 = -1; // The largest number itself is the largest sum
        assertEquals(expected3, solution.maxSubArray(nums3));

        // Test case 4: Mix of positive and negative numbers
        int[] nums4 = {3, -2, 5, -1};
        int expected4 = 6; // [3, -2, 5] has the largest sum
        assertEquals(expected4, solution.maxSubArray(nums4));

        // Test case 5: Single element
        int[] nums5 = {2};
        int expected5 = 2; // Only one element, so it's the largest sum
        assertEquals(expected5, solution.maxSubArray(nums5));
    }
}
