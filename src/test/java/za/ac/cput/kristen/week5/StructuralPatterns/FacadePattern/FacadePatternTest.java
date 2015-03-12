package za.ac.cput.kristen.week5.StructuralPatterns.FacadePattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.StructuralPatterns.Config.AppConfig;

/**
 * Created by kris on 3/9/15.
 */
public class FacadePatternTest
{
    private Room room;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        room = (Room)ctx.getBean("facade");
    }

    @Test
    public void testFacadePattern() throws Exception
    {
        Assert.assertEquals("Plant grows", room.waterPlant());
    }
}
