package za.ac.cput.kristen.week5.BehaviouralPatterns.VisitorPattern;

/**
 * Created by kris on 3/11/15.
 */
public interface INeighbour
{
    public void accept(NeighbourVisitor visitor);
}
