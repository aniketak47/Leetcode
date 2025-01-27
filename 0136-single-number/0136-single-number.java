class Solution {
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val:nums) {
            if(map.containsKey(val)) {
                map.put(val, map.get(val)+1);
            } else {
                map.put(val, 1);
            }
        }

        for(Map.Entry<Integer, Integer> set : map.entrySet()) {
            if(set.getValue() == 1) {
                ans = set.getKey();
            }
        }
        return ans;
    }
    
    // public int singleNumber(int[] nums) {
    //     int finder = 0;
    //     for(int val: nums) {
    //         finder = finder ^ val;
    //     }

    //     return finder;
    // }
}