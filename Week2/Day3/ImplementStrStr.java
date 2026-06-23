/*class Solution {
    public int strStr(String haystack, String needle) {
        StringBuilder sb = new StringBuilder();

        if(haystack.length()>= needle.length()){
            for(int i=0;i<needle.length();i++){
                sb.append(haystack.charAt(i));
            }
            if(sb.toString().compareTo(needle)==0){
                return 0;
            }
            for(int i=needle.length();i<haystack.length();i++){
                sb.append(haystack.charAt(i));
                sb.delete(0,1);
                if(sb.toString().equals(needle)){
                    return i-needle.length()+1;
                }


            }

        }
        return -1;
        
    }
} */

// better understanding 
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()>=needle.length()){
             for(int i=0;i<=haystack.length()-needle.length();i++){
                int start=0;
                while(haystack.charAt(i+start)==needle.charAt(start)){
                    start++;
                    if(start==needle.length()){
                        return i;
                    }

                }

        }
        
        }
        return -1;
    }
}

