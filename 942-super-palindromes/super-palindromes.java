// class Solution {
//     static boolean isp(String s){
//         if(s.length()<2)return true;
//         int i=0,j=s.length()-1;
//         while(i<j){
//             if(s.charAt(i)!=s.charAt(j))return false;
//             i++;
//             j--;
//         }
//         return true;
//     }
//     public int superpalindromesInRange(String left, String right) {
        
//         long k = (long) Math.sqrt(Long.parseLong(right));
// long l = (long) Math.sqrt(Long.parseLong(left));
// int c=0;
//        for(long i=l;i<=k;i++){
//         if(isp(Long.toString(i))){
//             long h=i*i;
//             if(isp(Long.toString(h))){
//                 c++;
//             }
//         }
//        }
//        return c; 
//     }
// }
class Solution {

    public int superpalindromesInRange(String left, String right) {

        long L = Long.parseLong(left);
        long R = Long.parseLong(right);

        int count = 0;

        for (int i = 1; i <= 100000; i++) {

            String s = String.valueOf(i);


            String odd = s + new StringBuilder(s.substring(0, s.length() - 1))
                    .reverse();

            long root = Long.parseLong(odd);

            long square = root * root;

            if (square >= L && square <= R && isPalindrome(square)) {
                count++;
            }

            String even = s + new StringBuilder(s).reverse();

            root = Long.parseLong(even);
            square = root * root;

            if (square >= L && square <= R && isPalindrome(square)) {
                count++;
            }
        }

        return count;
    }

    private boolean isPalindrome(long n) {

        String s = String.valueOf(n);

        return s.equals(new StringBuilder(s).reverse().toString());
    }
}