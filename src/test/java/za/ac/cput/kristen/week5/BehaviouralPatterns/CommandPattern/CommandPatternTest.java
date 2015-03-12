package za.ac.cput.kristen.week5.BehaviouralPatterns.CommandPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.BehaviouralPatterns.Config.AppConfig;

/**
 * Created by kris on 3/11/15.
 */
public class CommandPatternTest
{
    private Parent mom;
    private ITeacher mrDavids;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        mom = (Parent)ctx.getBean("mom");
        mrDavids = (Teacher)ctx.getBean("teacher");
    }

    @Test
    public void testCommandPattern() throws Exception
    {
        Assert.assertEquals("My child got 4 marks", mom.getMarks());
    }
}
