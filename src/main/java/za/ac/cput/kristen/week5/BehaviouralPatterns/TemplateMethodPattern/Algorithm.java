package za.ac.cput.kristen.week5.BehaviouralPatterns.TemplateMethodPattern;

/**
 * Created by kris on 3/10/15.
 */
public class Algorithm
{
    private IInstrument play;

    public Algorithm()
    {
        play = new Piano();
    }

    public String bachPlays()
    {
        return "Bach used to " + play.play();
    }

    public String georgePlays()
    {
        return "George will attempt to " + play.play();
    }
}
