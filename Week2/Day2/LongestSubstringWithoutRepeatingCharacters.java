class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int start=0;
        int maxlength=0;
        int currlength=0;
        for(int i=0;i<s.length();i++){
           
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(start));
                currlength= i-start;
                maxlength = Math.max(currlength, maxlength);
                start++;

            }
                set.add(s.charAt(i));
                currlength= i-start+1;
                maxlength= Math.max(currlength,maxlength);
                

        }
        
        return maxlength;
    }
}
