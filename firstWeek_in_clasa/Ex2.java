package firstWeek_in_clasa;
/*
Ex (Using IF-ELSE)
        Have int x =10; y=15;
        Write a piece of code that will do the following:
        If the value of x is lower than the one on y it prints out a message stating that x is greater than y
        If the value of x is greater than y it prints out a message stating that x is lower than y
*/
public class Ex2 {
    public static void main(String[] args) {
  ifElseNumber(10,15);
    }
public static void ifElseNumber(int x, int y) {
      if(x < y) {
          System.out.println(" x is greater than y");
      } else {
        System.out.println(" x is lower than y");
    }
  }
}
