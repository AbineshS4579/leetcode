class Solution {
    public boolean canJump(int[] nums) {
     int t=0;
     for(int i=0;i<nums.length;i++){
        if(i>t)return false;
        t=Math.max(t,nums[i]+i);
        if(t>=nums.length-1)return true;
     }   
     return true;
    }
}