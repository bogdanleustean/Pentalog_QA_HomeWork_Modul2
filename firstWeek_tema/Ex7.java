package firstWeek_tema;
import java.util.Scanner;

//  Write a Java program to check if a positive number is a palindrome or not

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! input a positiv number to check if it is palindrome :");
        int num = scan.nextInt();
        if (num > 0){
            System.out.println("Your number is positive");
        } else{
            System.out.println("Your number is not positive, input a positive number");
        }
        int sum = 0, r;
        int temp = num;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("yes palindrome number");
        } else {
            System.out.println("no not a palindrome number");
        }
    }
}