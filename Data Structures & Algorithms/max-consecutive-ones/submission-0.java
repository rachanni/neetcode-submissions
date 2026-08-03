class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            if(nums[i] == 1){
                j = i;
                while(j < nums.length && nums[j] != 0){
                    count ++;
                    j++;
                }
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }
}