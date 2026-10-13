// class Solution {
//     public int getCommon(int[] nums1, int[] nums2) {
//         Arrays.sort(nums2);
//         Arrays.sort(nums1);
//         List<Integer> l=Arrays.stream(nums2).boxed().toList();
//         for(int i:nums1){
//             if(l.contains(i))return i;
//         }
//         return -1;
//     }
// }
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        Arrays.sort(nums1);
        int i=0,j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j])return nums1[i];
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else {
                j++;
            }
        }
        return -1;
    }
}