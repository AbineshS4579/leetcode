class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1],c=0;
        for(int i:nums){
            c+=max-i;
        }
        return c;
    }
}