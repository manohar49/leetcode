// Given a non-empty array of digits representing a non-negative integer, increme
// nt one to the integer.
//
// The digits are stored such that the most significant digit is at the head of
// the list, and each element in the array contains a single digit.
//
// You may assume the integer does not contain any leading zero, except the numb
// er 0 itself.
//
// Example 1:
//
//
// Input: [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
//
//
// Example 2:
//
//
// Input: [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
//
// Related Topics Array
// 👍 1614 👎 2480

import java.util.ArrayList;
import java.util.List;

// leetcode submit region begin(Prohibit modification and deletion)
class Solution66 {
  public int[] plusOne(int[] digits) {

    int carry = 1;
    List<Integer> list = new ArrayList<>();
    for (int i = digits.length - 1; i >= 0; i--) {
      int sum = digits[i] + carry;
      if (sum == 10) {
        list.add(0, 0);
      } else {
        list.add(0, sum);
        carry = 0;
      }
    }
    if (carry == 1) {
      list.add(0, 1);
    }
    int[] ret = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      ret[i] = list.get(i);
    }
    return ret;
  }
}
// leetcode submit region end(Prohibit modification and deletion)
