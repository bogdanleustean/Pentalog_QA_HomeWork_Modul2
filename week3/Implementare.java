package week3;

public class Implementare {
    public static void main(String[] args) {

        Mercur planetaMercur = new Mercur(22);
        Terra planetaTerra = new Terra(33);
        SolarSistem solarSistem = new SolarSistem();

        solarSistem.firstMethod();
        solarSistem.secondMethod();
        solarSistem.thirdMethod();
        System.out.println();

        planetaMercur.functionOneFromMercur();
        planetaMercur.functionTwoFromMercur();
        planetaMercur.sunLight();
        System.out.println("Temperatura din Mercur este " + planetaMercur.temperature);
        System.out.println();

        planetaTerra.functionOneFromTerra();
        planetaTerra.functionTwoFromTerra();
        planetaTerra.sunLight();
        System.out.println( "Presiunea atomosferica din Terra este " + planetaTerra.atmosphere);

        System.out.println("Obiectele copiate: \n");

        System.out.println("Obiectul mercur copiat:");
        Mercur mercurCopy =planetaMercur;
        mercurCopy.temperature = planetaMercur.temperature*2;
        mercurCopy.functionOneFromMercur();
        mercurCopy.functionTwoFromMercur();
        mercurCopy.sunLight();
        System.out.println(mercurCopy.temperature);

        System.out.println();

        System.out.println("Obiectul terra copiat:");
        Terra terraCopy = planetaTerra;
        terraCopy.atmosphere = planetaTerra.atmosphere*2;
        terraCopy.functionOneFromTerra();
        terraCopy.functionTwoFromTerra();
        terraCopy.sunLight();
        System.out.println(terraCopy.atmosphere);




    }
 }
