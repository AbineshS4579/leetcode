class Solution {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums,(a,b)->a[0]-b[0]);
        int s=nums[0][0];
        int e=nums[0][1];
        List<int[]> l=new ArrayList<>();
        for(int i=1;i<nums.length;i++){
            if(nums[i][0]<=e){
                e=Math.max(e,nums[i][1]);
            }
            else{
                l.add(new int[]{s,e});
                s=nums[i][0];
                e=nums[i][1];
            }
        }
        l.add(new int[]{s,e});
        return l.toArray(new int[l.size()][]);
    }
}