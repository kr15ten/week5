package za.ac.cput.kristen.week5.CreationalPatterns.AbstractMethod;

/**
 * Created by kris on 3/5/15.
 */
public interface IPackageFactory
{
    abstract IService getService();
    abstract IItem getItem();
}
