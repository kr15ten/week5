package za.ac.cput.kristen.week5.BehaviouralPatterns.MementoPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.BehaviouralPatterns.Config.AppConfig;

import java.sql.Savepoint;

/**
 * Created by kris on 3/12/15.
 */
public class MementoPatternTest
{
    private Task task;
    private Progress progress;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        task = (Task)ctx.getBean("memento");

        progress = new Progress("Game", 4);
        task.saveState(progress);
        //progress.save();


        progress.setNameAndPercentage("Games", 28);
        task.restoreState(progress);
        //progress.restore(progress);
    }

    @Test
    public void testMementoPattern() throws Exception
    {
        Assert.assertEquals("Project Game at 4%", progress.toString());
    }
}
