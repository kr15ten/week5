package za.ac.cput.kristen.week5.BehaviouralPatterns.ObserverPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.BehaviouralPatterns.Config.AppConfig;

/**
 * Created by kris on 3/10/15.
 */
public class ObserverPatternTest
{
    private Citizens bug;
    private INSA obama;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        bug = (Citizens)ctx.getBean("bug");
        obama = (NSAImpl)ctx.getBean("obama");

        bug.addWatcher(obama);
        bug.setState("Everything");
    }

    @Test
    public void testObserverPattern() throws Exception
    {
        Assert.assertEquals("Obama sees "+ '"'+ "Everything"+'"' , bug.notifyWatcher());
    }
}
