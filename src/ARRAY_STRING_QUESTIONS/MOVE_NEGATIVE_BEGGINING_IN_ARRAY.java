package ARRAY_STRING_QUESTIONS;

import java.util.Arrays;

public class MOVE_NEGATIVE_BEGGINING_IN_ARRAY {public static void main(String[] args)
{
    int arr[] = {-21,34,2,-23,54,1,-7,-34};

    for(int i=0;i<arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]>arr[j])
            {
                 int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    System.out.println(Arrays.toString(arr));
}

}