class Solution {
    public int removeDuplicates(int[] nums) {
        int lastUniqueIdx = 0;

        for(int i=1;i<nums.length;i++) {
            if(nums[lastUniqueIdx] != nums[i]) {
                nums[lastUniqueIdx + 1] = nums[i];
                lastUniqueIdx++;
            }
        }

        return lastUniqueIdx + 1;
    }
}