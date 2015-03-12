package za.ac.cput.kristen.week5.StructuralPatterns.CompositePattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.StructuralPatterns.Config.AppConfig;

/**
 * Created by kris on 3/9/15.
 */
public class CompositePatternTest
{
    private Child try1;
    private IOperate try2;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        try1 = (Child)ctx.getBean("node");
        try1.add(1);
        try2 = try1.getChild(0);
    }

    @Test
    public void testCompositePattern() throws Exception
    {
        Assert.assertEquals("component", try2.operate());
    }
}
