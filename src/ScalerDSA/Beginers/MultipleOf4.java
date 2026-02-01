package ScalerDSA.Beginers;

import java.util.Scanner;

public class MultipleOf4 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

//        int i=0;
//         while (i<=n){
//             if (i % 4==0){
//                 System.out.println(i);
//             }
//             i=i+1;
//         }

         //efficient
        int i=1;
        while (4*i<=n){
            System.out.println(4*i);
            i=i+1;
        }
        /*
           i=1   4*i=4
           i=2   4*i=8 etch till n
         */


    }

}
