package week3;

public class Mercur extends  SolarSistem implements Sun {

    int  temperature;

    public Mercur( int temperature){
        this.temperature=temperature;
    }

    Mercur( Mercur mercurCopy){
        mercurCopy.temperature=this.temperature;

    }
    @Override
    public void sunLight() {
        System.out.println("sunt metoda din interfata si implementate in clas Mercur");
    }

    public  void functionOneFromMercur(){
        System.out.println("sunt metoda unu din clasa Mercur");;
  }
    public void functionTwoFromMercur(){
        System.out.println("sunt metoda doi din clasa Mercur");;
  }
}
