class Solution {
    public boolean isPalindrome(String s) {
        String str= s.toLowerCase();
        String finalStr= "";
        boolean isPalindrome = true;
        for(int i=0;i<str.length();i++){
            if((Character.isLetterOrDigit(str.charAt(i)))){
                finalStr+=str.charAt(i); 

            }
        }
        for(int i=0;i<finalStr.length()/2;i++){
            if(finalStr.charAt(i)!= finalStr.charAt(finalStr.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}
