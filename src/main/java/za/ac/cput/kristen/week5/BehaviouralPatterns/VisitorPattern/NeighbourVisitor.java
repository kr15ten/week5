package za.ac.cput.kristen.week5.BehaviouralPatterns.VisitorPattern;

/**
 * Created by kris on 3/11/15.
 */
public interface NeighbourVisitor
{
    public String visit(LeftNeighbour leftNeighbour);
    public String visit(RightNeighbour rightNeighbour);
    public String visit(BackNeighbour backNeighbour);
}
