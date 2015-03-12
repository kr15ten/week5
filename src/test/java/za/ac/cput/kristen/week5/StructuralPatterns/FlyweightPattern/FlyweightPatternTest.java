package za.ac.cput.kristen.week5.StructuralPatterns.FlyweightPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.StructuralPatterns.Config.AppConfig;

/**
 * Created by kris on 3/9/15.
 */
public class FlyweightPatternTest
{
    private CakeFactory cake;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        cake = (CakeFactory)ctx.getBean("cake");
    }

    @Test
    public void testFlyweightPattern() throws Exception
    {
        //Assert.assertNotNull(cake);
        Assert.assertEquals("pink chocolate cake", cake.getCake("chocolate", "pink").toString());
    }
}
