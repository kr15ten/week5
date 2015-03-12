package za.ac.cput.kristen.week5.StructuralPatterns.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kris on 3/9/15.
 */
public class CakeFactory
{
    private CakeFactory cakeFactory = null;
    private Map<String, Cake> cake = new HashMap<String, Cake>();
    private Cake newCake;

    public CakeFactory CakeFactory()
    {
        if (cakeFactory == null)
        {
            cakeFactory = new CakeFactory();
        }

        return cakeFactory;
    }

    public Cake getCake(String type, String color)
    {
        if (!cake.containsKey(color+" "+type))
        {
            newCake = new Cake();
            newCake.makeCake(type, color);
            cake.put(color+" "+type, newCake);
        }
        return cake.get(color+" "+type);
    }
}
