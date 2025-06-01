import java.math.BigInteger;
class Solution {
    public long distributeCandies(int n, int limit) {
        BigInteger total = combination(n + 2, 2);
        BigInteger over1 = combination(n - (limit + 1) + 2, 2).multiply(BigInteger.valueOf(3));
        BigInteger over2 = combination(n - 2 * (limit + 1) + 2, 2).multiply(BigInteger.valueOf(3));
        BigInteger over3 = combination(n - 3 * (limit + 1) + 2, 2);

        BigInteger result = total.subtract(over1).add(over2).subtract(over3);
        return result.max(BigInteger.ZERO).longValue(); 
    }

    private BigInteger combination(int n, int k) {
        if (n < 0 || k < 0 || k > n) return BigInteger.ZERO;

        BigInteger res = BigInteger.ONE;
        for (int i = 0; i < k; i++) {
            res = res.multiply(BigInteger.valueOf(n - i));
            res = res.divide(BigInteger.valueOf(i + 1));
        }
        return res;
    }
}
