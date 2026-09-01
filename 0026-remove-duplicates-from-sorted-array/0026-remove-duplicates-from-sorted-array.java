class Solution {
    public int removeDuplicates(int[] nums)
    {
        //length of nums
        int n = nums.length;

        //loop
        int left = 0;
        int right = 1;
        while(left < right && right < n)
        {
            if(nums[left] == nums[right])
            {
                right++;
            }
            else if(nums[left] != nums[right])
            {
                left++;
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right++;
            }
        }

        return left + 1;

    }
}