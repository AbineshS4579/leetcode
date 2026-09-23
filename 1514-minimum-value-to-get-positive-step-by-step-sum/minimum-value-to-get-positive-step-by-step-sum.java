class Solution {
    public int minStartValue(int[] nums) {
        int s=0,m=0;
        for(int i:nums){
            s+=i;
            m=Math.min(s,m);
        }
        return 1-m;
    }
}