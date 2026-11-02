class Solution {
    public int minMoves2(int[] nums) {
       List<Integer> l=new ArrayList<>();
       for(int i: nums)l.add(i);
       Collections.sort(l);
       int c=0;
    //    while(l.get(0)!=l.get(l.size()-1)){
    //     int min=l.get(0),max=l.get(l.size()-1);
    //     if(max-min>1)
    //     l.set(l.size()-1,l.get(l.size()-1)-1);
    //     else
    //     l.set(0,l.get(0)+1);
    //     Collections.sort(l);
    //     c++;
    //    }
    //    return c;
    int m=l.size()/2;
    for(int i:nums){
        c+=Math.abs(i-l.get(m));
    }
    return c;
    }
}