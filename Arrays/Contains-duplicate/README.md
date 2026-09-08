217. Contains Duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109

Solution Approach ->

1.Brute Force :
  Checking each element with every other element. If found similar return true, else false.
  Time Complexity : O(n^2)
  Space Complexity : O(1)

2.Sorting : 
  First sort the array. If duplicate present then they becomes adjacent.
  Time Complexity : O(nlogn)
  Space Complexity : O(1)

3.HashSet :
  Add elements in set ,if set contains that element then return true, else false.
  Time Complexity : O(n)
  Space Complexity : O(n)

4.HasMap :
  Similar to hashset.
  Time Complexity : O(n)
  Space Complexity : O(n)
