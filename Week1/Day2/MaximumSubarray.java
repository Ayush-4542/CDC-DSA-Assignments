class Solution {
    public int maxSubArray(int[] nums) {
        int largestSum=Integer.MIN_VALUE;
         
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            largestSum=Math.max(sum,largestSum);
            for(int j=i+1 ;j<nums.length;j++){
                 sum+=nums[j];
                largestSum=Math.max(sum,largestSum);
            }
        }
        return largestSum;
    }
}
