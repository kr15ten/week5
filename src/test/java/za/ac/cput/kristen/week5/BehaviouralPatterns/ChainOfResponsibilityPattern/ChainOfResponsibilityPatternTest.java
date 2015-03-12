package za.ac.cput.kristen.week5.BehaviouralPatterns.ChainOfResponsibilityPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kris on 3/10/15.
 */
public class ChainOfResponsibilityPatternTest
{
    private Switchboard chain;

    @Before
    public void setUp() throws Exception
    {
        chain = setUpChain();
    }

    public static Switchboard setUpChain()
    {
        Switchboard area1Handler = new Area1();
        Switchboard area2Handler = new Area2();
        Switchboard area3Handler = new Area3();

        area1Handler.setSuccessor(area2Handler);
        area2Handler.setSuccessor(area3Handler);

        return area3Handler;
    }

    @Test
    public void testChainOfResponsibilityPattern() throws Exception
    {
        Assert.assertEquals("Area 3 handled", chain.handleCall(3));
    }
}
