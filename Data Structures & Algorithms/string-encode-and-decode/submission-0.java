class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb= new StringBuilder();
        
        for(String s:strs)
        {
            sb.append(s.length()).append("#").append(s);
        }

        return  sb.toString();

    }

    public List<String> decode(String str) {
        List<String> list= new ArrayList<>();
        int i=0;
        while(i<str.length())
        {
              int j= str.indexOf('#',i);


              int length=Integer.parseInt(str.substring(i,j));

              int wordStart= j+1;
              int wordEnd= wordStart+length;

              list.add(str.substring(wordStart,wordEnd));

              i=wordEnd;
        }
        return list;
    }
}
