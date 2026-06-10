class Solution {
    public int maxArea(int[] height) {
        int s=0;
        int e= height.length-1;
        int width =0;
        int maxAmount =0;
        while(s<e){
            int length = e-s;
            if(height[s]<height[e]){
                width = height[s];
                s++;
            }else{
                width=height[e];
                e--;
            }
            int amount = length*width;
            maxAmount = Math.max(amount , maxAmount);
        }
        return maxAmount ;
        
    }
}
