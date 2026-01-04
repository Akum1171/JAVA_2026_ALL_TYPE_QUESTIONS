package ALGORITHMS;

import java.util.Arrays;

public class BubbleSort_sortElement {
     static void main(String[] args)
    {
        //using bubble sort ....sort element
        // we need to compare two adjacent element and if the 1st element is greater than the 2nd element then swap that element
        //This is acceding order sorted
        int arr[] = {4,2,1,5,3};

        int temp=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {

                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
