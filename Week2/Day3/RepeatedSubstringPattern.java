class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i=0;i<s.length()/2;i++){
             StringBuilder sb = new StringBuilder();
             StringBuilder sb1 = new StringBuilder();


            for(int j=0;j<=i;j++){
                sb.append(s.charAt(j));
                sb1.append(s.charAt(j));

            }
            if(s.length()%sb1.length()==0){
                while(sb.length()<=s.length()){
                   sb.append(sb1);
                    if(sb.toString().equals(s)){
                     return true;
                    }
                }
            }
            
           



        }
        return false;
        
    }
}
