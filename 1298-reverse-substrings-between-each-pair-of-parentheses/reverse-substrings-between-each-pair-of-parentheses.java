class Solution {
    public String reverseParentheses(String s) {
        StringBuilder a=new StringBuilder(s);
        int f=a.lastIndexOf("("),l=a.indexOf(")",f);
        while(f!=-1&&l!=-1){
           StringBuilder temp = new StringBuilder(a.substring(f + 1, l));
temp.reverse();

a.replace(f + 1, l, temp.toString());
            a.deleteCharAt(f);
            a.deleteCharAt(l-1);
            f=a.lastIndexOf("(");
            l=a.indexOf(")",f);
        }
        return a.toString();
    }
}