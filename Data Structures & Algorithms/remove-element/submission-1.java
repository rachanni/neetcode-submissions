class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == val){
                nums[i] = 999;
                count++;
            }
        }
        int[] temp = new int[nums.length - count];
        Arrays.sort(nums);
        for(int i = 0; i < temp.length; i++){
            if(nums[i] >= 0){
                temp[i] = nums[i];
            }
        }
        return temp.length;
    }
}