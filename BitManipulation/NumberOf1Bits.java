class Solution {
    public int hammingWeight(int n) {
        int setBits=0;
        for(int pos=0; pos<32;pos++){
            int BM= 1<<pos;
            if((BM&n)!=0){
                setBits++;
            }
        }
        return setBits;
        
    }
}
