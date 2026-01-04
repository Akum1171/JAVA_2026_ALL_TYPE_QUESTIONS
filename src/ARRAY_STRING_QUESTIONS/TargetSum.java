package ARRAY_STRING_QUESTIONS;

public class TargetSum {
     static void main(String[] args)
    {
        int arr[]= {1,2,3,4,5,6,7,8,10,8,12};
        int  target=18;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                }

            }
        }
    }
}
