class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int write = 2;  // First two elements are always allowed

        for (int read = 2; read < nums.length; read++) {
            // Compare current element with element two positions before write pointer
            if (nums[read] != nums[write - 2]) {
                nums[write] = nums[read];
                write++;
            }
        }

        return write;
    }
}
