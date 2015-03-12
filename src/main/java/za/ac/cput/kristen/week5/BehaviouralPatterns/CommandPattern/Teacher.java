package za.ac.cput.kristen.week5.BehaviouralPatterns.CommandPattern;

/**
 * Created by kris on 3/11/15.
 */
public class Teacher implements ITeacher
{
    private static Teacher teacher = null;
    private static Test test;

    public Teacher()
    {
        test = new Test(4);
    }

    public static Teacher getInstance()
    {
        if (teacher == null)
            teacher = new Teacher();

        return teacher;
    }

    @Override
    public int mark()
    {
        return test.getMarked();
    }
}
