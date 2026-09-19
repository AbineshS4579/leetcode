class Solution {
    public String toHex(int num) {
       char a[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
       String s="";if(num==0)return "0";
       while(num!=0){
        int r=num&15;
        s=a[Math.abs(r)]+s;
        num=num>>>4;
       } 
       return s;
    }
}