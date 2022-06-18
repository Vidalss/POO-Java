package conversion.archivos;

public class Conversion {

    private double yardas;
    private double metros;
    private double millas;
    private double pulgadas;
    private double pies;

    //Constructor
    public Conversion(double metros, double pies) {
        this.pies = pies;
        this.metros = metros;
        this.convertirMetrosMillas();
        this.convertirMetrosYardas();
        this.convertirMetrosPulgadas();
        this.convertirMetros();
    }

    //Getters


    public double getYardas() {
        return yardas;
    }

    public void setYardas(double yardas) {
        this.yardas = yardas;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public double getMillas() {
        return millas;
    }

    public void setMillas(double millas) {
        this.millas = millas;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public double getPies() {
        return pies;
    }

    public void setPies(double pies) {
        this.pies = pies;
    }

    //Metodos
    public void convertirMetrosPulgadas() {

        this.pulgadas = (this.metros * 39.37) + (this.pies / 3.281);

    }

    public void convertirMetrosYardas() {

        this.yardas = (this.metros * 1.094) + (this.pies / 3.281);
    }

    public void convertirMetrosMillas() {

        this.millas = (this.metros * 1609) + (this.pies / 3.281);
    }

    public void convertirMetros() {

        this.metros = this.metros + (this.pies / 3.281);
    }
}
