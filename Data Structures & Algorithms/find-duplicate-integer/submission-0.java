class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i:nums)
        {
            if(map.containsKey(i))
            {
                int count=map.get(i);
                map.put(i,count+1);
                if(map.get(i)==2) return i;
            }
            else{
                map.put(i,1);
            }
        }

        return 0;
    }
}