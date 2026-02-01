package ScalerDSA.Beginers2;

import java.util.Scanner;

public class Prb1TakeRunsForFiveMatchedAndPriintItsAVG {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        // prblmem1. takes runs for 5 matches and print average
        int runs[];
        runs=new int[5];

        //ask for data from user and store it into array
        for(int i=0;i<5;i++){
            runs[i]= scanner.nextInt();
        }

        //print score of every matches
        for (int i=0; i<5; i++){
            System.out.println("Runs in" + i+ "th match is :" +i);
        }

        //print average
        int sum=0;
        for (int i=0;i<5;i++){
            sum += runs[i];
        }
        double avg= sum/5.0;
        System.out.println(avg);
    }
}
