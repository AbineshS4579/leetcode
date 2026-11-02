// class Solution {
//     public int minMoves(int[] nums) {
//        List<Integer> l=new ArrayList<>();
//         for(int i:nums){
//             l.add(i);
//         }
//         Collections.sort(l);
//         int k=l.size()-1;
//         if(l.get(0)==l.get(k)){
//             return 0;
//         }
//         int count=0;
//         boolean t=true;
//         while(t){
//         if(l.get(0)==l.get(k)){
//             t=false;
//         }
//         while(k>0&&l.get(k)==l.get(k-1)){
//             k=k-1;
//         }
//         if(k>1){
//             l.add(l.get(k-1)+1);
//             l.add(l.get(k-2)+1);
//             l.remove(k-2);
//             l.remove(k-1);
//         }
//         else if(k>0){
//             l.add(l.get(k-1)+1);
//             l.add(l.get(k)+1);
//             l.remove(k-1);
//             l.remove(k);
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