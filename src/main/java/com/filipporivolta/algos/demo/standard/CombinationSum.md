Problem Characteristics - Backtracking for Combination Sum:

Looking for combinations that add up to a target? Consider "Backtracking".

Array/Sequence: The problem involves an array or sequence of numbers.
Target Sum: You're asked to find combinations that sum up to a target value.
Unique Combinations: The problem wants unique combinations, and numbers may or may not be reused.
Optimization: The problem might be about maximizing or minimizing something (e.g., the number of combinations).
Questions to Ask:

Reusability: Can numbers be reused in the combinations? If yes, the current number remains an option in subsequent recursive calls.
Objective: Are you trying to find all valid combinations? If yes, backtracking will help enumerate all possibilities.
Examples of Suitable Problems:

Find all unique combinations of candidates where the chosen numbers sum to target.
Find all combinations summing up to the target, with an additional constraint (e.g., each number can be used only once).
Determine if a combination exists that sums up to the target.
When NOT to Use "Backtracking":

If the problem can be solved with a greedy approach or simple mathematical operations, then backtracking might be overkill.
If dynamic programming can efficiently solve the problem by storing intermediate results.
Visualization:
Imagine walking through the candidate array. At each number:

Choose the current number and recursively search for combinations with the remaining target.
Skip the current number and recursively search for combinations with the entire target.
The recursive approach will ensure all possible paths are explored.

Key Takeaway:
Whenever you encounter a problem that asks for identifying combinations or permutations, think of the "Backtracking" approach. It's a systematic method to enumerate all possibilities and is especially suited for problems where you need to explore all potential paths or solutions.

