class Solution {
    public boolean isSubsequence(String s, String t) {
        int start=0;
        if(s.length()==0){
            return true;
        }
        if(t.length()>=s.length()){
            for(int i=0;i<t.length();i++){
                if(t.charAt(i)==s.charAt(start)){
                    start++;
                }
                if(start==s.length()){
                return true;
                }

            }


        }
        return false;
    }
}
