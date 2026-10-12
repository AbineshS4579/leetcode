// class Solution {
//     public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
//         PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
//         for(int i=0;i<nums2.length;i++){
//             p.add(Math.abs(nums2[i]-nums1[i]));
//         }
//         int k=k1+k2;
//         while(k>0&&!p.isEmpty()){
//             int m=p.poll();
//             if(m==0)return 0;
//             p.add(m-1);
//             k--;
//         }
//         long a=0;
//         for(int t:p){
//             a+=t*t;
//         }
//         return a;
//     }
// }

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long[] d = new long[n];
        long k = (long) k1 + k2;
        long total = 0;
        long high = 0;

        for (int i = 0; i < n; i++) {
            d[i] = Math.abs((long) nums1[i] - nums2[i]);
            total += d[i];
            high = Math.max(high, d[i]);
        }

        if (k >= total) {
            return 0;
        }

        long low = 0;

        while (low < high) {
            long mid = low + (high - low) / 2;
            long ops = 0;

            for (long x : d) {
                if (x > mid) {
                    ops += x - mid;
                }
            }

            if (ops <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        long ans = 0;
        long ops = 0;
        long count = 0;

        for (long x : d) {
            if (x > low) {
                ops += x - low;
                ans += low * low;
                count++;
            } else {
                ans += x * x;
            }
        }

        long remaining = k - ops;
        ans -= remaining * (2 * low - 1);

        return ans;
    }
}
