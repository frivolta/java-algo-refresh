Problem Characteristics lengthOfLongestSubstring:
Optimizing for longest unique substring? Think lengthOfLongestSubstring.

String/Sequence: The problem involves a string or a sequence of characters.
Substring: You're asked to find a contiguous substring.
Optimization: The problem is about maximizing something (e.g., length of unique substring).

Questions to Ask:

Contiguous Requirement: Does the problem specify that the characters need to be contiguous? If yes, lengthOfLongestSubstring is a potential candidate.
Nature of Characters: Does the string contain repeating characters? The algorithm is designed to handle such scenarios.
Objective: Are you trying to find the maximum length of a substring without repeating characters? If yes, think of lengthOfLongestSubstring.
Examples of Suitable Problems:

Find the length of the longest substring without repeating characters.
Find the actual longest substring without repeating characters.
Determine if a string has all unique characters.
When NOT to Use lengthOfLongestSubstring Algorithm:

If the problem asks for non-contiguous characters, this algorithm won't work directly.
If the problem involves more complex operations or conditions within the substring, a different approach might be needed.
Visualization:
Imagine walking through the string from left to right. At each step:

Check if the current character exists in the current substring.
If it exists, break and start a new substring from the next character.
If it doesn't exist, continue adding characters to the current substring.
Keep track of the maximum length of unique substrings encountered.
Key Takeaway:
Whenever you encounter a problem that asks for the maximum length of a substring without repeating characters, think of the lengthOfLongestSubstring algorithm as your first approach. It's a straightforward tool for such problems and can often lead to efficient solutions.