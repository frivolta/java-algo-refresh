/**
 * @param {string} digits
 * @return {string[]}
 */
const phone_mapping = ["", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"];

var letterCombinations = function(digits) {
    const res = [];

    const backtracking = (currIdx, currRes) => {
        if (currIdx === digits.length) {
            // If you've processed all digits, add the current result to the results array
            res.push(currRes);
            return;
        }

        const currDigit = digits[currIdx];
        const letters = phone_mapping[currDigit];

        for (let i = 0; i < letters.length; i++) {
            // Make a recursive call for each letter
            currRes += letters[i]; // Append the letter
            backtracking(currIdx + 1, currRes);
            currRes = currRes.slice(0, -1); // Remove the last added letter to backtrack
        }
    };

    // Start the backtracking process
    if (digits.length > 0) {
        backtracking(0, "");
    }

    return res;
};

// Example usage
const input = "23";
const result = letterCombinations(input);
console.log(result); // Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
