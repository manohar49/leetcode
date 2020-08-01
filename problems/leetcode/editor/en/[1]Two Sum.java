// Given an array of integers, return indices of the two numbers such that they a
// dd up to a specific target.
//
// You may assume that each input would have exactly one solution, and you may n
// ot use the same element twice.
//
// Example:
//
//
// Given nums = [2, 7, 11, 15], target = 9,
//
// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].
//
// Related Topics Array Hash Table
// 👍 15958 👎 578

import java.util.HashMap;
import java.util.Map;

// leetcode submit region begin(Prohibit modification and deletion)
class Solution1 {
  public int[] twoSum(int[] nums, int target) {

      int[] ret = new int[2];
      Map<Integer, Integer> ht = new HashMap<>();
      for (int i = 0; i < nums.length; i++) {
          if (ht.containsKey(target - nums[i])) {
              ret[0] = ht.get(target - nums[i]);
              ret[1] = i;
          } else {
              ht.put(nums[i], i);
          }
      }
      return ret;
  }
}
// leetcode submit region end(Prohibit modification and deletion)
