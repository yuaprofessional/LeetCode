class Solution {
    public double findMaxAverage(int[] nums, int k)
    {
        int strt = 0;
        int end = k;
        int n = nums.length;
        double sum = 0;

        for(int i = 0 ; i < k ; i++)
        {
            sum = sum + nums[i];
        }

        double maxSum = sum;
        while(end < n)
        {
            sum = sum - nums[strt];
            sum = sum + nums[end]; 

            maxSum = Math.max(maxSum,sum);

            strt++;
            end++;
        }    

        return maxSum/k;
    }
}