class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;

        int i=0;
        int j=rows*cols-1;

        while(i<=j)
        {
            int mid=i+(j-i)/2; // to overcome from overflow
            int row1=mid/cols;
            int col1=mid%cols;

            if(matrix[row1][col1]==target)
            {
                return true;
            }

            if(matrix[row1][col1]<target)
            {
                i=mid+1;
            }
            else{
                j=mid-1;
            }

        }

        return false;
    }
}
