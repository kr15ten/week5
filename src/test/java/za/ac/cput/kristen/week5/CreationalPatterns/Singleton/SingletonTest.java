package za.ac.cput.kristen.week5.CreationalPatterns.Singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.CreationalPatterns.Config.AppConfig;

/**
 * Created by kris on 3/5/15.
 */
public class SingletonTest
{
    private Person john, steve;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        john = (Person)ctx.getBean("person");
        steve = (Person)ctx.getBean("person");
    }

    @Test
    public void testSingleton() throws Exception
    {
        Assert.assertEquals(john.hashCode(), steve.hashCode());
    }
}
