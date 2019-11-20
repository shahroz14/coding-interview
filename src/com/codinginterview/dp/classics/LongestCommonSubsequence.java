package com.codinginterview.dp.classics;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String s1 = "ababcbebdec";
		String s2 = "abeddcdae";
		System.out.println(lcs(s1, s2));
	}

	/**
	 * Let A = [1....n] Let B = [1....m]
	 * 
	 */
	public static int lcs(String a, String b) {
		int n = a.length();
		int m = b.length();
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				char c1 = a.charAt(i - 1);
				char c2 = b.charAt(j - 1);
				if (c1 == c2)
					dp[i][j] = 1 + dp[i - 1][j - 1];
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		return dp[n][m];
	}

}
