package conversion;

public class Convertidor {

    //Atributos
    private float yardas;
    private float metros;
    private float millas;
    private float pulgadas;
    private float centimetros;

    //Metodo constructor
    public Convertidor(float pies, float metros) {

        double piesConvertidos = (pies / 3.281);
        this.metros = (float) (metros + piesConvertidos);
        this.convertirMetrosPulgadas(metros);
        this.convertirMetrosPulgadas((float) piesConvertidos);
        this.convertirMetrosYardas(metros);
        this.convertirMetrosYardas((float) piesConvertidos);
        this.convertirMetrosMillas(metros);
        this.convertirMetrosMillas((float) piesConvertidos);


    }
    //Metodo constructor - Sobrecarga
    public Convertidor(float pies, float metros, float yardas) {

        double piesConvertidos = (pies / 3.281);
        this.metros = (float) (metros + piesConvertidos);
        this.convertirMetrosPulgadas(metros);
        this.convertirMetrosPulgadas((float) piesConvertidos);
        this.convertirMetrosYardas(metros);
        this.convertirMetrosYardas((float) piesConvertidos);
        this.convertirMetrosMillas(metros);
        this.convertirMetrosMillas((float) piesConvertidos);

    }

    //Getters
    public float getYardas() {

        return yardas;
    }

    public float getMetros() {

        return metros;
    }

    public float getMillas() {

        return millas;
    }

    public float getPulgadas() {

        return pulgadas;
    }

    public float getCentimetros() {

        return centimetros;
    }


    //Metodos
    //Metodo de instancia
    public void convertirMetrosPulgadas(float metros) {

        pulgadas += metros * 39.37;
    }
    //Metodo de instancia
    public void convertirMetrosYardas(float metros) {

        yardas += metros * 1.094;
    }
    //Metodo de instancia
    public void convertirMetrosMillas(float metros) {

        millas += metros * 1609;
    }

    //Metodo de clase
    public static double convertirYardasCentimetros(float yardas) {
        double centimetros = yardas * 91.44;
        return centimetros;
    }


}
