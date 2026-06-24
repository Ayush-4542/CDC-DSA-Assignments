class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int start=0;
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            int end =i-1;
             if(i==s.length()-1){
                    end++;
                }
            while(start < end &&( s.charAt(i)==' ' || i==s.length()-1)){
                char temp = s.charAt(start);
                sb.setCharAt(start,s.charAt(end));
                sb.setCharAt(end,temp);
                start++;
                end--;

                

            }
            if(s.charAt(i)==' '){
                start=i+1;
            }
           
                

        }
        return sb.toString();
        
    }
}
