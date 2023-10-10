package com.filipporivolta.algos.demo.standard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestMaxSubstringWithoutRepeatingCharacters {
    private final LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
    @Test
    public void testBasicCases() {
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void testEdgeCases() {
        assertEquals(0, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(""));
        assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("a"));
        assertEquals(2, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("au"));
    }

    @Test
    public void testComplexCases() {
        assertEquals(11, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcdeafghijk"));
    }
}
