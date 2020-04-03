class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSum = Integer.MIN_VALUE;
        int maxStartIndex = 0;
        int maxEndIndex = 0;
        
        int currentStart = 0;
        int currentSum = 0;
        for(int i=0;i<nums.length;i++){
            if(currentSum<=0)
            {
                currentStart = i;
                currentSum = nums[i];
            }else{
                currentSum += nums[i];
            }
            if(currentSum > maxSum){
                maxSum = currentSum;
                maxStartIndex = currentStart;
                maxEndIndex = i;
            }
        }
        System.out.println("st : "+maxStartIndex+" end : "+maxEndIndex);
        return maxSum;
    }
}
