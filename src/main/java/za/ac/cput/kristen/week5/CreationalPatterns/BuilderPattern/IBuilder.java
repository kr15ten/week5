package za.ac.cput.kristen.week5.CreationalPatterns.BuilderPattern;

/**
 * Created by kris on 3/9/15.
 */
public interface IBuilder
{
    void buildColor();
    void buildType();
    Makeup getProduct();
}
