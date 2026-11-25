class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;

        int p1 = 0;
        int p2 = heights.length - 1;

        while (p1 < p2) {
            int currArea = 
                Math.min(heights[p1], heights[p2]) * (p2 - p1);
            maxArea = Math.max(currArea, maxArea);

            if (heights[p1] < heights[p2]) {
                p1++;
            }
            else {
                p2--;
            }
        }

        return maxArea;
    }
}
