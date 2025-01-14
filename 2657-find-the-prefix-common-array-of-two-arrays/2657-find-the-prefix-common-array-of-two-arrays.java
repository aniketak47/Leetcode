class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] fre = new int[A.length]; 
        int[] ans = new int[A.length]; 
        int temp = 0; 

        for (int i = 0; i < A.length; i++) {
            fre[A[i] - 1]++;
            if (fre[A[i] - 1] == 2) temp++;

            fre[B[i] - 1]++;
            if (fre[B[i] - 1] == 2) temp++;

            ans[i] = temp;
        }

        return ans;
    }
}