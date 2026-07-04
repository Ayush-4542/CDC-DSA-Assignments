class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            char [] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            List<String> group = map.getOrDefault(sorted,new ArrayList<>());
            group.add(s);

            map.put(sorted,group);
        }
        return new ArrayList<>(map.values());

        
    } 
}
