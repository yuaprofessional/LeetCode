class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid)
    {
        int len = grid.length;
        int []freq = new int[len * len + 1];
        int []result = new int[2];

        for(int row = 0 ; row < len ; row++)
        {
            for(int column = 0 ; column < len ; column++)
            {
                freq[grid[row][column]]++;
            }
        }    

        for(int repeat = 0 ; repeat < freq.length ; repeat++)
        {
            if(freq[repeat] > 1)
            {
                result[0] = repeat;
            }
            else if(freq[repeat] == 0)
            {
                result[1] = repeat;
            }
        }
        return result;
    }
}