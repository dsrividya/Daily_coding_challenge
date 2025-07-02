public class minimumsliding {

//missing integer

    public static int min(int[] arr)
    {
         int sum=0;
         int n= arr.length;
         int m=n*(n+1)/2;
         for(int i=0;i<arr.length-1;i++)
         {
             sum+=arr[i];
         }
         return m-sum;
    }

    public static void main(String[] args)
    {
        int[] arr={1,3,4,5};
       int v= min(arr);
        System.out.println(v);
    }
}
