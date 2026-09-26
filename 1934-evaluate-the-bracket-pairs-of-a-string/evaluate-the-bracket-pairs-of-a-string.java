class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder a=new StringBuilder();
        Map<String,String> m=new HashMap<>();
        for(List<String> i:knowledge){
            m.put(i.get(0),i.get(1));
        }
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                int j=i+1;
                String k="";
                while(s.charAt(j)!=')'){
                    k+=s.charAt(j);
                    j++;
                }
                if(m.containsKey(k)){
                    a.append(m.get(k));
                }
                else a.append("?");
                i=j;
            }
            else
            a.append(s.charAt(i));
            i++;
        }
        return a.toString();
    }
}