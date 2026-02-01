package ScalerDSA.Beginers;

public class WAFunctionwhichCanGiveReturnNfACTORIAL {
    static void main() {

        int n=5;
        System.out.println(printFact(n));

    }
    public static int  printFact(int N){
        int fact=1;

        for (int i=1;i<=N;i++){
            fact *= i;
        }
        return fact;
    }
}

