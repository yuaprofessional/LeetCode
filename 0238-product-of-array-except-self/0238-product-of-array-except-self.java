class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int n = nums.length;
        int prod = 1;
        int ans[] = new int[n];

        //Edge case
        if (n == 1)
        {
            ans[0] = 1;
            return ans;
        }

        //prefix
        int prefix[] = new int[n];
        prefix[0] = nums[0];
        for(int i = 1 ; i < n ; i++)
        {
            prefix[i] = prefix[i - 1] * nums[i]; 
        }

        //Suffix
        int suffix[] = new int[n];
        suffix[n - 1] = nums[n - 1];
        for(int i = n - 2 ; i >= 0 ; i--)
        {
            suffix[i] = suffix[i + 1] * nums[i];
        }

        // product
        ans[0] = suffix[1];
        ans[n - 1] = prefix[n - 2];
        for(int i = 1 ; i < n - 1 ; i++)
        {
            ans[i] = prefix[i - 1] * suffix[i + 1];
        }
        return ans;
    }
}