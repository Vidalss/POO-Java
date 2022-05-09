package conversion.herencia;

public class MillasConverter
        extends AbstractConverter {

    public MillasConverter(float pies, float metros) {
        super(pies, metros);
        this.result = convert(metros) + convert(new MetrosConverter(pies, 0).getResult());
    }

    @Override
    public float convert(float metros) {

        return metros * 1609;
    }
}
