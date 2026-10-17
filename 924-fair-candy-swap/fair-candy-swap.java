class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
       int sb=0,sa=0;
       for(int i:aliceSizes)sa+=i; 
       for(int i:bobSizes)sb+=i; 
       int d=(sb-sa)/2;
       for(int i:aliceSizes) {
        int r=i+d;
        for(int j:bobSizes){
            if(r==j)return new int[]{i,j};
        }
       }
       return new int[]{};

    }
}