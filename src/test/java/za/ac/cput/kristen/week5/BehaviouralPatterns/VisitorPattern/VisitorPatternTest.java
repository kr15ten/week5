package za.ac.cput.kristen.week5.BehaviouralPatterns.VisitorPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.BehaviouralPatterns.Config.AppConfig;

/**
 * Created by kris on 3/11/15.
 */
public class VisitorPatternTest
{
    private NeighbourVisitor visit;
    private BackNeighbour back;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        visit = (NeighbourVisitorImpl)ctx.getBean("visitor");
        back = (BackNeighbour)ctx.getBean("backNeighbour");
    }

    @Test
    public void testVisitorPattern() throws Exception
    {
        Assert.assertEquals("George", visit.visit(back));
    }
}
