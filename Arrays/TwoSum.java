// ✅ LeetCode 1. Two Sum (Easy)
// 🔗 https://leetcode.com/problems/two-sum/
// 📂 Topic: Arrays, Brute Force
// ⏱ Time: O(n²), 🗃 Space: O(1)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {}; // Return empty if no solution (though problem says there is one)
    }
}
