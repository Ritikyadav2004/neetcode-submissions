class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=  new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
          
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                
            
           
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue());
        int res[]=new int[k];
        for(int i=0;i<k;i++)
        {
            res[i]=entryList.get(i).getKey();
        }
        return res;
        

        

        

    }
}
