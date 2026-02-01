package ScalerDSA.Beginers2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    static void main() {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scn.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.add(scn.nextInt());
        }

        System.out.println("-------------");
        System.out.println("Initial ArrayList:");
        printList(list);

        System.out.println("-------------");
        System.out.println("Enter 3 more elements:");
        for (int i = 0; i < 3; i++) {
            list.add(scn.nextInt());
        }
        System.out.println("After adding 3 elements:");
        System.out.println(list);

        System.out.println("-------------");
        int removedLast = list.remove(list.size() - 1);
        System.out.println("Removed last element: " + removedLast);
        System.out.println(list);

        System.out.println("-------------");
        int removedIndex = list.remove(3);
        System.out.println("Removed element at index 3: " + removedIndex);
        System.out.println(list);

        System.out.println("-------------");
        list.set(2, 20);
        System.out.println("After setting index 2 to 20:");
        System.out.println(list);

        System.out.println("-------------");
        list.add(2, 10);
        System.out.println("After adding 10 at index 2:");
        System.out.println(list);

        System.out.println("-------------");

        scn.close();
    }

    // Utility method to print list using loop
    public static void printList(ArrayList<Integer> list) {
        for (int val : list) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}