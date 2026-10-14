import java.util.*;

class Solution {
    public int maxArea(int[] height)
    {
        int n = height.length;
        int maxWater = 0;

        int strt = 0;
        int end = n - 1;

        while(strt < end)
        {
            int currHeght = Math.min(height[strt],height[end]);
            int currWater = (end - strt) * currHeght;
            maxWater = Math.max(maxWater,currWater);
            if(height[strt] < height[end])
            {
                strt++;
            }
            else
            {
                end--;
            }
        }  
        return maxWater;     
    }
}