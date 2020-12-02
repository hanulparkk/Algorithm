class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = 123;
        solution.reverse(x);
    }
}

class Solution {
    public int reverse(int x) {
        long reverse = 0;

        while (x != 0) {
            int mod = x % 10;
            reverse = reverse * 10 + mod;
            x /= 10;

            if (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) {
                return 0;
            }
        }

        return (int) reverse;
    }
}