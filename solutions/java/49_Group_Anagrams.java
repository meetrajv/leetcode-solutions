class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] temp = str.toCharArray();
            Arrays.sort(temp); 
            String key = new String(temp);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        
        for(String key : map.keySet()) {
            result.add(map.get(key));
        }
        return result;
    }
}
