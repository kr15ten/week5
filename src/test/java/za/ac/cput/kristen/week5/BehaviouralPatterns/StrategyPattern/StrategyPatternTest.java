package za.ac.cput.kristen.week5.BehaviouralPatterns.StrategyPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.BehaviouralPatterns.Config.AppConfig;

/**
 * Created by kris on 3/11/15.
 */
public class StrategyPatternTest
{
    private ICommunicate comm;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        comm = (Morse)ctx.getBean("morse");
    }

    @Test
    public void testStrategyPattern() throws Exception
    {
        Assert.assertEquals("tap on wall", comm.talk());
    }
}
