package practiceProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class largestIncreasingSubsequence {
	public static List<Integer> findLIS(List<Integer> nums) {
		if (nums.isEmpty()) return new ArrayList<>();

		int n = nums.size();
		int[] dp = new int[n];
		Arrays.fill(dp, 1);

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (nums.get(i) > nums.get(j) && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;
				}
			}
		}

		int maxLen = Arrays.stream(dp).max().getAsInt();
		List<Integer> lis = new ArrayList<>();

		int index = -1;
		for (int i = 0; i < n; i++) {
			if (dp[i] == maxLen) {
				index = i;
				break;
			}
		}
		while (index >= 0) {
			lis.add(nums.get(index));
			maxLen--;
			if (maxLen == 0)
				break;

			for (int i = index - 1; i >= 0; i--) {
				if (nums.get(i) < nums.get(index) && dp[i] == maxLen) {
					index = i;
					break;
				}
			}
		}

		Collections.reverse(lis);
		return lis;
	}

	public static void main(String[] args) {
		System.out.println("enter your list size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		Integer arr[]=new Integer[size];
		System.out.println("enter your values");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();

		}
		List<Integer> nums = Arrays.asList(arr);
		List<Integer> lis = findLIS(nums);
		System.out.println();
		System.out.println("list =>>");
		System.out.println(nums);
		System.out.println();
		System.out.println("Longest Increasing Subsequence: " + lis);
		System.out.println("Length of Longest Increasing Subsequence: " + lis.size());
	}
}
