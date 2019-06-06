package week2;

import java.util.LinkedList;
import java.util.Queue;
/*
 Queue problems :
               -Use a queue to find out if a string is a palindrome
*/
public class ExerciseQueue {
    public static void main(String[] args) {
        palindromeQueue();
    }
    public static void palindromeQueue() {
        String abc = "madam";
        Queue queue = new LinkedList();
        for (int i = abc.length() - 1; i >= 0; i--) {
            queue.add(abc.charAt(i));
        }
        String reverseString = "";

        while (!queue.isEmpty()) {
            reverseString += queue.remove();
        }
        if (abc.equals(reverseString))
            System.out.println("The  String is a palindrome.");
        else
            System.out.println("The String is not a palindrome.");
    }
    }


