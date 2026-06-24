class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer>set = new HashSet<>();
        // Arrays.sort(nums);
        for(int i:nums)
        {
            set.add(i);
        }
     

        List<Integer> list=  new ArrayList<>();

        int count=1;
        for(Integer num:set)
        {
            list.add(num);
        }
        Collections.sort(list);
        int max=1;
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i+1)-list.get(i)==1)
            {
                count++;
            }
            else
            {
                count=1;
            }
            max=Math.max(count,max);
        }
        
        return max;
    }
}