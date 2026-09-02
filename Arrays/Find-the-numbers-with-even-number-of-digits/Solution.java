class Solution {
    public boolean containsEvenDigits(int n)
    {
        int digits=0;
        while(n>0)
        {
            digits++;
            n=n/10;
        }
        if(digits%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(containsEvenDigits(nums[i]))
            {
                count++;
            }
        }
        return count;
    }
}
