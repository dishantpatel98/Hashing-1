class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs)
        {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedString = String.valueOf(charArr);
            if(!map.containsKey(sortedString))
            {
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(str);
        }
        return new ArrayList<>(map.values());
        
    }
}