// Given a string s consists of upper/lower-case alphabets and empty space charac
// ters ' ', return the length of last word (last word means the last appearing wor
// d if we loop from left to right) in the string.
//
// If the last word does not exist, return 0.
//
// Note: A word is defined as a maximal substring consisting of non-space charac
// ters only.
//
// Example:
//
//
// Input: "Hello World"
// Output: 5
//
//
//
// Related Topics String
// 👍 678 👎 2481

// leetcode submit region begin(Prohibit modification and deletion)
class Solution58 {
  public int lengthOfLastWord(String s) {

    String[] array = s.split(" ", 0);

    if (array.length == 0) {
      return 0;
    }

    return array[array.length - 1].length();
  }
}
// leetcode submit region end(Prohibit modification and deletion)
