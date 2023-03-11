package Assignments;

public class Assign01 {
    /* @here1) Create a String and if the String is not empty perform the following:
    if the String has an odd number of characters and has 3 or more characters,
    print the character in the middle of the String.
     For Example String str=hello =>l
 */
    public static void main(String[] args) {
        String word = "sixteen";
        System.out.println(word.isBlank());
        if (!word.isEmpty()) {
            if (word.length() % 2 != 0 && word.length() >= 3) {

                System.out.println(word.charAt(word.length()/2));
            }
        }
    }
}

