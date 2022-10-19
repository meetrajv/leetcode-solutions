class Solution {
    
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        
        TreeSet<String> treeSet = new TreeSet<>((a, b) ->  {
            int compare = freq.get(b) - freq.get(a);
            if(compare == 0) return a.compareTo(b);
            return compare;
        });
        for(String word : words) {
            treeSet.add(word);
        }
        List<String> result = new ArrayList<>();
        int i = 1;
        for(String entry : treeSet){
            result.add(entry);
            if(i == k) break;
            i++;
        }
        return result;
    }
}