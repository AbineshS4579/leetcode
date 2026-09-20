class Solution {
    public int maxRotateFunction(int[] nums) {
        long n=nums.length,sum=0,f=0;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=0;j<n;j++){
        //         sum+=((i+j)%n)*nums[j];
        //     }
        //     m=Math.max(sum,m);
        // }
        for(int i=0;i<n;i++){
            sum+=nums[i];
            f+=i*nums[i];
        }
        long m=f;
        for(int i=1;i<n;i++){
            f=f+sum-n*nums[(int)n-i];
            m=Math.max(m,f);
        }
        return (int)m;
    }
}