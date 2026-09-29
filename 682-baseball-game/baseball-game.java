class Solution {
    public int calPoints(String[] operations) {
       List<Integer> l=new ArrayList<>();
       for(String c:operations){
        if(c.matches("-?\\d+")){
            l.add(Integer.parseInt(c));
        }
        
        else if(c.equals("C")){
                l.remove(l.size()-1);
            }else if(c.equals("D")){
                l.add(l.get(l.size()-1)*2);
            }
            else if(c.equals("+")){
                l.add(l.get(l.size()-1)+l.get(l.size()-2));
            }
        
       }
       int s=0;
       for(int i:l){
        s+=i;
       } 
       return s;
    }
}