class Solution {
    public boolean check(int[] nums) {
        int a[]=nums.clone();
        Arrays.sort(a);
        int k=0;
        while(k++<a.length){
        int b[]=new int[a.length];
            for(int i=0;i<nums.length;i++){
                b[i]=a[(i+k)%a.length];
            }
            if(Arrays.equals(nums,b))return  true;
        }
        return false;
    }
}