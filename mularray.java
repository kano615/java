class mularray {
    public static void main(String[] args)
    {
        int[][] aaa=new int[2][];
        aaa[0]=new int []{1,2,3,4,5,6,7,8};
        aaa[1]=new int []{1,2,3,4,5};
        for(int i=0;i<=aaa.length;i++)
        {
            for(int j=0;j<aaa[i].length;j++)
            {
                System.out.print(aaa[i][j]+" ");
            }
            System.out.println();
        }
    }
}