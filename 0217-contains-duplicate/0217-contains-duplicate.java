class Solution {
    // TC : O(N2), SC : O(1)
    // public boolean containsDuplicate(int[] nums) {
    //     for(int i=0;i<nums.length;i++) {
    //         for(int j=0;j<nums.length;j++) {
    //             if(i != j && nums[i] == nums[j]) {
    //                 return true;
    //             }
    //         }
    //     }

    //     return false;
    // }

    // TC : O(N), SC : O(N)
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            if(set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
        }

        return false;
    }
}