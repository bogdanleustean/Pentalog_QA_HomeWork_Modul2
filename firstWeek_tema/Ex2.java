package firstWeek_tema;

 // Write a Java program to compute the distance between two points on the surface of earth

public class Ex2 {
  public static void main(String[] args) {
      double lat1 =29.1;
      double lon1 =28.4;
      double lat2 =18.6;
      double lon2 =19.9;
      double earthRadius = 6371.01; //Kilometers
         lat1 = Math.toRadians(lat1);
         lon1 = Math.toRadians(lon1);
         lat2 = Math.toRadians(lat2);
         lon2 = Math.toRadians(lon2);
       double distance =  earthRadius * Math.acos(Math.sin(lat1)* Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));
      System.out.print("The distance between those points is: " + distance + " km\n");
     }

  }

