// Roman numerals are represented by seven different symbols: I, V, X, L, C, D an
// d M.
//
//
// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
//
// For example, two is written as II in Roman numeral, just two one's added toge
// ther. Twelve is written as, XII, which is simply X + II. The number twenty seven
// is written as XXVII, which is XX + V + II.
//
// Roman numerals are usually written largest to smallest from left to right. Ho
// wever, the numeral for four is not IIII. Instead, the number four is written as
// IV. Because the one is before the five we subtract it making four. The same prin
// ciple applies to the number nine, which is written as IX. There are six instance
// s where subtraction is used:
//
//
// I can be placed before V (5) and X (10) to make 4 and 9.
// X can be placed before L (50) and C (100) to make 40 and 90.
// C can be placed before D (500) and M (1000) to make 400 and 900.
//
//
// Given a roman numeral, convert it to an integer. Input is guaranteed to be wi
// thin the range from 1 to 3999.
//
// Example 1:
//
//
// Input: "III"
// Output: 3
//
// Example 2:
//
//
// Input: "IV"
// Output: 4
//
// Example 3:
//
//
// Input: "IX"
// Output: 9
//
// Example 4:
//
//
// Input: "LVIII"
// Output: 58
// Explanation: L = 50, V= 5, III = 3.
//
//
// Example 5:
//
//
// Input: "MCMXCIV"
// Output: 1994
// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
// Related Topics Math String
// 👍 2301 👎 3561

// leetcode submit region begin(Prohibit modification and deletion)
class Solution13 {
  public int romanToInt(String s) {

    int len = s.length();
    int ret = 0;
    for (int i = 0; i < len; i++) {
      int val1 = value(s.charAt(i));
      if (i + 1 < len) {
        int val2 = value(s.charAt(i + 1));
        if (val1 < val2) {
          ret = ret + val2 - val1;
          i++;
        } else {
          ret = ret + val1;
        }
      } else {
        ret = ret + val1;
      }
    }
    return ret;
  }

  public int value(char r) {
    if (r == 'I') return 1;
    if (r == 'V') return 5;
    if (r == 'X') return 10;
    if (r == 'L') return 50;
    if (r == 'C') return 100;
    if (r == 'D') return 500;
    if (r == 'M') return 1000;

    return -1;
  }
}
// leetcode submit region end(Prohibit modification and deletion)
