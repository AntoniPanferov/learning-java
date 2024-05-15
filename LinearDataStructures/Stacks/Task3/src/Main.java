import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalendrome("1relie 5fpf5eiler1"));
    }

    static boolean isPalendrome(String word) {
        Stack<Character> original = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            original.add(word.charAt(i));
        }

        String reversedWord = "";
        for(int i = 0; i < word.length(); i++) {
            reversedWord += original.pop();
        }
        return reversedWord.replace(" ", "").equals(word.replace(" ", ""));
    }
}