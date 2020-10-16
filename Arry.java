class Arry {

    public static void main(String []args)
    {
        int j = 0;
        int arr[] = {22 ,10,6,9,8,3};
        for(int i = 1;i<arr.length;i++ )
        {
            int temp = arr[i];
            while(j>=0)
            {
                if(arr[j]>temp)
                {
                  int ext = arr[j];
                  arr[j] = arr[i];
                  arr[i] = ext;
                }
            }
            
            j = i;
        }

        for(int k=0;k<arr.length;k++ )
        {
            System.out.println( arr[k]);
        }


    }
}