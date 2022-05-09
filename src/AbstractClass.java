public abstract class AbstractClass {

    public static double yardasAbs(float metros, float pies) {

        double yardas = (metros * 1.094) + (pies / 3.281);
        return yardas;
    }

    public static double millasAbs(float metros, float pies) {

        double millas = (metros * 1609) + (pies / 3.281);
        return millas;
    }

    public static double pulgadasAbs(float metros, float pies) {

        double pulgadas = (metros * 39.37) + (pies / 3.281);
        return pulgadas;
    }

    public static double metrosAbs(float metros, float pies) {
        double mts = metros + (pies / 3.281);
        return  mts;
    }



}

