package firstWeek_in_clasa;
/*
Have int x =10; y=15;
        Write a piece of code that will do the following:
        If the value of x is lower than the one on y it prints out a message stating that x is greater than y
        If the value of x is greater than y it prints out a message stating that x is lower than y
*/
public class Ex1 {
    public static void main(String[] args) {
    ifNumber(10,15);
    }
   public static void ifNumber(int x, int y){
        if(x < y) System.out.println("x is greater than y");
        if(x > y) System.out.println("x is lower than y");
   }
}
