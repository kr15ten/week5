package za.ac.cput.kristen.week5.BehaviouralPatterns.MediatorPattern;

/**
 * Created by kris on 3/10/15.
 */
public class ClientImpl implements IClient
{
    private IServer serv;
    private String name, received;

    public ClientImpl(IServer serv, String name)
    {
        this.serv = serv;
        this.name = name;
    }

    @Override
    public void send(String words)
    {
        serv.send(this, words);
    }

    @Override
    public IServer getServer() {
        return serv;
    }

    @Override
    public void receive(String words)
    {
        received = "Received: " + words;
    }

    @Override
    public String getReceived()
    {
        return received;
    }
}
