package ScalerDSA.Beginers2.String;

import java.util.Arrays;

public class StrinDemo {// String str = "India";
    public static void main(String[] args) {

        // Q1 – Print characters line by line
        printCharacters("India");

        System.out.println("---------------------------------");

        // Q2 – Print ASCII values
        printAscii("ABC abc!@#");

        System.out.println("---------------------------------");


        // Q3 – Count uppercase and lowercase
        countUpperLower("sdVFweQAmC");

        System.out.println("---------------------------------");


        // Q4 – Count special characters
        String specialStr = "7835abc73AHd^*(*&(&J";
        System.out.println("Special Characters: " + countSpecialChar(specialStr));

        System.out.println("---------------------------------");


        // Q5 – Password strength
        String pass = "Test";
        System.out.println("Password Strength: " + checkStrengthOfPass(pass));

        System.out.println("---------------------------------");


        // Q6 – Reverse String
        reverseString("Shreesh");

        System.out.println("---------------------------------");


        // Extra Array Example
        arrayDemo();
    }

    // Q1
    public static void printCharacters(String str) {
        System.out.println("Characters in string:");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println();
    }

    // Q2
    public static void printAscii(String str) {
        System.out.println("ASCII values:");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " : " + (int) str.charAt(i));
        }
        System.out.println();
    }

    // Q3
    public static void countUpperLower(String str) {
        int upper = 0, lower = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ('A' <= ch && ch <= 'Z') upper++;
            else if ('a' <= ch && ch <= 'z') lower++;
        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println();
    }

    // Q4
    public static int countSpecialChar(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!('A' <= ch && ch <= 'Z') &&
                    !('a' <= ch && ch <= 'z') &&
                    !('0' <= ch && ch <= '9')) {
                count++;
            }
        }
        return count;
    }

    // Q5
    public static String checkStrengthOfPass(String password) {
        if (password.length() <= 8) return "weak";

        int alphaCount = alphabetCount(password);
        int numCount = numericCount(password);
        int specCount = countSpecialChar(password);

        if (alphaCount > 0 && numCount == 0 && specCount == 0) return "weak";
        if (alphaCount > 0 && numCount > 0 && specCount == 0) return "moderate";
        if (alphaCount > 0 && numCount > 0 && specCount > 0) return "strong";

        return "invalid";
    }

    public static int alphabetCount(String pass) {
        int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z')) {
                count++;
            }
        }
        return count;
    }

    public static int numericCount(String pass) {
        int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if ('0' <= ch && ch <= '9') {
                count++;
            }
        }
        return count;
    }

    // Q6
    public static void reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + rev);
        System.out.println();
    }

    // Extra: Array concept demo
    public static void arrayDemo() {
        int[] A = {1, 2, 3, 4};
        System.out.println("Original Array: " + Arrays.toString(A));

        int i = -1;
        int j = 2;

        System.out.println("Before: i=" + i + " j=" + j);
        A[++i] = A[j];  // A[0] = A[2]
        System.out.println("After: i=" + i + " j=" + j);

        System.out.println("Modified Array: " + Arrays.toString(A));
    }
}