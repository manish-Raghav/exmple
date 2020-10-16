import java.util.Scanner;
public class Test {

    public  static int n;
    public static void main(String []args) {
        int arr[][] = new int[n][n];
        Scanner ob = new Scanner(System.in);
          n = ob.nextInt();
          for(int i=0;i<n;i++)
          {
              for(int j=0;j<n;j++)
              {
                  System.out.println("input arry");
                  arr[i][j]= ob.nextInt();
              }
          }
          int s = calculate(arr);
          System.out.println(s);

    }
    public int calculate(int[][] arr)
    {
      int  sum =0;
        for(int k =0;k<n;k++)
        {
            for(int l=0;l<=k;l++)
            {
                sum = sum+arr[k][l];
            }
        }
        return sum;
    }


}