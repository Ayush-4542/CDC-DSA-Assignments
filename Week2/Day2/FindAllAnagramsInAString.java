class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> List = new ArrayList<>();
        HashMap<Character,Integer> map1= new HashMap<>();
        HashMap<Character,Integer> map2= new HashMap<>();

        for(int i=0;i<p.length();i++){
            map1.put(p.charAt(i),map1.getOrDefault(p.charAt(i),0)+1);
        }
        if(s.length()>=p.length()){
            for(int i=0;i<p.length();i++){
                 map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
                
            }
            if(map1.equals(map2)){
                List.add(0);
            }
            for(int i=p.length();i<s.length();i++){
                 map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
                 if(map1.containsKey(s.charAt(i-p.length()))){
                    map2.put(s.charAt(i-p.length()),map2.get(s.charAt(i-p.length()))-1);

                 }else{
                    map2.remove(s.charAt(i-p.length()));
                 }
                 if(map1.equals(map2)){
                    List.add(i-p.length()+1);
                 }

            }

        }

        
        return List;
    }
}
