class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();

        for (int i = 1; i <= n / 2; i++) {
            String f = num.substring(0, i);

            if (f.length() > 1 && f.startsWith("0"))
                break;

            for (int j = 1; Math.max(i, j) + i + j <= n; j++) {
                String s = num.substring(i, i + j);

                if (s.length() > 1 && s.startsWith("0"))
                    break;

                long a = Long.parseLong(f);
                long b = Long.parseLong(s);

                int p = i + j, c = 2;

                while (p < n) {
                    long sum = a + b;
                    String q = String.valueOf(sum);

                    if (!num.startsWith(q, p))
                        break;

                    a = b;
                    b = sum;
                    c++;
                    p += q.length();
                }

                if (p == n && c >= 3)
                    return true;
            }
        }

        return false;
    }
}