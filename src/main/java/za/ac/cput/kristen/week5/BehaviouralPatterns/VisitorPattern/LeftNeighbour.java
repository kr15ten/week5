package za.ac.cput.kristen.week5.BehaviouralPatterns.VisitorPattern;

/**
 * Created by kris on 3/11/15.
 */
public class LeftNeighbour implements INeighbour
{
    private String name, borrowed;


    public LeftNeighbour(String nm, String borwd)
    {
        name = nm;
        borrowed = borwd;
    }

    @Override
    public void accept(NeighbourVisitor visitor)
    {
        visitor.visit(this);
    }

    public String getBorrowed() {
        return borrowed;
    }
}
