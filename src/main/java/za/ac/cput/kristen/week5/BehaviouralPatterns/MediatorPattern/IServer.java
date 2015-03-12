package za.ac.cput.kristen.week5.BehaviouralPatterns.MediatorPattern;

/**
 * Created by kris on 3/10/15.
 */
public interface IServer
{
    void send(ClientImpl client, String words);
    void addClient(ClientImpl client);
}
