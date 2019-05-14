package firstWeek_in_clasa;
/*
(Using WHILE)
        Have int a =12; b=14;
        Write a piece of code that will do the following:
        While a is lower than b print out the value of a and increase a’s value by 1.
*/
public class Ex4 {
    public static void main(String[] args) {
        whileNumber(12,14);
    }
    public static void whileNumber(int a, int b) {
        while (a < b) {
            a++;
            System.out.println(a);
        }
    }
}