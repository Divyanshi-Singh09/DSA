
class Solution {

    public boolean isMatch(String s, String p) {
        return solve(s.length() - 1, p.length() - 1, s, p);
    }

    public boolean solve(int i, int j, String s, String p) {

        // Both strings are completely matched
        if (j < 0) {
            return i < 0;
        }

        // Current pattern character is *
        if (p.charAt(j) == '*') {

            // Case 1: Zero occurrence
            boolean zero = solve(i, j - 2, s, p);

            // Case 2: One or more occurrences
            boolean one = false;

            if (i >= 0 &&
                (p.charAt(j - 1) == '.' ||
                 p.charAt(j - 1) == s.charAt(i))) {

                one = solve(i - 1, j, s, p);
            }

            return zero || one;
        }

        // Normal character matching
        if (i >= 0 &&
            (p.charAt(j) == '.' ||
             p.charAt(j) == s.charAt(i))) {

            return solve(i - 1, j - 1, s, p);
        }

        return false;
    }
}
