package ladders.USGiants.l2_IntegerArray.num057_ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Revised_Solution_FromOther {
    /**
     * @param numbers : Give an array numbers of n integer
     * @return : Find all unique triplets in the array which gives the sum of zero.
     */
	public ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
	    // write your code here
	    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	    Arrays.sort(nums);
	    for (int i = 0; i + 2 < nums.length; i++) {
	        if (i > 0 && nums[i] == nums[i - 1]) continue; // skip same value
	        int j = i + 1, k = nums.length - 1;  
	        int target = -nums[i];
	        while (j < k) {
	            if (nums[j] + nums[k] == target) {
	                ArrayList<Integer> ls = new ArrayList<Integer>();
	                ls.add(nums[i]);
	                ls.add(nums[j++]);
	                ls.add(nums[k--]);
	                res.add(ls);
	                while (j < k && nums[j] == nums[j - 1]) j++;  // skip same value
	                while (j < k && nums[k] == nums[k + 1]) k--;  // skip same value
	            } else if (nums[j] + nums[k] > target) k--;
	            else j++;
	        }
	    }
	    return res;
	}
}
//https://www.lintcode.com/en/problem/3sum/
/*
3Sum

 Description
 Notes
 Testcase
 Judge
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

 Notice

Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)

The solution set must not contain duplicate triplets.

Have you met this question in a real interview? Yes
Example
For example, given array S = {-1 0 1 2 -1 -4}, A solution set is:

(-1, 0, 1)
(-1, -1, 2)
Tags 
Two Pointers Sort Array Facebook
Related Problems 
Medium 3Sum Closest 31 %
Medium 4Sum 21 %
Medium Two Sum 28 %
*/
//from https://discuss.leetcode.com/topic/28857/easiest-java-solution
//from https://discuss.leetcode.com/user/yavinci
