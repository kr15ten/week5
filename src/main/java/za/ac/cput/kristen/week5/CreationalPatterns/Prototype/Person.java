package za.ac.cput.kristen.week5.CreationalPatterns.Prototype;

/**
 * Created by kris on 3/9/15.
 */
public class Person implements ICopy
{
    private String name, hairColour;
    private int age;

    public Person(String nm, String hair, int age)
    {
        name = nm;
        hairColour = hair;
        this.age = age;
    }

    @Override
    public Person copy()
    {
        return new Person(name, hairColour, age);
    }

    public String toString()
    {
        return String.format("Name: " + name + "\nAge: " + age);
    }
}
