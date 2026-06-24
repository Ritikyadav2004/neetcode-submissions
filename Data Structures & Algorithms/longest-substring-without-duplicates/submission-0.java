class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> str= new HashSet<>();
       int l=0;
       int res=0;
       for(int i=0;i<s.length();i++)
       { 

        while(str.contains(s.charAt(i)))
        {
            str.remove(s.charAt(l));
            l++;
        }
        str.add(s.charAt(i));

        res=Math.max(res,i-l+1);
       }

       return res;
    }
}
