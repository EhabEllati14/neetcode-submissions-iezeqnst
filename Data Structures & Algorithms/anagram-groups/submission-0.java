class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String st : strs) {
            char[] characters = st.toCharArray();
            Arrays.sort(characters);
            String key = new String(characters);

            if (map.containsKey(key)) {
                map.get(key).add(st);
            } else {
                List<String> list = new ArrayList<>();
                list.add(st);
                map.put(key, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}