package ScalerDSA.Beginers2;

import java.util.Scanner;

public class ElementStrictlyOrNot {
    static void main() {
        Scanner sc=new Scanner(System.in);

        //problem - check if array is strictly increasing order or not
        int n =sc.nextInt();
        int []arr= new int[n];

    }
    public static boolean isIncreasing(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            if(arr[i - 1] >= arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIncreasing2(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
