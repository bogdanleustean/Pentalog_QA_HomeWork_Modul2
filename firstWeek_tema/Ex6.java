package firstWeek_tema;

//   Write a Java program which iterates the integers from 1 to 100.
//  For multiples of three print "Fizz" instead of the number and print "Buzz" for the multiples of five.
//  When number is divided by both three and five, print "fizz buzz"

public class Ex6 {
    public static void main(String[] args) {
        for( int i =0; i < 100; i ++){
            if(i % 15 ==0 ){
                System.out.println("fizz buzz " + i );
            } else if(i % 5 == 0){
                System.out.println("Buzz " + i);
            } else if(i % 3 == 0 ){
                System.out.println("Fizz " + i );
            }
        }
    }
}
