package ScalerDSA.Beginers2;

public class FrequencyELement {
    static void main() {

    }
    public static int countOfSize(int []arr, int k){
        int count=0;
        for (int i=0;i< arr.length;i++) {
            if (arr[i] == k) {
                count++;
            }
        }
        return count;
    }
}
