import java.util.*;
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0;i<n;i++)
            arr[i] = nums[nums[i]];
        return arr;        
    }
    public static void main(String[] args)
    {
        int[] nums={0,2,1,5,3,4};
        int[] num=new int[nums.length];
        Solution s=new Solution();
        num=s.buildArray(nums);
        System.out.println(Arrays.toString(num));
        
    }
}
