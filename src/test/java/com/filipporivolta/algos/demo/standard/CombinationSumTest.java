package com.filipporivolta.algos.demo.standard;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinationSumTest {

    @Test
    public void testCombinationSum() {
        CombinationSum combinationSum = new CombinationSum();

        // Test Case 1
        int[] candidates1 = {2,3,6,7};
        int target1 = 7;
        List<List<Integer>> expected1 = new ArrayList<>(Arrays.asList(
                Arrays.asList(2, 2, 3),
                Arrays.asList(7)
        ));
        assertEquals(expected1, combinationSum.combinationSum(candidates1, target1));

        // Test Case 2
        int[] candidates2 = {2,3,5};
        int target2 = 8;
        List<List<Integer>> expected2 = new ArrayList<>(Arrays.asList(
                Arrays.asList(2, 2, 2, 2),
                Arrays.asList(2, 3, 3),
                Arrays.asList(3, 5)
        ));
        assertEquals(expected2, combinationSum.combinationSum(candidates2, target2));

        // Test Case 3
        int[] candidates3 = {2};
        int target3 = 1;
        List<List<Integer>> expected3 = new ArrayList<>();
        assertEquals(expected3, combinationSum.combinationSum(candidates3, target3));
    }
}
