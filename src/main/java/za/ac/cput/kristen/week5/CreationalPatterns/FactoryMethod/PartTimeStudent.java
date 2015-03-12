package za.ac.cput.kristen.week5.CreationalPatterns.FactoryMethod;

/**
 * Created by kris on 3/5/15.
 */
public class PartTimeStudent implements IStudent
{
    @Override
    public String getHours() {
        return "late";
    }
}
