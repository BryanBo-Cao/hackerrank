package ladders.USGiants.l9_DynamicProgramming.num118_DistinctSubsequences;

public class Solution_FromOther1_BryanBCRevision {
    public int numDistinct(String S, String T) {
        if (S == null || T == null) return 0;
        int[][] nums = new int[S.length() + 1][T.length() + 1];

        for (int i = 0; i <= S.length(); i++) nums[i][0] = 1;
        for (int i = 1; i <= S.length(); i++) {
            for (int j = 1; j <= T.length(); j++) {
                nums[i][j] = nums[i - 1][j];
                if (S.charAt(i - 1) == T.charAt(j - 1)) nums[i][j] += nums[i - 1][j - 1];
            }
        }
        return nums[S.length()][T.length()];
    }
}
//http://www.lintcode.com/en/problem/distinct-subsequences/
/*
Distinct Subsequences

 Description
 Notes
 Testcase
 Judge
Given a string S and a string T, count the number of distinct subsequences of T in S.

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).

Have you met this question in a real interview? Yes
Example
Given S = "rabbbit", T = "rabbit", return 3.
*/
//From http://www.jiuzhang.com/solutions/distinct-subsequences/
//PracticedOn20170217Fri 5Times