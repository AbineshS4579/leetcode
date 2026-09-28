class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:deck){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int g=0;
        for(Map.Entry<Integer,Integer> b:m.entrySet()){
            g=f(g,b.getValue());
        }
        return g>=2;
    }
     private int f(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}