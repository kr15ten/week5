package za.ac.cput.kristen.week5.BehaviouralPatterns.IteratorPattern;

/**
 * Created by kris on 3/11/15.
 */
public class Word implements IWord
{
    private String name, firstWord;


    public Word(String nm, String word)
    {
        name = nm;
        firstWord = word;
    }

    @Override
    public String getWord()
    {
        return name + "'s first word was " + firstWord;
    }
}
