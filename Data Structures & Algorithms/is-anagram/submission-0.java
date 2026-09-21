class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] numCounts = new int[26];

        char[] sCharArr = s.toCharArray();
        char[] tCharArr = t.toCharArray();

        for (int i = 0; i < s.length(); i++ ) {
            numCounts[sCharArr[i] - 'a']++;
            numCounts[tCharArr[i] - 'a']--;
        }

        for (int numCount : numCounts) {
            if (numCount != 0) {
                return false;
            }
        }
        return true;
    }
}
