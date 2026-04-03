class Solution {
    public int missingNumber(int[] nums) {
        //Using Math
        int n = nums.length;
        int expected = (n*(n+1))/2;
        int actualSum=0;
        for(int i=0; i<nums.length; i++){
            actualSum+=nums[i];
        }

        return expected-actualSum;
    }
}
