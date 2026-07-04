class Solution {
    public int compress(char[] chars) {
        int index=0;
        int start=0;
        for(int i=1;i<=chars.length;i++){
            int length=1;
            chars[index]=chars[start];
            index++;
            while(i<chars.length && chars[start]==chars[i]){
                length++;
                i++;

            }
            start=i;
            if(length>1){
                String num= String.valueOf(length);
                char [] arr = num.toCharArray();
                for(char ch: arr){
                    chars[index]=ch;
                    index++;
                }
            }


        }
        return index;
        
    }
}
