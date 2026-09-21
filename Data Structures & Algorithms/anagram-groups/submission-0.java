class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> wordCategories = new HashMap<>();
        
        for (String str : strs) {
            char[] strCharArray = str.toCharArray();
            Arrays.sort(strCharArray); 
            String sortedStr = new String(strCharArray);

            wordCategories.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(wordCategories.values());   
    }
}
