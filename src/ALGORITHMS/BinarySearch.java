package ALGORITHMS;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    static void main() {
        int arr[]={1,2,3,4,5,23,13};
        Arrays.sort(arr);

        int searchElement=132;
        Boolean flag =false;

        int startIndex=0;
        int lastIndex=arr.length-1;
        int mid= 0;

        while (startIndex<=lastIndex){
            mid=(startIndex+lastIndex)/2;
           if(arr[mid]==searchElement){
               System.out.println(arr[mid]);
               flag=true;
               break;
           } else if (arr[mid]<searchElement) {
               startIndex=mid+1;
           }else if(arr[mid]>searchElement){
               lastIndex=mid-1;
           }
        }

        if(flag==false){
            System.out.println("element not found");
        }

    }
}
