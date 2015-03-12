package za.ac.cput.kristen.week5.CreationalPatterns.AbstractMethod;

/**
 * Created by kris on 3/5/15.
 */
public class PackageFactory implements IPackageFactory
{
    private static PackageFactory pack = null;

    private PackageFactory(){}

    public static PackageFactory getInstance()
    {
        if (pack == null)
            return new PackageFactory();

        return pack;
    }

    @Override
    public IService getService()
    {
        return new AfterCareDays();
    }

    @Override
    public IItem getItem()
    {
        return new Teddy();
    }
}
