package za.ac.cput.kristen.week5.CreationalPatterns.AbstractMethod;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.CreationalPatterns.Config.AppConfig;

/**
 * Created by kris on 3/5/15.
 */
public class AbstractMethodTest
{
    private IItem pkg1item, pkg2item;
    private IService pkg1service;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        pkg1item = (Teddy) ctx.getBean("package1item");
        pkg2item = (Chocolates)ctx.getBean("package2item");
        pkg1service = (AfterCareDays)ctx.getBean("package1service");
    }

    @Test
    public void testAbstractMethod() throws Exception
    {
        Assert.assertNotEquals(pkg1item, pkg2item);
    }

    @Test
    public void testFirstServiceDays() throws Exception
    {
        Assert.assertEquals(40, pkg1service.getDays());
    }
}
