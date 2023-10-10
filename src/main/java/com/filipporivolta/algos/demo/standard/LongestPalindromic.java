package com.filipporivolta.algos.demo.standard;

public class LongestPalindromic {
    public String longestPalindrome(String s) {
      String longest = "";
       for (int i=0; i<s.length();i++) {
            // check if center is odd
            String odd = this.singlePalindrome(s, i);
            if(odd.length()>longest.length()){
                longest=odd;
            }
           // check if center is even
           String even = this.doublePalindrome(s, i);
            if(even.length()>longest.length()){
                longest=even;
            }
       }
       return longest;
    }

    private String singlePalindrome(String s, int i){
        char c = s.charAt(i);
        StringBuilder res = new StringBuilder();
        res.append(c);
        int l = i-1;
        int r = i+1;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
          res.append(s.charAt(r));
          res.insert(0, s.charAt(l));
          l--;
          r++;
        }
        return res.toString();
    }

    private String doublePalindrome(String s, int i){
        if(i+1 > s.length()-1 || s.charAt(i) != s.charAt(i+1)){
            return "";
        }
        int c1 = i;
        int c2 = i+1;
        StringBuilder res = new StringBuilder();
        res.append(s.charAt(c1));
        res.append(s.charAt(c2));
        while(c1-1 >=0 && c2+1<s.length() && s.charAt(c1-1)==s.charAt(c2+1)){
            res.append(s.charAt(c2+1));
            res.insert(0, s.charAt(c1-1));
            c1--;
            c2++;
        }
        return res.toString();
    }
}
