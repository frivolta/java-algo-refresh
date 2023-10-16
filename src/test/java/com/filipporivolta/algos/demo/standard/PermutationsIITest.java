package com.filipporivolta.algos.demo.standard;

import com.filipporivolta.algos.demo.standard.PermutationsII;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PermutationsIITest {

    @Test
    public void testPermuteUnique() {
        PermutationsII permutationsII = new PermutationsII();

        int[] input1 = {1, 1, 2};
        List<List<Integer>> result1 = permutationsII.permuteUnique(input1);
        assertTrue(result1.containsAll(Arrays.asList(
                Arrays.asList(1, 1, 2),
                Arrays.asList(1, 2, 1),
                Arrays.asList(2, 1, 1)
        )) && result1.size() == 3);

        int[] input2 = {1, 2, 3};
        List<List<Integer>> result2 = permutationsII.permuteUnique(input2);
        assertTrue(result2.containsAll(Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3, 2),
                Arrays.asList(2, 1, 3),
                Arrays.asList(2, 3, 1),
                Arrays.asList(3, 1, 2),
                Arrays.asList(3, 2, 1)
        )) && result2.size() == 6);

        int[] input3 = {1};
        List<List<Integer>> result3 = permutationsII.permuteUnique(input3);
        assertTrue(result3.containsAll(Arrays.asList(
                Arrays.asList(1)
        )) && result3.size() == 1);
    }
}
