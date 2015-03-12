package za.ac.cput.kristen.week5.StructuralPatterns.DecoratorPattern;

/**
 * Created by kris on 3/10/15.
 */
public class BestFriend implements IPerson
{
    private int years;
    private Friend friend;

    public BestFriend(Friend friend, int x)
    {
        years = x;
        this.friend = friend;
    }

    @Override
    public String visit()
    {
        return "daily";
    }

    public String friendship()
    {
        return "very close";
    }
}
