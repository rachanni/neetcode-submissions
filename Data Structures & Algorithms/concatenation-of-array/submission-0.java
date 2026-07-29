class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int [] ans = new int[2 * length];
        for(int i = 0; i< ans.length; i++){
            if(i < nums.length){
            ans[i]=nums[i];
            }else{
               ans[i] = nums[i-length];
            }
        }

        return ans;
    }
}