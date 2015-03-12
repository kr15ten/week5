package za.ac.cput.kristen.week5.BehaviouralPatterns.TemplateMethodPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.BehaviouralPatterns.Config.AppConfig;

/**
 * Created by kris on 3/10/15.
 */
public class TemplateMethodPatternTest
{
    private Algorithm alg;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        alg = (Algorithm)ctx.getBean("algorithm");
    }

    @Test
    public void testTemplateMethodPattern() throws Exception
    {
        Assert.assertEquals("Bach used to tickle the ivories", alg.bachPlays());
    }
}
