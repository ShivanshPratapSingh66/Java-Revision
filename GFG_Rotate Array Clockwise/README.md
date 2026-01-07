Rotate Array Clockwise
Difficulty: EasyAccuracy: 56.11%Submissions: 6K+Points: 2
You are given an array arr[] of integers and an integer k. Your task is to rotate the array k times in the clockwise direction.
In a single clockwise rotation, the last element of the array moves to the front, and all other elements shift one position to the right.

Examples:

Input: arr[] = [1, 2, 3, 4, 5, 6], k = 2
Output: [5, 6, 1, 2, 3, 4]
Explanation: Rotating the array 2 times in clockwise gives the array [5, 6, 1, 2, 3, 4].
Input: arr[] = [1, 2, 3, 4, 5], k = 4
Output: [2, 3, 4, 5, 1]
Explanation: Rotating the array [1, 2, 3, 4, 5] four times clockwise gives the array [2, 3, 4, 5, 1].
Constraints:
1 ≤ arr.size() ≤ 105
0 ≤ k ≤ 109
0 ≤ arr[i] ≤ 109
