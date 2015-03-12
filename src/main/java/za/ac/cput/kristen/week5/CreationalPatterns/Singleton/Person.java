package za.ac.cput.kristen.week5.CreationalPatterns.Singleton;

/**
 * Created by kris on 3/5/15.
 */
public class Person
{
    private static Person person = null;

    private Person()
    {

    }

    public static Person getInstance()
    {
        if (person == null)
        {
            person = new Person();
        }

        return person;
    }
}
