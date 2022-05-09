package conversion.herencia;

public class MetrosConverter
        extends AbstractConverter {

    public MetrosConverter(float pies, float metros) {
        super(pies, metros);
        this.result = convert(pies) + metros;
    }

    @Override
    public float convert(float pies) {

        return pies / 3.281F;
    }
}