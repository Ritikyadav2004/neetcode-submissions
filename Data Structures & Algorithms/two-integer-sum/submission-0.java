class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>  map= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
        if(!map.containsKey(nums[i]))
        {
            map.put(nums[i],i);
        }
        }

        for(int i=0;i<nums.length;i++)
        {
            int val=target-nums[i];
            if(map.containsKey(val) && i!=map.get(val))
            {
                 int first = Math.min(i, map.get(val));
                 int second = Math.max(i, map.get(val));
                 return (new int[]{first, second});
            }


        }


        return new int[]{0,0};

    }
}
