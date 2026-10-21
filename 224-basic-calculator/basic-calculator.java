class Solution {
    public int calculate(String s) {
        int n=0,sum=0,t=1;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                n=n*10+(c-'0');
            }
            else if(c=='+'){
                sum+=n*t;
                n=0;
                t=1;
            }
            else if(c=='-'){
                sum+=n*t;
                n=0;
                t=-1;
            }
            else if(c=='('){
                st.push(sum);
                st.push(t);
                sum=0;
                t=1;
            }else if(c==')'){
                sum+=t*n;
                n=0;
                sum*=st.pop();
                sum+=st.pop();
            }
            
        }
        sum+=t*n;
        return sum;
    }
}