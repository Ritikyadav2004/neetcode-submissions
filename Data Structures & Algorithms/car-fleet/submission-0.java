class Solution {
    public int carFleet(int target, int[] pos, int[] sp) {
        int n=pos.length;
        if(n==0) return 0;
        if(n==1) return 1;
        int time[]= new int[n];
        int pair[][]= new int[n][2];
        for(int i=0;i<pos.length;i++)
        {
            pair[i][0]=pos[i];
            pair[i][1]=sp[i];
        }
        Arrays.sort(pair,(a,b)->Integer.compare(b[0],a[0]));

        double prevTime=(double)(target-pair[0][0])/pair[0][1];
        int fleet=1;
        for(int i=1;i<pos.length;i++)
        {
            double currTime=(double)(target-pair[i][0])/pair[i][1];
            if(currTime>prevTime)
            {
                fleet++;
                prevTime=currTime;
            }
        }
        return fleet;
    }
}