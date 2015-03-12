package za.ac.cput.kristen.week5.StructuralPatterns.AdapterPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.StructuralPatterns.Config.AppConfig;

/**
 * Created by kris on 3/9/15.
 */
public class AdapterPatternTest
{
    private IAdapt value;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        value = (FloatValue)ctx.getBean("float");
    }

    @Test
    public void testAdapterPattern() throws Exception
    {
        Assert.assertEquals(4.00, value.adapt(), 2);
    }
}
