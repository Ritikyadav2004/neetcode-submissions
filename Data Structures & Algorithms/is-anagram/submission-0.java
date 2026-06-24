class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
       Map<Character,Integer>map=new HashMap<>();
       Map<Character,Integer>map2=new HashMap<>();

       for(int i=0;i<s.length();i++)
       {
        if(!map.containsKey(s.charAt(i)))
        {
            map.put(s.charAt(i),1);
        }
        else
        {   
            int val=map.get(s.charAt(i));
            map.put(s.charAt(i),val+1);
        }
       }

       for(int i=0;i<t.length();i++)
       {
        if(!map2.containsKey(t.charAt(i)))
        {
            map2.put(t.charAt(i),1);
        }
        else
        {   
            int val=map2.get(t.charAt(i));
            map2.put(t.charAt(i),val+1);
        }
       }
       
    //    int minValue=(t.length()>s.length()?s.length():t.length());
       for(int i=0;i<s.length();i++)
       {   
          char ch=s.charAt(i);
          int charCount=map.get(ch);
          int charCount2=map2.getOrDefault(ch,0);
          if(charCount!=charCount2) return false;


        


       }
    return true;
    }
}
