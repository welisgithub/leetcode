class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapa = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            int lack = target - nums[i];

            if(mapa.containsKey(lack)){
                return new int []{mapa.get(lack) , i};
            }
            mapa.put(nums[i], i);
        }
        return new int[]{};
    }
}