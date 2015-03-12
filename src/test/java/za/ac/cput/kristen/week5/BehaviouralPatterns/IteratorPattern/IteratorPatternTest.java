package za.ac.cput.kristen.week5.BehaviouralPatterns.IteratorPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.BehaviouralPatterns.Config.AppConfig;

import java.util.Iterator;

/**
 * Created by kris on 3/11/15.
 */
public class IteratorPatternTest
{
    private Babies babyList;
    private Iterator<Word> iterate;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        babyList = (Babies)ctx.getBean("babyList");
        iterate = babyList.iterator();

        babyList.addBabyWord(new Word("Kristy", "mamma"));
        babyList.addBabyWord(new Word("George", "pop"));
        babyList.addBabyWord(new Word("Jenie", "da"));

        iterate.next();
        iterate.next();
    }

    @Test
    public void testIteratorPattern() throws Exception
    {
        Assert.assertEquals("Jenie's first word was da", iterate.next().getWord());
    }
}
