package com.filipporivolta.algos.demo.standard;

import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int currMax = 0;
        for (int i=0; i<s.length(); i++){
            StringBuilder currStr = new StringBuilder();
            for(int k=i; k<s.length(); k++){
               char c = s.charAt(k);
               if(currStr.toString().contains(Character.toString(c))){
                  break;
               }
               currStr.append(s.charAt(k));
                currMax = Math.max(currMax, currStr.length());
            }
        }
        return currMax;
    }
}
