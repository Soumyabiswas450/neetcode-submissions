class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i,j = 0;
        int count = 0;
        int temp[] = new int[n];

           for (i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}