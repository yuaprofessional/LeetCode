import java.util.*;

class Solution {
    public int maxArea(int[] height)
    {
        int n = height.length;
        int maxWater = Integer.MIN_VALUE;

        //Initialization
        int left = 0;
        int right = n - 1;

        while(left < right)
        {
            int water = Math.abs(right - left) * Math.min(height[left],height[right]);
            if(water > maxWater)
            {
                maxWater = water;
            }
            if(height[left] > height[right])
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return maxWater;    
    }
}