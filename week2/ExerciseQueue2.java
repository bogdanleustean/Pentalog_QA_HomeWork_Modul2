package week2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/* -U have the following queue :    front [1, 2, -2, 9, 4, -5, 8, -8, -12, 15, 23] back
        Write a java problem that orders this queue using an auxiliary stack
 */
public class ExerciseQueue2 {
    static void sortQueue(Queue<Integer> input) {
        Stack<Integer> tmpStack = new Stack<Integer>();
        while (!input.isEmpty()) {
            int tmp = input.poll();
            while (!tmpStack.empty() && tmpStack.peek() > tmp) {
                input.add(tmpStack.peek());
                tmpStack.pop();
            }
            tmpStack.push(tmp);
            System.out.println("temporary stack: " + tmpStack);
            System.out.println("current input: " + input);
        }
        System.out.println(tmpStack);
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(-2);
        queue.add(9);
        queue.add(4);
        queue.add(-5);
        queue.add(8);
        queue.add(-8);
        queue.add(-12);
        queue.add(15);
        queue.add(23);
        sortQueue(queue);
    }

}