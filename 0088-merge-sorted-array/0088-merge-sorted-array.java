class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        // Input 
        // two arr num1 - m & num2 - n
        // actual len num1 - m + n

        // constraints
        // n <= 200 

        // output
        // void
        int j = n - 1;
        int k = m - 1;
        int i = m + n - 1;

        while(j >= 0 && k >= 0)
        {
            if(nums1[k] > nums2[j])
            {
                nums1[i] = nums1[k];
                k--;
            }
            else
            {
                nums1[i] = nums2[j];
                j--;
            }
            i--;
        }

        while(j>=0)
        {
            nums1[i] = nums2[j];
            j--;
            i--;
        }
    }
}