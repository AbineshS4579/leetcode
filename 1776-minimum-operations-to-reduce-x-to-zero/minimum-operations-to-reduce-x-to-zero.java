class Solution {
    public int minOperations(int[] nums, int x) {
        int t=0;
        for(int i:nums)t+=i;
        int tr=t-x;
        if(tr<0)return -1;
        if(tr==0)return nums.length;
        int j=0,m=-1,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>tr){
                sum-=nums[j];
                j++;
            }
            if(sum==tr)
            m=Math.max(m,i-j+1);
        }
        return m==-1?-1:nums.length-m;
    }
}