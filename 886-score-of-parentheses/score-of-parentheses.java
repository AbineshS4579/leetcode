class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> S=new Stack<>();
        S.push(0);
        for(char i:s.toCharArray()){
            if(i=='('){
                S.push(0);
            }
            else{
                int b,a=S.pop();
                if(a==0){
                    b=1;
                }else{
                    b=2*a;
                }
                S.push(S.pop()+b);
            }
        }
        return S.peek();
    }
}