// Given an integer array nums, find the contiguous subarray (containing at least
// one number) which has the largest sum and return its sum.
//
// Example:
//
//
// Input: [-2,1,-3,4,-1,2,1,-5,4],
// Output: 6
// Explanation: [4,-1,2,1] has the largest sum = 6.
//
//
// Follow up:
//
// If you have figured out the O(n) solution, try coding another solution using
// the divide and conquer approach, which is more subtle.
// Related Topics Array Divide and Conquer Dynamic Programming
// 👍 8237 👎 392

// leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  public int maxSubArray(int[] nums) {
    return maxSubArray(nums, 0, nums.length - 1);
  }

  public int maxSubArray(int[] nums, int left, int right) {

    if (left == right) {
      return nums[left];
    }

    int leftMax, rightMax;
    leftMax = rightMax = Integer.MIN_VALUE;

    int mid = left + (right - left) / 2;

    for (int i = mid, sum = 0; i >= left; --i) {
      leftMax = Math.max(leftMax, sum += nums[i]);
    }

    for (int j = mid + 1, sum = 0; j <= right; ++j) {
      rightMax = Math.max(rightMax, sum += nums[j]);
    }

    return Math.max(
        Math.max(maxSubArray(nums, left, mid), maxSubArray(nums, mid + 1, right)),
        leftMax + rightMax);
  }
}
// leetcode submit region end(Prohibit modification and deletion)
