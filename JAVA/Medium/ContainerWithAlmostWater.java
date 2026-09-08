class Solution {
    public int maxArea(int[] height){
        int r = height.length - 1;
        int l = 0;
        int maxWater = 0;
        while(l < r){
            int currentWater = Math.min(height[l], height[r]) * (r - l);
            if(currentWater >= maxWater){
                maxWater = currentWater;
            }
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxWater;
    }
}