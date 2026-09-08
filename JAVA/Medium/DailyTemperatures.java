class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> deque = new ArrayDeque<>(temperatures.length);
        int[] ans = new int[temperatures.length];
        
        for(int i = 0 ; i < temperatures.length ; i++){
            while(!deque.isEmpty() && temperatures[i] > temperatures[deque.peek()]){
                int prevIndex = deque.pop();
                ans[prevIndex] = i - prevIndex;
            }
            deque.push(i);
        }
        return ans;
    }
}