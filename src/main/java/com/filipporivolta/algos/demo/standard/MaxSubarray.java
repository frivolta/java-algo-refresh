package com.filipporivolta.algos.demo.standard;

public class MaxSubarray {
    public int maxSubArray(int[] nums){
        int maxGlobal = nums[0];
        int currentMax = nums[0];
        for(int i=1; i<nums.length; i++){
           currentMax =  Math.max(nums[i], currentMax+nums[i]);
           if(currentMax>maxGlobal){
               maxGlobal=currentMax;
           }
        }
        return maxGlobal;
    }
}
