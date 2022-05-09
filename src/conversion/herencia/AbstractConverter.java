package conversion.herencia;

public abstract class AbstractConverter
        implements Converter {

    protected final float metros;
    protected final float pies;
    protected float result;

    protected AbstractConverter(float pies, float metros) {
        this.pies = pies;
        this.metros = metros;
    }

    @Override
    public float getResult() {

        return result;
    }
}
