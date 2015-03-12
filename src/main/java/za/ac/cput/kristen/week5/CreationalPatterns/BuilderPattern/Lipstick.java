package za.ac.cput.kristen.week5.CreationalPatterns.BuilderPattern;

/**
 * Created by kris on 3/9/15.
 */
public class Lipstick implements IBuilder
{
    private Makeup product;

    public Lipstick()
    {
        product = new Makeup();
    }

    @Override
    public void buildColor()
    {
        product.setColor("blue");
    }

    @Override
    public void buildType()
    {
        product.setType("lipstick");
    }

    @Override
    public Makeup getProduct()
    {
        return product;
    }
}
