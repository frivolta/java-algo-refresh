package com.filipporivolta.algos.demo.standard;

import java.util.*;
import java.util.stream.Collectors;

public class PermutationsII {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> newNums = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        Collections.sort(newNums);  // Optional: Sort to ensure duplicates are adjacent
        List<List<Integer>> res = new ArrayList<>();
        this.bt(newNums, newNums, new ArrayList<>(), res);
        return res;
    }

    private void bt(List<Integer> nums, List<Integer> remainingNums, List<Integer> path, List<List<Integer>> res){
        if(path.size() == nums.size()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0; i < remainingNums.size(); i++){
            if(i > 0 && Objects.equals(remainingNums.get(i), remainingNums.get(i - 1))) continue;
            path.add(remainingNums.get(i));
            List<Integer> newRemainingNums = new ArrayList<>(remainingNums);
            newRemainingNums.remove(i);
            bt(nums, newRemainingNums, path, res);
            path.remove(path.size() - 1);
        }
    }
}
