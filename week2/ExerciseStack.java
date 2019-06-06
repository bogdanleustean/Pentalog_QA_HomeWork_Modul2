package week2;

import java.util.Stack;
/*
        Stack problems :
        Reverse the word    " Incomprehensibilities"      .
        Hint : You push the word to stack - letter by letter - and then pop letters from the stack.

*/
public class ExerciseStack {
    public static void main(String[] args) {
  wordReverse(" Incomprehensibilities");

    }
    public static void wordReverse(String abc) {
        Stack<Character> letters = new Stack<>();
        for (int i = 0; i < abc.length(); i++) {
            letters.push(abc.charAt(i));
        }
        while (!letters.empty()) {
            System.out.print( letters.pop());
        }
    }
}
