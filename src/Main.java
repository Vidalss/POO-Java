import conversion.Convertidor;
import conversion.herencia.*;

public class Main {

    public static void main(String[] args) {

        //Constructor
        Convertidor convertidor = new Convertidor(20,80);
        System.out.println("Constructor");
        System.out.println("Metros es " + convertidor.getMetros());
        System.out.println("Yardas es " + convertidor.getYardas());
        System.out.println("Millas es " + convertidor.getMillas());
        System.out.println("Pulgadas es " + convertidor.getPulgadas());
        System.out.println(" ");

        //Sobrecarga de operadores
        Convertidor convertidor1 = new Convertidor(20,80,10);
        System.out.println("Sobrecarga de operadores");
        System.out.println("Metros es " + convertidor1.getMetros());
        System.out.println("Yardas es " + convertidor1.getYardas());
        System.out.println("Millas es " + convertidor1.getMillas());
        System.out.println("Pulgadas es " + convertidor1.getPulgadas());
        System.out.println("Centimetros es " + convertidor1.getCentimetros());

        //Metodo de clase
        System.out.println(" ");
        System.out.println("Metodo de clase");
        System.out.println("Centrimetros es: " + convertidor1.convertirYardasCentimetros(94));


        //Herencia
        //Metros
        Converter converter = new MetrosConverter(20,80);
        System.out.println(" ");
        System.out.println("Herencia");
        System.out.println("Metros es: " + converter.getResult());
        //Yardas
        Converter converter1 = new YardasConverter(20,80);
        System.out.println("Yardas es: " + converter1.getResult());
        //Millas
        Converter converter2 = new MillasConverter(20, 80);
        System.out.println("Millas es: " + converter2.getResult());
        //Pulgadas
        Converter converter3 = new PulgadasConverter(20,80);
        System.out.println("Pulgadas es: " + converter3.getResult());
    }


}

