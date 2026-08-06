class Solution {
	
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
		    Integer complement = target - nums[i];
			if (map.containsKey(complement)) {
                if(i > map.get(complement)){
                return new int[] {map.get(complement), i};
                }else{
                return new int[] {i, map.get(complement)};
                }
            }
            map.put(nums[i], i);
        }

      
        return new int[]{};
    }
}
