class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> found = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (found.containsKey(target - nums[i])) {
                int[] array = {found.get(target - nums[i]), i};
                return array;
            }
            found.put(nums[i], i);
        }
        return new int[0];
    }
}
