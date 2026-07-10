class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        boolean exist = false;
        Arrays.sort(nums);
        for(int i = 0 ; i < n-1 ; i++){
            if(nums[i] == nums[i+1]){
                exist = true;
                break;
            }

        }

        return exist;
    }
}