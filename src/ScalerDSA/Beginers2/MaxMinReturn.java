package ScalerDSA.Beginers2;

import java.util.Arrays;

public class MaxMinReturn {
    static void main() {
        int arr[]={1,43,56,78,43};
        int result[] =minAndMax(arr);
        System.out.println("min " +result[0]);
        System.out.println("max " + result[1]);



    }

    public static  int[] minAndMax(int arr[]){
        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min =arr[i];
            }
        }
      /*  int [] result= new int[2];
        result[0]=min;
        result[1]=max;*/
        return new int[]{min, max} ;
    }
}
