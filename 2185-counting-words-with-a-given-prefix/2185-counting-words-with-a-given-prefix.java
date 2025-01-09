class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans = 0;
        int n = pref.length();
        for (String w : words) {
            if (w.length() >= n && w.startsWith(pref)) {
                ans++;
            }
        }
        return ans;
    }
}