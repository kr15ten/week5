package za.ac.cput.kristen.week5.BehaviouralPatterns.VisitorPattern;

/**
 * Created by kris on 3/11/15.
 */
public class NeighbourVisitorImpl implements NeighbourVisitor
{
    @Override
    public String visit(LeftNeighbour leftNeighbour)
    {
        return leftNeighbour.getBorrowed();
    }

    @Override
    public String visit(RightNeighbour rightNeighbour)
    {
        return String.format("borrowing " + rightNeighbour.getBorrowing() + " items");
    }

    @Override
    public String visit(BackNeighbour backNeighbour)
    {
        return backNeighbour.getName();
    }
}
