class Solution {
    public boolean checkValidString(String s) {

        int minOpen = 0;
        int maxOpen = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                minOpen++;
                maxOpen++;
            }

            else if (ch == ')') {
                minOpen--;
                maxOpen--;
            }

            else { // ch == '*'
                minOpen--;   // consider * as ')'
                maxOpen++;   // consider * as '('
            }

            // We can never have less than 0 open brackets
            if (minOpen < 0) {
                minOpen = 0;
            }

            // Too many ')' brackets
            if (maxOpen < 0) {
                return false;
            }
        }

        return minOpen == 0;
    }
}