package za.ac.cput.kristen.week5.CreationalPatterns.BuilderPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.CreationalPatterns.Config.AppConfig;

/**
 * Created by kris on 3/9/15.
 */
public class BuilderPatternTest
{
    private Artist makeStuff;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        makeStuff = (Artist)ctx.getBean("lipstick");
    }

    @Test
    public void testBuilderPattern() throws Exception
    {
        Assert.assertEquals("red", makeStuff.getMakeup().getColor());
    }
}
