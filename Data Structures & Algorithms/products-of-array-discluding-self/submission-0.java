class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftSideProduct = new int[nums.length];
        int[] rightSideProduct = new int[nums.length];

        int previousPrefixProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            leftSideProduct[i] = previousPrefixProduct;
            previousPrefixProduct = previousPrefixProduct * nums[i];
        }

        int previousSuffixProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            rightSideProduct[i] = previousSuffixProduct;
            previousSuffixProduct = previousSuffixProduct * nums[i];

        }

        int[] answers = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answers[i] = leftSideProduct[i] * rightSideProduct[i];
        }
        return answers;
    }
}
