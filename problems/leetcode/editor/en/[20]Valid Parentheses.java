// Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
// determine if the input string is valid.
//
// An input string is valid if:
//
//
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
//
//
// Note that an empty string is also considered valid.
//
// Example 1:
//
//
// Input: "()"
// Output: true
//
//
// Example 2:
//
//
// Input: "()[]{}"
// Output: true
//
//
// Example 3:
//
//
// Input: "(]"
// Output: false
//
//
// Example 4:
//
//
// Input: "([)]"
// Output: false
//
//
// Example 5:
//
//
// Input: "{[]}"
// Output: true
//
// Related Topics String Stack
// 👍 5227 👎 226

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// leetcode submit region begin(Prohibit modification and deletion)
class Solution20 {
  public boolean isValid(String s) {

    Map<Character, Character> map = new HashMap<>();
    map.put('}', '{');
    map.put(')', '(');
    map.put(']', '[');

    if (s == null || s.length() == 0) {
      return true;
    }
    Stack<Character> stk = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char currentChar = s.charAt(i);
      if (currentChar == '{' || currentChar == '[' || currentChar == '(') {
        stk.push(currentChar);
      } else {
        if (stk.isEmpty() || map.get(currentChar) != stk.peek()) {
          return false;
        }
        stk.pop();
      }
    }
    return stk.isEmpty();
  }
}
// leetcode submit region end(Prohibit modification and deletion)
