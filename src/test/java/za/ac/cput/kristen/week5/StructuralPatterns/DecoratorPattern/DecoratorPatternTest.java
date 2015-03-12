package za.ac.cput.kristen.week5.StructuralPatterns.DecoratorPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.StructuralPatterns.Config.AppConfig;

/**
 * Created by kris on 3/10/15.
 */
public class DecoratorPatternTest
{
    private Friend George;
    private IPerson Georgie;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        George = (Friend)ctx.getBean("friend");
        Georgie = new BestFriend(George, 3);
    }

    @Test
    public void testDecoratorPattern() throws Exception
    {
        Assert.assertEquals("daily", Georgie.visit());
    }
}
