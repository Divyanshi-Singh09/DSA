
class Solution {

    public double myPow(double x, int n) {

        // Convert int to long to handle Integer.MIN_VALUE
        long power = n;

        // Handle negative exponent
        if (power < 0) {
            power = -power;
        }

        // Calculate positive power first
        double result = solve(x, power);

        // Take reciprocal only at the end
        if (n < 0) {
            return 1.0 / result;
        }

        return result;
    }

    public double solve(double x, long n) {

        // Base condition
        if (n == 0) {
            return 1.0;
        }

        // Recursive call
        double half = solve(x, n / 2);

        // Even power
        if (n % 2 == 0) {
            return half * half;
        }

        // Odd power
        return x * half * half;
    }
}
