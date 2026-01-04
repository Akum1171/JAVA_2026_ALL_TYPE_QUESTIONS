package ARRAY_STRING_QUESTIONS;

public class FIND_MISSING_NUMBER {
     static void main(String[] args) {
        // TODO Auto-generated method stub



        int arr[] = {1, 2, 3, 5, 6};

        int n = arr.length + 1; //range

        int exSum = (n * (n + 1) / 2); //1+2+3+4+5+6---->21 find sum of all no including missing
        int actSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actSum = actSum + arr[i];//1+2+3+5+6---->17
        }
        int missingNumber = exSum - actSum;// 21-17
        System.out.println(missingNumber);//4
    }
}