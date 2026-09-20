class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int m=0,c[]=new int[46];
        for(int i=lowLimit;i<=highLimit;i++){
            int n=i,sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        c[sum]++;
        m=Math.max(m,c[sum]);
        }
        return m;
    }
}