package za.ac.cput.kristen.week5.CreationalPatterns.BuilderPattern;

/**
 * Created by kris on 3/9/15.
 */
public class Artist
{
    private Lipstick lipstick = null;

    public Artist(Lipstick lipstick)
    {
        this.lipstick = lipstick;
    }

    public void makeMakeup()
    {
        lipstick.buildColor();
        lipstick.buildType();
    }

    public Makeup getMakeup()
    {
        return lipstick.getProduct();
    }
}
