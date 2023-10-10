package com.filipporivolta.algos.demo.standard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLongestPalindromic {

    private LongestPalindromic longestPalindromic;

    @BeforeEach
    public void setUp() {
        longestPalindromic = new LongestPalindromic();
    }

    @Test
    public void testEmptyString() {
        assertEquals("", longestPalindromic.longestPalindrome(""));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals("a", longestPalindromic.longestPalindrome("a"));
    }

    @Test
    public void testTwoDifferentCharacters() {
        assertEquals("a", longestPalindromic.longestPalindrome("ab"));
    }

    @Test
    public void testTwoSameCharacters() {
        assertEquals("aa", longestPalindromic.longestPalindrome("aa"));
    }

    @Test
    public void testEvenLengthPalindrome() {
        assertEquals("bb", longestPalindromic.longestPalindrome("cbbd"));
    }

    @Test
    public void testLongStringWithPalindromeAtEnd() {
        assertEquals("anana", longestPalindromic.longestPalindrome("banana"));
    }

    @Test
    public void testLongStringWithPalindromeAtStart() {
        assertEquals("racecar", longestPalindromic.longestPalindrome("racecarapple"));
    }

    @Test
    public void testStringWithNoPalindrome() {
        assertEquals("r", longestPalindromic.longestPalindrome("rainbow"));
    }
}