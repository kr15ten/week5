package za.ac.cput.kristen.week5.StructuralPatterns.AdapterPattern;

/**
 * Created by kris on 3/9/15.
 */
public class FloatValue implements IAdapt
{
    private Inte value = new Inte();

    @Override
    public Float adapt() {
        return (float)value.getValue();
    }
}
