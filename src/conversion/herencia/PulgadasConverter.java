package conversion.herencia;

public class PulgadasConverter
        extends AbstractConverter {

    public PulgadasConverter(float pies, float metros) {
        super(pies, metros);
        this.result = convert(metros) + convert(new MetrosConverter(pies, 0).getResult());
    }

    @Override
    public float convert(float metros) {

        return metros * 39.37F;
    }
}
