package za.ac.cput.kristen.week5.StructuralPatterns.Config;

import com.sun.xml.internal.ws.api.pipe.helper.AbstractTubeImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.kristen.week5.StructuralPatterns.AdapterPattern.FloatValue;
import za.ac.cput.kristen.week5.StructuralPatterns.AdapterPattern.IAdapt;
import za.ac.cput.kristen.week5.StructuralPatterns.BridgePattern.Abstr;
import za.ac.cput.kristen.week5.StructuralPatterns.CompositePattern.Child;
import za.ac.cput.kristen.week5.StructuralPatterns.CompositePattern.IOperate;
import za.ac.cput.kristen.week5.StructuralPatterns.DecoratorPattern.Friend;
import za.ac.cput.kristen.week5.StructuralPatterns.DecoratorPattern.IPerson;
import za.ac.cput.kristen.week5.StructuralPatterns.FacadePattern.Room;
import za.ac.cput.kristen.week5.StructuralPatterns.FlyweightPattern.CakeFactory;
import za.ac.cput.kristen.week5.StructuralPatterns.ProxyPattern.IServer;
import za.ac.cput.kristen.week5.StructuralPatterns.ProxyPattern.Prox;

/**
 * Created by kris on 3/9/15.
 */

@Configuration
public class AppConfig
{
    @Bean(name="float")
    public IAdapt getValue()
    {
        return new FloatValue();
    }

    @Bean(name="node")
    public IOperate getChild()
    {
        return new Child();
    }

    @Bean(name="proxy")
    public IServer getProxy()
    {
        return new Prox();
    }

    @Bean(name="cake")
    public CakeFactory getCake()
    {
        return new CakeFactory();
    }

    @Bean(name="facade")
    public Room getRoom()
    {
        return new Room();
    }

    @Bean(name="bridge")
    public Abstr getAbstract()
    {
        return new Abstr();
    }

    @Bean(name="friend")
    public IPerson getFriend()
    {
        return new Friend();
    }
}
