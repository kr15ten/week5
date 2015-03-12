package za.ac.cput.kristen.week5.BehaviouralPatterns.CommandPattern;

/**
 * Created by kris on 3/11/15.
 */
public class Parent
{
    private ITeacher teacher;

    public Parent(ITeacher teach)
    {
        teacher = teach;
    }

    public String getMarks()
    {
        return String.format("My child got " + teacher.mark() + " marks");
    }
}
