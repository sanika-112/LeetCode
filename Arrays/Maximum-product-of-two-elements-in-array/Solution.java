class Solution
{
  public int maxProducts(int[] nums)
  {
    int largest=0;
    int secondLargest=0;
    for(int i=0;i<nums.length;i++)
      {
        if(nums[i]>largest)
        {
          secondLargest=largest;
          largest=nums[i];
        }
        else if(nums[i]>secondLargest)
        {
          secondLargest=nums[i];
        }
      }
    int result=(largest-1)*(secondLargest-1);
    return result;
  }
}
