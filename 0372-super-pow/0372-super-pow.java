class Solution {
    int MOD = 1337;

    public int superPow(int a, int[] b) {
        int result = 1;
        a %= MOD;

        for (int digit : b) {
            result = pow(result, 10);
            result = (result * pow(a, digit)) % MOD;
        }

        return result;
    }

    private int pow(int a, int b) {
        int res = 1;
        a %= MOD;

        while (b > 0) {
            if ((b & 1) == 1)
                res = (res * a) % MOD;

            a = (a * a) % MOD;
            b >>= 1;
        }
        return res;
    }
}