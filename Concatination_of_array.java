class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] resultantArr = new int[2 * nums.length];
        // Copy the numbers from input array to resultant array.
        for (int i = 0; i < resultantArr.length; i++) {
            // Use modulo (%) for cycling through the indix of input array.
            resultantArr[i] = nums[i % nums.length];
        }
        return resultantArr;
    }
}