package za.ac.cput.kristen.week5.BehaviouralPatterns.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.kristen.week5.BehaviouralPatterns.CommandPattern.ITeacher;
import za.ac.cput.kristen.week5.BehaviouralPatterns.CommandPattern.Parent;
import za.ac.cput.kristen.week5.BehaviouralPatterns.CommandPattern.Teacher;
import za.ac.cput.kristen.week5.BehaviouralPatterns.IteratorPattern.Babies;
import za.ac.cput.kristen.week5.BehaviouralPatterns.MediatorPattern.ClientImpl;
import za.ac.cput.kristen.week5.BehaviouralPatterns.MediatorPattern.IClient;
import za.ac.cput.kristen.week5.BehaviouralPatterns.MediatorPattern.IServer;
import za.ac.cput.kristen.week5.BehaviouralPatterns.MediatorPattern.Server;
import za.ac.cput.kristen.week5.BehaviouralPatterns.MementoPattern.Task;
import za.ac.cput.kristen.week5.BehaviouralPatterns.ObserverPattern.Citizens;
import za.ac.cput.kristen.week5.BehaviouralPatterns.ObserverPattern.INSA;
import za.ac.cput.kristen.week5.BehaviouralPatterns.ObserverPattern.NSAImpl;
import za.ac.cput.kristen.week5.BehaviouralPatterns.StatePattern.Context;
import za.ac.cput.kristen.week5.BehaviouralPatterns.StatePattern.Texas;
import za.ac.cput.kristen.week5.BehaviouralPatterns.StrategyPattern.ICommunicate;
import za.ac.cput.kristen.week5.BehaviouralPatterns.StrategyPattern.Morse;
import za.ac.cput.kristen.week5.BehaviouralPatterns.TemplateMethodPattern.Algorithm;
import za.ac.cput.kristen.week5.BehaviouralPatterns.VisitorPattern.BackNeighbour;
import za.ac.cput.kristen.week5.BehaviouralPatterns.VisitorPattern.INeighbour;
import za.ac.cput.kristen.week5.BehaviouralPatterns.VisitorPattern.NeighbourVisitor;
import za.ac.cput.kristen.week5.BehaviouralPatterns.VisitorPattern.NeighbourVisitorImpl;


/**
 * Created by kris on 3/10/15.
 */

@Configuration
public class AppConfig
{
    @Bean(name="algorithm")
    public Algorithm getAlgorithm()
    {
        return new Algorithm();
    }

    @Bean(name="server")
    public IServer getServer()
    {
        return Server.getInstance();
    }

    @Bean(name="client1")
    public IClient getClient1()
    {
        return new ClientImpl(Server.getInstance(), "Client1");
    }

    @Bean(name="client2")
    public IClient getClient2()
    {
        return new ClientImpl(Server.getInstance(), "Client2");
    }

    @Bean(name="bug")
    public Citizens getBug()
    {
        return Citizens.getInstance();
    }

    @Bean(name="obama")
    public INSA getObserver()
    {
        return new NSAImpl(Citizens.getInstance(), "Obama");
    }

    @Bean(name="morse")
    public ICommunicate getTalker()
    {
        return new Morse();
    }

    @Bean(name="mom")
    public Parent GetParent()
    {
        return new Parent(Teacher.getInstance());
    }

    @Bean(name="teacher")
    public ITeacher getTeacher()
    {
        return Teacher.getInstance();
    }

    @Bean(name="contextClass")
    public Context getContext()
    {
        return new Context(new Texas());
    }

    @Bean(name="visitor")
    public NeighbourVisitor getVisitor()
    {
        return new NeighbourVisitorImpl();
    }

    @Bean(name="backNeighbour")
    public INeighbour getNeighbour()
    {
        return new BackNeighbour("George");
    }

    @Bean(name="babyList")
    public Babies getBabyList()
    {
        return new Babies();
    }

    @Bean(name="memento")
    public Task getTask()
    {
        return new Task();
    }

    @Bean(name="ctx")
    public za.ac.cput.kristen.week5.BehaviouralPatterns.InterpreterPattern.Context getCtx()
    {
        return new za.ac.cput.kristen.week5.BehaviouralPatterns.InterpreterPattern.Context("A");
    }
}
