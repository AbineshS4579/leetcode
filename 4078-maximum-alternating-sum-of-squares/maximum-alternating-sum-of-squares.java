class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        long s=0;
        while(i<=j){
            s+=(nums[j]*nums[j])-(nums[i]*nums[i]);
            i++;
            j--;
        }
        if(nums.length%2!=0){
            int m=nums.length/2;
            return s+(nums[m]*nums[m]);
        }
        return s;
    }
}