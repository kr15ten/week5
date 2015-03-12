package za.ac.cput.kristen.week5.BehaviouralPatterns.VisitorPattern;

/**
 * Created by kris on 3/11/15.
 */
public class RightNeighbour implements INeighbour
{
    private String name;
    private int borrowing;

    public RightNeighbour(String nm, int brwng)
    {
        name = nm;
        borrowing = brwng;
    }

    @Override
    public void accept(NeighbourVisitor visitor)
    {
        visitor.visit(this);
    }

    public int getBorrowing()
    {
        return borrowing;
    }
}
