// class Solution {
//     public String fractionToDecimal(int numerator, int denominator) {
//         int j=1;
//         if(numerator<0&&denominator<0)j=1;
//         else if(numerator<0||denominator<0) j=-1;
//        int n=Math.abs(numerator/denominator);
//        long l=numerator%denominator;
//        List<Long> L=new ArrayList<>();
//        StringBuilder s=new StringBuilder();
//        while(l!=0){
//         if(L.contains(l)){
//             int p=L.indexOf(l);
//             s.insert(p,"(");
//             s.append(")");
//             break;
//         }
//         L.add(l);
//         l*=10;
//         s.append(l/ Math.abs((long) denominator));
//         l%= Math.abs((long) denominator);
//        }
//        if(numerator%denominator!=0){
//        return s.insert(0,j*n+".").toString();
//        }
//        return Integer.toString(j*n);
//     }
// }
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {

        if (numerator == 0)
            return "0";

        boolean negative = (numerator < 0) ^ (denominator < 0);

        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        StringBuilder s = new StringBuilder();

        if (negative)
            s.append("-");

        s.append(num / den);

        long l = num % den;

        if (l == 0)
            return s.toString();

        s.append(".");

        Map<Long, Integer> map = new HashMap<>();

        while (l != 0) {

            if (map.containsKey(l)) {
                int p = map.get(l);
                s.insert(p, "(");
                s.append(")");
                break;
            }

            map.put(l, s.length());

            l *= 10;

            s.append(l / den);

            l %= den;
        }

        return s.toString();
    }
}