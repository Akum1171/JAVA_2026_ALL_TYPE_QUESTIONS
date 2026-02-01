package ScalerDSA.Beginers2;

import java.util.Scanner;

public class MaxAndMinNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for (int i=0; i<n;i++){
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
    //what if -negative then take
}
