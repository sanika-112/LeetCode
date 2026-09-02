1929. Concatenation of Array

Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.

Example 1:
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
  
Example 2:
Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
 
Constraints:
n == nums.length
1 <= n <= 1000
1 <= nums[i] <= 1000

1.Using two separate loop :
   Create array for result apply first loop for elements upto size and then again for remaining.
   Time Complexity : O(n)
   Space Complexity : O(n)

2.Using only one loop :
  In one array add 2 times,first for index i and second for index i+size. 
  Time Complexity : O(n)
  Space Complexity : O(n)

3.Built-in method :
  Use built in method - System.arraycopy(source,sourcePositin,destination,destinationPosition,size).
  Time Complexity : O(n)
  Space Complexity : O(n)
