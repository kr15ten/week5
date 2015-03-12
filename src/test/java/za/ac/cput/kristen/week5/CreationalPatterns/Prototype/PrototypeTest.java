package za.ac.cput.kristen.week5.CreationalPatterns.Prototype;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.CreationalPatterns.Config.AppConfig;

/**
 * Created by kris on 3/9/15.
 */
public class PrototypeTest
{
    private ICopy one, two;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        one = (Person)ctx.getBean("personOne");
        two = one.copy();
    }

    @Test
    public void testPrototype() throws Exception
    {
        Assert.assertEquals(one.toString(), two.toString());
    }

    @Test
    public void testHashCodes() throws Exception
    {
        Assert.assertNotEquals(one.hashCode(), two.hashCode());
    }
}
