class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double s,t=0;
       for(int i=0;i<k;i++){
        t+=nums[i];
       } 
       s=t/k;
       for(int i=k;i<nums.length;i++){
        t=t-nums[i-k]+nums[i];
        s=Math.max(s,t/k);
       }
       return s;
    }
}