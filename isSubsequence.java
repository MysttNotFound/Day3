/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        int posInT = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean found = false;

            for (int j = posInT; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    posInT = j + 1;
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}