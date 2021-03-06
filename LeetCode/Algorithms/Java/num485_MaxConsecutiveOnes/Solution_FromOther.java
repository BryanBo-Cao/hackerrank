package num485_MaxConsecutiveOnes;

public class Solution_FromOther {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxHere = 0, max = 0;
        for (int n : nums)
            max = Math.max(max, maxHere = n == 0 ? 0 : maxHere + 1);
        return max; 
    }
}
/*
https://leetcode.com/problems/max-consecutive-ones
485. Max Consecutive Ones
DescriptionHintsSubmissionsDiscussSolution
Discuss Pick One
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
*/
//From https://discuss.leetcode.com/topic/75437/java-4-lines-concise-solution-with-explanation
//Author https://discuss.leetcode.com/user/yuxiangmusic
//PracticedOn20170804Fri 3Times
