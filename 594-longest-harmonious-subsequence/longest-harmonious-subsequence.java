class Solution {
    public int findLHS(int[] nums) {
        int a=0;
        Map<Integer,Integer> s=new HashMap<>();
        for(int i:nums){
            s.put(i,s.getOrDefault(i,0)+1);
        }
        for(int i:s.keySet()){
            if(s.containsKey(i+1)){
                a=Math.max(a,s.get(i)+s.get(i+1));
            }
        }
        return a;
    }
}