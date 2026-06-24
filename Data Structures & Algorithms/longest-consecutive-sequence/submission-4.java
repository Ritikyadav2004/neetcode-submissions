class Solution {
    public int longestConsecutive(int[] nums) {

    
        if(nums.length==0) return 0;
       
        Set<Integer>set = new HashSet<>();
        // Arrays.sort(nums);
        for(int i:nums)
        {
            set.add(i);
        }
         int count=0;
         int max=0;
        for(int i:nums)
        {   
            int streak=0,curr=i;
            while(set.contains(curr))
            {
                streak++;
                curr++;
            }
            max=Math.max(max,streak);
        }
     

        
        return  max;
    }
}