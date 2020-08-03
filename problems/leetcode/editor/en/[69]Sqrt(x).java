// Implement int sqrt(int x).
//
// Compute and return the square root of x, where x is guaranteed to be a non-ne
// gative integer.
//
// Since the return type is an integer, the decimal digits are truncated and onl
// y the integer part of the result is returned.
//
// Example 1:
//
//
// Input: 4
// Output: 2
//
//
// Example 2:
//
//
// Input: 8
// Output: 2
// Explanation: The square root of 8 is 2.82842..., and since
//              the decimal part is truncated, 2 is returned.
//
// Related Topics Math Binary Search
// 👍 1368 👎 1927

// leetcode submit region begin(Prohibit modification and deletion)
class Solution69 {
  public int mySqrt(int x) {

    if (x == 0 || x == 1) {
      return x;
    }
    long low = 0;
    long high = x;

    while (low + 1 < high) {

      long mid = low + (high - low) / 2;
      long sqr = mid * mid;

      if (sqr == x) {
        return (int) mid;
      }
      if (sqr < x) {
        low = mid;
      } else {
        high = mid;
      }
    }
    return (int) low;
  }
}
// leetcode submit region end(Prohibit modification and deletion)
