package com.filipporivolta.algos.demo.standard;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] nums, int idx, List<Integer> currList, List<List<Integer>> res ){
        if(idx==nums.length){
            res.add(new ArrayList<>(currList));
            return;
        }
        if(idx> nums.length)return;

        for (int num : nums) {
            if (currList.contains(num)) continue;
            currList.add(num);
            backtrack(nums, idx + 1, currList, res);
            currList.remove(currList.size() - 1);
        }

    }
}
