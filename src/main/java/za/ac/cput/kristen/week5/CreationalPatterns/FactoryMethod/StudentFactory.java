package za.ac.cput.kristen.week5.CreationalPatterns.FactoryMethod;

/**
 * Created by kris on 3/5/15.
 */
public class StudentFactory
{
    private static StudentFactory studentFactory = null;

    private StudentFactory()
    {

    }

    public static StudentFactory getInstance()
    {
        if (studentFactory == null)
            return new StudentFactory();

        return studentFactory;
    }

    public static IStudent getStudent(String type)
    {
        if ("Part time".equalsIgnoreCase(type))
            return new PartTimeStudent();

        else
            return new FullTimeStudent();
    }
}
