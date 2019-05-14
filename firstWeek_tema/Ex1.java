package firstWeek_tema;

// Write a Java program to print the area and perimeter and area  of a rectangle and a hexagon

public class Ex1 {
    public static void main(String[] args) {

// rectangle

 int lungime = 8;
 int latime = 10;
 int arie = lungime * latime;
 int perimetru = 2*(lungime+latime);
        System.out.println("Aria este " + arie + " si perimetru este " +perimetru);

// hexagon
 double latura = 6;
 double arieHexqgon=(6*(latura*latura)) / (4*Math.tan(Math.PI/6));

        System.out.println("Aria hexagonului este " + arieHexqgon);

    }
}
