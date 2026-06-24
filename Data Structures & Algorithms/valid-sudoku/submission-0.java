class Solution {
    public boolean isValidSudoku(char[][] board) {
        // checking duplicate in Row
        boolean[][] boxes= new boolean[9][9];
        for(int i=0;i<board.length;i++)
        {   
           HashSet<Integer> map=new HashSet<>();
            for(int j=0;j<board[0].length;j++)
            {
                 if(board[i][j]-'0'>=1 && board[i][j]-'0'<=9)
                 {
                    if(!map.contains(board[i][j]-'0'))
                    {
                         map.add(board[i][j]-'0');
                    }
                    else
                    {
                        return false;
                    }
                 }
            }
        }


        for(int i=0;i<board.length;i++)
        {   
            HashSet<Integer> map=new HashSet<>();
            for(int j=0;j<board[0].length;j++)
            {
                 if(board[j][i]-'0'>=1 && board[j][i]-'0'<=9)
                 {
                    if(!map.contains(board[j][i]-'0'))
                    {
                         map.add(board[j][i]-'0');
                    }
                    else
                    {
                        return false;
                    }
                 }
            }
        }

        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {   

                if(board[i][j]!='.'){
                int boxIndex=(i/3)*3 + (j/3);
                
                int num=board[i][j]-'1';
                if(boxes[boxIndex][num]) return false;
                boxes[boxIndex][num]=true;
                }

            


            }
        }



        return true;
    }
}