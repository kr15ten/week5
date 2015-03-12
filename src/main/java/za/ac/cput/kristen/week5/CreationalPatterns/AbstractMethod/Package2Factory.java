package za.ac.cput.kristen.week5.CreationalPatterns.AbstractMethod;

/**
 * Created by kris on 3/5/15.
 */
public class Package2Factory implements IPackageFactory
{
    private static Package2Factory package2 = null;

    private Package2Factory(){}

    public static Package2Factory getInstance()
    {
        if (package2 == null)
            return new Package2Factory();

        return package2;
    }

    @Override
    public IService getService()
    {
        return new SpaHours();
    }

    @Override
    public IItem getItem()
    {
        return new Chocolates();
    }
}
