
class Solution {
    public int minInsertions(String s) {
        int insertions = 0;
        int need = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                need += 2;

                if (need % 2 == 1) {
                    insertions++;
                    need--;
                }
            } else {
                need--;

                if (need == -1) {
                    insertions++;
                    need = 1;
                }
            }
        }

        return insertions + need;
    }
}
