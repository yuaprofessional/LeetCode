class Solution {
    public int majorityElement(int[] nums)
    {
        int n = nums.length;
        int majority = -1;
        int freq = 0;

        for(int ele = 0 ; ele < n; ele++)
        {
            if(freq == 0)
            {
                majority = nums[ele];
                freq++;
            }
            else if(majority == nums[ele])
            {
                freq++;
            }
            else
            {
                freq--;
            }
        }
        return majority;
    }
}