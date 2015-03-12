package za.ac.cput.kristen.week5.BehaviouralPatterns.InterpreterPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.BehaviouralPatterns.Config.AppConfig;


/**
 * Created by kris on 3/12/15.
 */
public class InterpreterPatternTest
{
    private Context cont;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        cont = (Context)ctx.getBean("ctx");
    }

    @Test
    public void testInterpreterPattern() throws Exception
    {
        Assert.assertEquals("pieA", cont.interpretThing("pie"));
    }
}
