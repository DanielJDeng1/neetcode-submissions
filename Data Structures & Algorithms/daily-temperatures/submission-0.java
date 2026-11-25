class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> lastIndice = new Stack<Integer>();
        int[] daysAfter = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int currTemp = temperatures[i];

            while (!lastIndice.isEmpty() && temperatures[lastIndice.peek()] < currTemp) {
                int lastIndex = lastIndice.pop();
                daysAfter[lastIndex] = i - lastIndex;
            }
            
            lastIndice.push(i);
        }

        return daysAfter;

    }
}
