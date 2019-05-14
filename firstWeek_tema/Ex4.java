package firstWeek_tema;

// Write a Java program to print the odd numbers from 1 to 99

public class Ex4 {
    public static void main(String[] args) {
        for(int i =1; i< 99; i++){
            if(i % 2 ==0){
                System.out.print( i + ", ");
            }
        }
    }
}
