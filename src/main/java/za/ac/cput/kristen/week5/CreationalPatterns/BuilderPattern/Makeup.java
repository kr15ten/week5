package za.ac.cput.kristen.week5.CreationalPatterns.BuilderPattern;

/**
 * Created by kris on 3/9/15.
 */
public class Makeup
{
    private String color;
    private String type;

    public String getColor()
    {
        return color;
    }

    public void setColor(String col)
    {
        color = col;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String toString()
    {
        return String.format("Product type: " + type + "\n\t color: " + color + "\n\n");
    }
}
