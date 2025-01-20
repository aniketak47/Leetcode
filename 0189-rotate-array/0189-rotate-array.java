class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length; // to remove duplicate rotate.

        // reverse whole array
        reverse(nums, 0, nums.length-1);

        // reverse upto k-1
        reverse(nums, 0, k-1);

        // reverse from k to n-1 (nums.length-1)
        reverse(nums, k, nums.length-1);
    }

    public void reverse(int[] nums, int start, int end) {
        while(start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            
            start++;
            end--;
        }
    }
}