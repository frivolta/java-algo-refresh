package com.filipporivolta.algos.demo.standard;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, 0, res, new ArrayList<>());
        return res;
    }

    private void backtrack(int [] candidates, int target, int start, List<List<Integer>> res, List<Integer> currList ){
        if(target<0){
            return;
        }
        if(target==0){
            res.add(new ArrayList<>(currList));
            return;
        }

        for(int i = start; i<candidates.length; i++){
            currList.add(candidates[i]);
            backtrack(candidates, target-candidates[i], i,res, currList);
            currList.remove(currList.size()-1);
        }
    }
}
