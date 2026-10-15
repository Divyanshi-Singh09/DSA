
class Solution {

    public boolean backspaceCompare(String s, String t) {

        String str1 = build(s);
        String str2 = build(t);

        return str1.equals(str2);
    }

    public String build(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '#') {

                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }

            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
