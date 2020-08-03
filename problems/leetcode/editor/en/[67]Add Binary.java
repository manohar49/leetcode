// Given two binary strings, return their sum (also a binary string).
//
// The input strings are both non-empty and contains only characters 1 or 0.
//
// Example 1:
//
//
// Input: a = "11", b = "1"
// Output: "100"
//
// Example 2:
//
//
// Input: a = "1010", b = "1011"
// Output: "10101"
//
//
// Constraints:
//
//
// Each string consists only of '0' or '1' characters.
// 1 <= a.length, b.length <= 10^4
// Each string is either "0" or doesn't contain any leading zero.
//
// Related Topics Math String
// 👍 1943 👎 282

// leetcode submit region begin(Prohibit modification and deletion)
class Solution67 {
  public String addBinary(String a, String b) {

    int carry = 0;
    int i = a.length() - 1, j = b.length() - 1;
    StringBuilder sb = new StringBuilder();
    while (i >= 0 || j >= 0) {
      int s =
          (i >= 0 ? Integer.parseInt(a.charAt(i) + "") : 0)
              + (j >= 0 ? Integer.parseInt(b.charAt(j) + "") : 0)
              + carry;
      switch (s) {
        case 0:
          sb.append(0);
          break;
        case 1:
          sb.append(1);
          carry = 0;
          break;
        case 2:
          sb.append(0);
          carry = 1;
          break;
        case 3:
          sb.append(1);
          carry = 1;
          break;
      }
      i--;
      j--;
    }
    if (carry == 1) {
      sb.append(carry);
    }
    return sb.reverse().toString();
  }
}
// leetcode submit region end(Prohibit modification and deletion)
