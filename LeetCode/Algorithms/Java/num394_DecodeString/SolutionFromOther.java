package num394_DecodeString;

import java.util.Stack;

public class SolutionFromOther {
	public String decodeString(String s) {
		Stack<Integer> count = new Stack<>();
		Stack<String> result = new Stack<>();
		int i = 0;
		result.push("");
		while (i < s.length()) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				int start = i;
				while (s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9') i++;
				count.push(Integer.parseInt(s.substring(start, i + 1)));
			} else if (ch == '[') {
				result.push("");
			} else if (ch == ']') {
				String str = result.pop();
				StringBuilder sb = new StringBuilder();
				int times = count.pop();
				for (int j = 0; j < times; j += 1) {
					sb.append(str);
				}
				result.push(result.pop() + sb.toString());
			} else {
				result.push(result.pop() + ch);
			}
			i += 1;
		}
		return result.pop();
	}
}
//https://leetcode.com/problems/decode-string/
/*
394. Decode String   Add to List QuestionEditorial Solution  My Submissions
Total Accepted: 15451
Total Submissions: 38907
Difficulty: Medium
Contributors: Admin
Given an encoded string, return it's decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

Examples:

s = "3[a]2[bc]", return "aaabcbc".
s = "3[a2[c]]", return "accaccacc".
s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
Hide Company Tags Google
Hide Tags Depth-first Search Stack
Hide Similar Problems (H) Encode String with Shortest Length
*/
//from https://discuss.leetcode.com/topic/57250/java-short-and-easy-understanding-solution-using-stack/2
//from https://discuss.leetcode.com/user/cdpiano
