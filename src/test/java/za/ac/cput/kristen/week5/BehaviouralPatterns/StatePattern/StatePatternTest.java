package za.ac.cput.kristen.week5.BehaviouralPatterns.StatePattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.BehaviouralPatterns.Config.AppConfig;

/**
 * Created by kris on 3/11/15.
 */
public class StatePatternTest
{
    private Context context;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        context = (Context)ctx.getBean("contextClass");
    }

    @Test
    public void testStatePattern() throws Exception
    {
        Assert.assertEquals("stay in the pool", context.requestHandle());
    }
}
