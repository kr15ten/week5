package za.ac.cput.kristen.week5.CreationalPatterns.FactoryMethod;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.CreationalPatterns.Config.AppConfig;

/**
 * Created by kris on 3/5/15.
 */
public class FactoryMethodTest
{
    private IStudent john, steve;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        john = (PartTimeStudent)ctx.getBean("partTimeStudent");
        steve = (FullTimeStudent)ctx.getBean("fullTimeStudent");
    }

    @Test
    public void testFactoryMethod() throws Exception
    {
        Assert.assertNotEquals(john, steve);
    }
}
