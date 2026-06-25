/*class Solution {
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
*/
// optimized code
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int len=1;len<=s.length()/2;len++){
            if(s.length()%len!=0){
                continue;
            }
            boolean isPossible=true;
            for(int i=len;i<s.length();i++){
                if(s.charAt(i)!=s.charAt(i%len)){
                    isPossible=false;
                    break;
                }
            }
            if(isPossible){
                return true;
            }


        }
        return false;
       
    }
}

