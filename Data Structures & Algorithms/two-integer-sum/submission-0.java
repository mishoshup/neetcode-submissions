class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> seenNum = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complementNum = target - nums[i];

            if(seenNum.containsKey(complementNum)) {
                int complementNumIdx = seenNum.get(complementNum);
                return new int[] {complementNumIdx, i};
            }

            seenNum.put(nums[i], i);
        }
        return new int[]{};
    }
}
