package Assignments;



public class StringAssign02 {
    /*   2) Create a String and print it in reverse order (Sunday → yadnuS).
     */
    public static void main(String[] args) {
        String day= "Sunday";
        char c=day.charAt(5);
        for (int i = day.length()-1; i >=0; i--) {
            System.out.println(day.charAt(i));

        }
    }
}
