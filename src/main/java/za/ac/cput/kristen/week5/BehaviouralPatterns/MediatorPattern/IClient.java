package za.ac.cput.kristen.week5.BehaviouralPatterns.MediatorPattern;

/**
 * Created by kris on 3/10/15.
 */
public interface IClient
{
    void send(String words);
    IServer getServer();
    void receive(String words);
    String getReceived();
}
