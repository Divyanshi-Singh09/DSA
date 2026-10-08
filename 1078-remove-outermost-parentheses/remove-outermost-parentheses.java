class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder result = new StringBuilder();

        int count = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {

                // If count is not 0, this is not an outer '('
                if (count > 0) {
                    result.append(ch);
                }

                count++;
            }

            else {

                count--;

                // If count is not 0 after decreasing,
                // this ')' is not an outer ')'
                if (count > 0) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
}