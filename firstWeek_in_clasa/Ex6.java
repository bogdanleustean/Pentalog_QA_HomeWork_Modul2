package firstWeek_in_clasa;
/*
  Using FOR)
        Have int a =12; b=14;
        Write a piece of code that will do the following:
        Print out the difference between b and a, as many times as the value of the difference is.
*/
public class Ex6 {
    public static void main(String[] args) {
      forNumber(12, 14);

    }
public static void forNumber(int a, int b){
        int result = b -a;
        for(int i= 0; i < result; i++){
            System.out.println(result);
        }
    }
}
