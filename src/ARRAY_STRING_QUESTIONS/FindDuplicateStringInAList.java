package ARRAY_STRING_QUESTIONS;

public class FindDuplicateStringInAList {
    static void main() {

                String str = "Learn java learn python also match also";
                int count;

                str = str.toLowerCase();
                String[] words = str.split(" "); // split by space

                for (int i = 0; i < words.length; i++) {
                    count = 1;
                    for (int j = i + 1; j < words.length; j++) {
                        if (words[i].equals(words[j])) {
                            count++;
                            words[j] = "0"; // mark as visited
                        }
                    }

                    if (count > 1 && !words[i].equals("0")) {
                        System.out.println(words[i]);
                    }
                }
          }
}
