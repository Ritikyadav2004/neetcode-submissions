class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        boolean []visited= new boolean[strs.length];
        for(int i=0;i<strs.length;i++)
        {
             if(visited[i]) continue;
          List<String> temp=new ArrayList<>();
          
          temp.add(strs[i]);
          visited[i]=true;

          String str=strs[i];
          char charArray[]=str.toCharArray();
          Arrays.sort(charArray);
          String s1 = new String(charArray);
          
          for(int j=i+1;j<strs.length;j++)
          {    
             if(visited[j]) continue;
            if(strs[i].length()==strs[j].length()){
              char[] charr=strs[j].toCharArray();
              Arrays.sort(charr);
              String s2 = new String(charr);

              if(s1.equals(s2))
              {
                temp.add(strs[j]);
                 visited[j]=true;
              }
            }
          }

          list.add(temp);
          


        }

        return list;
    }
}
