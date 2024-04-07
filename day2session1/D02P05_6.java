package com.learning.core.day2session1;

public class D02P05_6 {
	public static int longestPrefixSuffix(String s) {
        int n = s.length();
        int[] lps = computeLPSArray(s);
        
        // Length of the longest prefix-suffix
        return lps[n - 1];
    }
    
    private static int[] computeLPSArray(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int len = 0; // Length of the previous longest prefix suffix
        int i = 1;
        
        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    // Try to find a shorter prefix that is also a suffix
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        String input1 = "aabcdaabc";
        String input2 = "abcab";
        
        System.out.println("Output for input 1 aabcdaabc: " + longestPrefixSuffix(input1));
        System.out.println("Output for input 2 abcab : " + longestPrefixSuffix(input2));
    }

}