class Solution {
    public String removeOuterParentheses(String s) {
       String e="";
       int ct=0;
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='('){
            if(ct>0){
                e+=c;
            }
            ct++;
        }
        else{
            ct--;
            if(ct>0){
                e+=c;
            }
        }
       } 
       return e;
    }
}