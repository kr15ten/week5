package za.ac.cput.kristen.week5.BehaviouralPatterns.VisitorPattern;

/**
 * Created by kris on 3/11/15.
 */
public class BackNeighbour implements INeighbour
{
    private String name;

    public BackNeighbour(String nm)
    {
        name = nm;
    }

    @Override
    public void accept(NeighbourVisitor visitor)
    {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }
}
