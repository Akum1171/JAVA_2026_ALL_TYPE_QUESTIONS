package ScalerDSA.Beginers;

import DSA_CODING_2025_20LPA.MERGE_SORT.Main;

public class WAFunctionwhichCanGivePrintNfACTORIAL {
    static void main() {

        int n=5;
        printFact(n) ;

    }
     public static void  printFact(int N){
         int fact=1;

         for (int i=1;i<=N;i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
