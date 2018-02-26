/*
    Проверка на палиндром
*/
import java.util.Scanner; // импорт сканнера

public class Palindrome {
    public static void main(String[] vals) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input words:");
        for (int i = 0; i < 10; i++) {
            String s = sc.nextLine();
            System.out.println(s + ": " + isPalindrome(s));
        }
    }

    //Разворачивает строку s
    public static String reverseString(String s) {
        String reverse = "";

        for (int i = s.length()-1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        return reverse;
    }

    //Проверяет является ли  новая строка s палиндромом
    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}