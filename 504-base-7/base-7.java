class Solution {
    public String convertToBase7(int nums) {
        if(nums==0)return "0";
        String s="";
        boolean t=nums<0;
        int num=Math.abs(nums);
        while(num>0){
            s=num%7+s;
            num/=7;
        }
        if(t)return "-"+s;
        return s;
    }
}