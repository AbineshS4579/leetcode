// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int a[]=new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             a[i]=nums[i]*nums[i];
//         }
//         Arrays.sort(a);
//         return a;
//     }
// }
class Solution {
    public int[] sortedSquares(int[] nums) {
        int a[]=new int[nums.length],i=0,j=nums.length-1,k=nums.length-1;
        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                a[k]=nums[i]*nums[i];
                i++;
            }else{
                a[k]=nums[j]*nums[j];
                j--;
            }
            k--;
        }
        return a;
    }
}