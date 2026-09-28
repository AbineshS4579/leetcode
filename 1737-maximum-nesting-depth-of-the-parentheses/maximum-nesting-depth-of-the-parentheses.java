class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int m=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(c);
            }
            else if(c==')'){
                m=Math.max(m,st.size());
                st.pop();
            }
        }
        return m;
    }
}