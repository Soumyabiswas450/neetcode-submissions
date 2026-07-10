class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        int temp[] = new int[n];
        int i , j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(nums[i]==nums[j] && i!=j){
                    return true;
                }
            }
        }
        return false;
    }
}