package ScalerDSA.Beginers;

import java.util.Scanner;

public class PerfectSqare {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while (i * i <=n){
            System.out.println(i*i);
            i=i+1;
        }
    }
}
