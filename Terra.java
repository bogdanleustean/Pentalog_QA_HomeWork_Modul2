package week3;

public class Terra extends SolarSistem implements Sun{

 static int atmosphere ;

    public Terra( int atmosphere){
       this.atmosphere=atmosphere;
    }

    Terra(Terra terraCopy){
        terraCopy.atmosphere=this.atmosphere;
    }

    @Override
    public void sunLight() {
        System.out.println("Sunt metoda din interfata si implementata in clasa Terra");
    }

    public void functionOneFromTerra (){
        System.out.println("Sunt metoda unu din clasa Terra");

    }

    public void functionTwoFromTerra(){
        System.out.println("Sunt metoda doi din clasa Terra");

    }
 }