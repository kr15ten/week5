package za.ac.cput.kristen.week5.CreationalPatterns.FactoryMethod;

/**
 * Created by kris on 3/5/15.
 */
public class FullTimeStudent implements IStudent
{
    @Override
    public String getHours() {
        return "office hours";
    }
}
