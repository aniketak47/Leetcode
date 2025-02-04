class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];
        int ans = nums[0];

        for(int i=1;i<nums.length;i++) {
            if(nums[i]>nums[i-1]) {
                maxSum += nums[i];
            } else {
                maxSum = nums[i];
            }

            if(maxSum > ans) {
                ans = maxSum;
            }
        }

        return ans;
    }
}