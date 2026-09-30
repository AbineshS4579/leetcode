class Solution {
    static String o[]= { "", "One", "Two", "Three", "Four", "Five","Six", "Seven", "Eight", "Nine", "Ten","Eleven", "Twelve", "Thirteen", "Fourteen","Fifteen", "Sixteen", "Seventeen", "Eighteen","Nineteen"};
   static  String t[]={"","","Twenty","Thirty", "Forty", "Fifty","Sixty", "Seventy", "Eighty", "Ninety"};
    public String numberToWords(int num) {
        if(num==0)return "Zero";
        String a="";
        if(num>=1000000000){
            a+=h(num/1000000000)+" Billion ";
            num%=1000000000;
        }
        if(num>=1000000){
            a+=h(num/1000000)+" Million ";
            num%=1000000;
        }
        
        if(num>=1000){
            a+=h(num/1000)+" Thousand ";
            num%=1000;
        }
        if(num>0)a+=h(num);
        return a.trim();
        
    }
    public static String h(int n){
        String a="";
        if(n>=100){
            a+=o[n/100]+" Hundred ";
            n%=100;
        }
        if(n>=20){
            a+=t[n/10]+" ";
            n%=10;
        }
        if(n>0){
            a+=o[n]+" ";
        }
        return a.trim();
    }
}