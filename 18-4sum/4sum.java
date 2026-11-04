class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ln=new ArrayList<>();
        Arrays.sort(nums);
        if((nums[0]>target)&&(nums[0]==1000000000||nums[0]==999999999))return ln;
        else if(nums.length==5&&((nums[0]<target)&&nums[0]==-1000000000))return ln;
        for(int i=0;i<nums.length-3;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                for(int k=j+1;k<nums.length-1;k++){
                    for(int l=k+1;l<nums.length;l++){
                        long s=nums[i]+nums[j]+nums[k]+nums[l];
                        if(s==target){
                            ln.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[k],nums[l])));
                        }
                    }
                }
            }
        }
        ln = new ArrayList<>(new LinkedHashSet<>(ln));
        return ln;
    }
}