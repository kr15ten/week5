package za.ac.cput.kristen.week5.BehaviouralPatterns.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kris on 3/10/15.
 */
public class Server implements IServer
{
    private static Server server = null;
    private static List<ClientImpl> clients = new ArrayList<ClientImpl>();

    private Server()
    {

    }

    public static Server getInstance()
    {
        if (server == null)
        {
            server = new Server();
            clients = new ArrayList<ClientImpl>();
        }

        return server;
    }

    @Override
    public void send(ClientImpl client, String words)
    {
        for (int a = 0; a < clients.size(); a++)
        {
            if (clients.get(a) != client)
            {
                clients.get(a).receive(words);
            }
        }
    }

    @Override
    public void addClient(ClientImpl client)
    {
        clients.add(client);
    }
}
