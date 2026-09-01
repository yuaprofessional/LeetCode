import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        int arr[] = new int[2];
        int num[][] = new int[nums.length][2];
        for(int i = 0 ; i < num.length ; i++)
        {
            num[i][0] = i;
            num[i][1] = nums[i];
        }
        Arrays.sort(num , (a,b) -> Integer.compare(a[1],b[1]));
        int left = 0;
        int right = nums.length - 1;

        while(left < right)
        {
            int sum = num[left][1] + num[right][1];
            if(sum == target)
            {
                arr[0] = num[left][0];
                arr[1] = num[right][0];
                return arr;
            }
            else if(num[left][1] + num[right][1] > target)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return arr;
    }
}