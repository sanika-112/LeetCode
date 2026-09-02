1295. Find Numbers with Even Number of Digits

Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.

Example 2:
Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.
 
Constraints:
1 <= nums.length <= 500
1 <= nums[i] <= 105

Solution Approach ->

1.Count digits :
  count the digits using while loop(n/10) and check it is even or odd.
  Time Complexity : O(n*d) d- no of digits in number
  Space Complexity : O(1)

2.Convert into string :
  convert the numbers into string and check the length of string is even or odd ,increase count.
  Time Complexity : O(n*d) d- no of digits in number
  Space Complexity : O(d)

3.Add Constraints :
  for even number of digits , the number should be in the range of 10-99,1000-9999 and 100000.
  Time Complexity : O(n) 
  Space Complexity : O(1)
