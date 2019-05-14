package firstWeek_in_clasa;
/*
Using SWITCH)
        Have int x =10; y=15;
        Write a piece of code that will do the following:
        If the difference between x and y 3 print out the value of y;
        If the difference between x and y 9 print out the value of x;
        If the difference between x and y -5 print out the value of x+y;
        else print out “sorry...try again”
*/
public class Ex3 {
    public static void main(String[] args) {
switchNumber(10, 15);
    }
    public static void switchNumber(int x, int y){
        switch (x -y ){
            case 3 :
                System.out.println(y);
                break;
            case 9 :
                System.out.println(x);
                break;
            case -5 :
                System.out.println(x + y);
                break;
           default:
                 System.out.println("sorry ... try again");
                 break;
        }
    }
}
