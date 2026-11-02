// class Solution {
//     public int minMoves(int[] nums) {
//        List<Integer> l=new ArrayList<>();
//         for(int i:nums){
//             l.add(i);
//         }
//         Collections.sort(l);
//         int count= 1;
//         while(l.get(0)!=l.get(l.size()-1)){
//             int k=l.size()-1;
//         while(k>0&&l.get(k)==l.get(k-1)){
//             k--;
//         }
//         if(k>1){
//             l.set(k-1,l.get(k-1)+1);
//             l.set(k-2,l.get(k-2)+1);
//         }
//         else {
//             l.set(0,l.get(0)+1);
//         }
//         Collections.sort(l);
//         count++;
//         }
//         return count;
//     }
// }
class Solution {
    public int minMoves(int[] nums) {
        int c=0,min=nums[0];
        for(int i:nums){
            min=Math.min(min,i);
        }
        for(int i:nums){
            c+=i-min;
        }
        return c;
    }    }