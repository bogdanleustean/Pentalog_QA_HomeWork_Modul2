package firstWeek_in_clasa;

/*(Using DO - WHILE)
        Have int a =14; b=14;
        Write a piece of code that will do the following:
        While a is lower than b print out the value of a and increase a’s value by 1.
*/
public class Ex5 {
    public static void main(String[] args) {
doWhileNumber(14,14);
    }
    public static void doWhileNumber(int a, int b) {
        do {
            a++;
            System.out.println(a);
        } while (a < b);
    }
}
