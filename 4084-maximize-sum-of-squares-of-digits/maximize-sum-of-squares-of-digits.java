// class Solution {
//     public String maxSumOfSquares(int num, int sum) {
//         if(sum>num*9)return "";
//         String s="";
//         for(int i=0;i<num;i++){
//             int m=Math.min(9,sum);
//             s+=m;
//             sum-=m;
//         }
//         return s;
//     }
// }

class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) {
            return "";
        }

        char[] ans = new char[num];

        int i = 0;
        while (sum >= 9) {
            ans[i++] = '9';
            sum -= 9;
        }

        if (i < num) {
            ans[i++] = (char) ('0' + sum);
        }

        while (i < num) {
            ans[i++] = '0';
        }

        return new String(ans);
    }
}
