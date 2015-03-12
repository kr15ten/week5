package za.ac.cput.kristen.week5.StructuralPatterns.FacadePattern;

/**
 * Created by kris on 3/10/15.
 */
public class Room
{
    private Plant plant;
    private Couch couch;
    private TV tv;

    public Room()
    {
        plant = new Plant();
        couch = new Couch();
        tv = new TV();
    }

    public String waterPlant()
    {
        return String.format(plant.water());
    }

    public String watchTV()
    {
        return String.format(couch.sit() + "\n" + tv.watch());
    }
}
