class Solution {
    public int singleNumber(int[] nums) {
        int finder = 0;
        for(int val: nums) {
            finder = finder ^ val;
        }

        return finder;
    }
}