package za.ac.cput.kristen.week5.StructuralPatterns.BridgePattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.StructuralPatterns.Config.AppConfig;


/**
 * Created by kris on 3/10/15.
 */
public class BridgePatternTest
{
    private Abstr abstr;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        abstr = (Abstr)ctx.getBean("bridge");
    }

    @Test
    public void testBridgePatternTest() throws Exception
    {
        Assert.assertEquals("verly fast", abstr.types());
    }
}
