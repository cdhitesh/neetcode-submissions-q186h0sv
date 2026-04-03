class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        int i = 0;
        int j = nums.length-1;
        int pos = result.length-1;

        while(i<=j){
            int left = nums[i]*nums[i];
            int right = nums[j]*nums[j];
             
             if(left>right){
                result[pos]=left;
                i++;
             }
             else {
                result[pos]=right;
                j--;
             }
             pos--;
        }
        return result;
    }
}