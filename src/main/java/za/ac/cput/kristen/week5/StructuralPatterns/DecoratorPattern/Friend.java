package za.ac.cput.kristen.week5.StructuralPatterns.DecoratorPattern;

/**
 * Created by kris on 3/10/15.
 */
public class Friend implements IPerson
{
    @Override
    public String visit() {
        return "weekly";
    }
}
