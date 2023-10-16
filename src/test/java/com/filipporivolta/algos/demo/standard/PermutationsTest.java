package com.filipporivolta.algos.demo.standard;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PermutationsTest {

    @Test
    public void testPermute() {
        Permutations permutations = new Permutations();

        int[] input = {1, 2, 3};
        List<List<Integer>> result = permutations.permute(input);

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3, 2),
                Arrays.asList(2, 1, 3),
                Arrays.asList(2, 3, 1),
                Arrays.asList(3, 1, 2),
                Arrays.asList(3, 2, 1)
        );

        assertTrue(containsAll(result, expected));
    }

    private boolean containsAll(List<List<Integer>> list1, List<List<Integer>> list2) {
        for (List<Integer> sublist : list2) {
            if (!list1.contains(sublist)) {
                return false;
            }
        }
        return true;
    }
}
