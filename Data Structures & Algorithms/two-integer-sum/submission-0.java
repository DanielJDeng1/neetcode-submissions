class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> vals = new HashSet<>();

        HashMap<Integer, Integer> index = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (vals.contains(target - nums[i])) {
                int[] array = {index.get(target - nums[i]), i};
                return array;
            }
            vals.add(nums[i]);
            index.put(nums[i], i);
        }

        return new int[0];
    }
    
}
