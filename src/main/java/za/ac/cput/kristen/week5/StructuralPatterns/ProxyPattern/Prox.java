package za.ac.cput.kristen.week5.StructuralPatterns.ProxyPattern;

/**
 * Created by kris on 3/9/15.
 */
public class Prox implements IServer
{
    private Server server = new Server();

    @Override
    public String request(String something) {
        return server.request(something);
    }
}
