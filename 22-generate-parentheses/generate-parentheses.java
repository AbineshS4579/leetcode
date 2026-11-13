class Solution {
    public List<String> a=new ArrayList<>();
    public void back(List<String> a,String s,int o,int c,int n){
        if(s.length()==2*n){
            a.add(s);
            return ;
        }
        if(o<n){
            back(a,s+"(",o+1,c,n);
        }
        if(c<o){
            back(a,s+")",o,c+1,n);
        }
    }
    public List<String> generateParenthesis(int n) {
        a.clear();
        back(a,"",0,0,n);
        return a;
    }
}