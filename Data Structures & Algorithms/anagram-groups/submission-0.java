class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs) {
            char[] sorted = str.toCharArray();
            Arrays.sort(sorted);
            String sortedStr = new String(sorted);

            if(map.containsKey(sortedStr)) {
                map.get(sortedStr).add(str);
            } else {
                List<String> list = new LinkedList();
                list.add(str);
                map.put(sortedStr, list);
            }
        }
        return new LinkedList(map.values());
    }
}
