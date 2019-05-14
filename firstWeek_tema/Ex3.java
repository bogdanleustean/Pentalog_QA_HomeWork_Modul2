package firstWeek_tema;

 // Write a Java program to reverse a string

public class Ex3 {
    public static void main(String[] args) {
        String abc = "pentalog";
        String abcReverse = " " ;
        for (int i = abc.length() -1 ; i >= 0; i -- ){
            abcReverse += abc.charAt(i);
        }
        System.out.println(abcReverse);
    }
}
