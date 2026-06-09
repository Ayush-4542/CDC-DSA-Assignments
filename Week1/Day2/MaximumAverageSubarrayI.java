class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        double average =Integer.MIN_VALUE;
        double maxAverage = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxAverage = (double)sum/k;

        for(int j=k;j<nums.length;j++){
            sum+=nums[j];
            sum-=nums[j-k];
            average = (double) sum/k;
            maxAverage = Math.max(maxAverage, average);
        }
        return maxAverage;
        
    }
}
