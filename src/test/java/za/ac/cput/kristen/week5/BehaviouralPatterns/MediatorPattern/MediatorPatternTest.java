package za.ac.cput.kristen.week5.BehaviouralPatterns.MediatorPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.kristen.week5.BehaviouralPatterns.Config.AppConfig;

/**
 * Created by kris on 3/10/15.
 */
public class MediatorPatternTest
{
    private IServer serv;
    private ClientImpl client1, client2;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        serv = (Server)ctx.getBean("server");
        client1 = (ClientImpl)ctx.getBean("client1");
        client2 = (ClientImpl)ctx.getBean("client2");
        serv.addClient(client1);
        serv.addClient(client2);

        client1.send("Hello");
    }

    @Test
    public void testMediatorPattern() throws Exception
    {
        Assert.assertEquals("Received: Hello", client2.getReceived());
    }
}
