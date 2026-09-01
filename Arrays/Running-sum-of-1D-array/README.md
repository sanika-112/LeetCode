1480. Running Sum of 1d Array

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Example 2:
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

Example 3:
Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]
 
Constraints:
1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6

Solution Approach ->

1.Brute Force :
  Make an array to store sum , then traverse the array for each index using nested for loop.
  Time Complexity : O(n^2)
  Space Complexity : O(n)

2.Using one for loop :
  Use one for loop, take a variable as prevSum=0 and add result into result array as prevSum+nums[i] , store nums[i into       prevSum for next addition.
  Time Complexity : O(n)
  Space Complexity : O(n)

3.Optimal Solution :
  start with index 1  because at index 0 the sum is same as element present at that index and then add sum as                  nums[i]=nums[i]+nums[i-1].
  Time Complexity : O(n)
  Space Complexity : O(1)
