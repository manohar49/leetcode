// Given a 32-bit signed integer, reverse digits of an integer.
//
// Example 1:
//
//
// Input: 123
// Output: 321
//
//
// Example 2:
//
//
// Input: -123
// Output: -321
//
//
// Example 3:
//
//
// Input: 120
// Output: 21
//
//
// Note:
// Assume we are dealing with an environment which could only store integers with
// in the 32-bit signed integer range: [−231, 231 − 1]. For the purpose of this pro
// blem, assume that your function returns 0 when the reversed integer overflows.
// Related Topics Math
// 👍 3479 👎 5489

// leetcode submit region begin(Prohibit modification and deletion)
class Solution7 {
  public int reverse(int x) {

    int ret = 0;
    int num = Math.abs(x);
    while (num > 0) {
      if (ret > Integer.MAX_VALUE / 10 || (ret == Integer.MAX_VALUE / 10 && num % 10 > 7)) return 0;
      if (ret < Integer.MIN_VALUE / 10 || (ret == Integer.MIN_VALUE / 10 && num % 10 < -8))
        return 0;
      ret = ret * 10 + num % 10;
      num = num / 10;
    }
    return x < 0 ? -ret : ret;
  }
}
// leetcode submit region end(Prohibit modification and deletion)
