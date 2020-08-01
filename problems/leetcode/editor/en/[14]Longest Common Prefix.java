// Write a function to find the longest common prefix string amongst an array of
// strings.
//
// If there is no common prefix, return an empty string "".
//
// Example 1:
//
//
// Input: ["flower","flow","flight"]
// Output: "fl"
//
//
// Example 2:
//
//
// Input: ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
//
//
// Note:
//
// All given inputs are in lowercase letters a-z.
// Related Topics String
// 👍 2688 👎 1899

// leetcode submit region begin(Prohibit modification and deletion)
class Solution14 {
  public String longestCommonPrefix(String[] strs) {

    StringBuilder commonPrefix = new StringBuilder();

    if (strs == null || strs.length == 0) {
      return commonPrefix.toString();
    }

    int lengthOfSmallString = Integer.MAX_VALUE;
    for (String s : strs) {
      lengthOfSmallString = Math.min(s.length(), lengthOfSmallString);
    }

    for (int i = 0; i < lengthOfSmallString; i++) {
      char currentChar = strs[0].charAt(i);
      for (String s : strs) {
        if (s.charAt(i) != currentChar) {
          return commonPrefix.toString();
        }
      }
      commonPrefix.append(currentChar);
    }
    return commonPrefix.toString();
  }
}
// leetcode submit region end(Prohibit modification and deletion)
