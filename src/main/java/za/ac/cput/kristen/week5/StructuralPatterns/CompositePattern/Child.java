package za.ac.cput.kristen.week5.StructuralPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kris on 3/9/15.
 */
public class Child implements IOperate
{
    private List<IOperate> child = new ArrayList<IOperate>();

    @Override
    public String operate() {
        return String.format("composite");
    }

    public void add(int choice)
    {
        switch(choice) {
            case 1:
                child.add(new Operator());
                break;
            case 2:
                child.add(new Child());
                break;
        }
    }

    public void remove()
    {
        child.remove(this);
    }

    public IOperate getChild(int x)
    {
        return child.get(x);
    }
}
