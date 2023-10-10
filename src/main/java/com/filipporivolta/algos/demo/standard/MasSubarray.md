Problem Characteristics Kandanes:
Optimizing contiguous sequences? Kadane's

*Array/Sequence*: The problem involves an array or a sequence of numbers.
Subarray/Subsequence: You're asked to find a contiguous subarray or subsequence.
Optimization: The problem is about maximizing or minimizing something (e.g., sum, product).
Questions to Ask:

*Contiguous Requirement*: Does the problem specify that the elements need to be contiguous? If yes, Kadane's algorithm is a potential candidate.
Nature of Elements: Are there both positive and negative numbers in the array? Kadane's algorithm is especially useful in such scenarios.
Objective: Are you trying to find the maximum sum? If yes, think of Kadane's.
Examples of Suitable Problems:

Find the contiguous subarray with the largest sum.
Find the length of the longest contiguous subarray with a positive sum.
Find the maximum product of a contiguous subarray.
When NOT to Use Kadane's Algorithm:

If the problem asks for non-contiguous elements, Kadane's algorithm won't work directly.
If the problem involves more complex operations or conditions within the subarray, a different approach might be needed.
Visualization:
Imagine walking through the array from left to right. At each step, you have two choices:

Include the current element in your subarray and continue.
Start a new subarray from the current element.
Kadane's algorithm effectively makes this decision at each step to ensure the maximum sum.

Key Takeaway:
Whenever you encounter a problem that asks for the maximum or minimum sum of a contiguous subarray, think of Kadane's algorithm as your first approach. It's a powerful tool for such problems and can often lead to efficient solutions.