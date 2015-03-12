package za.ac.cput.kristen.week5.StructuralPatterns.ProxyPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.StructuralPatterns.Config.AppConfig;

/**
 * Created by kris on 3/9/15.
 */
public class ProxyPatternTest
{
    private IServer prox;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        prox = (Prox)ctx.getBean("proxy");
    }

    @Test
    public void testProxyPattern() throws Exception
    {
        Assert.assertEquals("Hello user", prox.request("user"));
    }
}
