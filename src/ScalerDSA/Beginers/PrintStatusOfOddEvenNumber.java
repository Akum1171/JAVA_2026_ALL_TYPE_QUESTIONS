package ScalerDSA.Beginers;

public class PrintStatusOfOddEvenNumber {
    static void main() {

        int n=2;
        System.out.println(OddEven(n));
    }
    public static boolean OddEven(int N){
        boolean result=false;
        if(N%2==0){
            result=true;
        }
        else {
            result=false;
        }
       return result;
    }
}
