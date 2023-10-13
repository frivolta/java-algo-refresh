package com.filipporivolta.algos.demo.standard;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if(height.length==1){
            return 0;
        }
        if(height.length==2){
            return Math.min(height[0], height[1]);
        }

        int s = 0;
        int e = height.length-1;
        int currMax = Integer.MIN_VALUE;
        while(s<e){
            int base = e - s;
            int h = Math.min(height[s], height[e]);
            currMax = Math.max(base*h, currMax);
            if(height[s]>height[e]){
                e--;
            }else{
                s++;
            }
        }
        return currMax;
    }
}
