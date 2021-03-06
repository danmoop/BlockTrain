import misc.Log;
import model.Block;
import model.Train;

public class Main
{
    public static void main(String[] args)
    {

        String[] names = {"John", "Ben", "Dan", "Anna", "Rickie", "Michael", "Franklin", "Trevor", "Amanda"};

        for(int q = 0; q < 5; q++)
        {
            new Block("Hello, " + names[(int) Math.floor(Math.random() * names.length)]);
        }

        for(int i = 0; i < Train.getTrain().size(); i++)
        {
            new Log(i + 1 + " : MESSAGE : " + Train.getTrain().get(i).getMessage());
            new Log(i + 1 + " : FULL MESSAGE : " + Train.getTrain().get(i).getFullMessage());
            new Log(i + 1 + " : HASH : " + Train.getTrain().get(i).getHash());
            new Log(i + 1 + " : PREV HASH : " + Train.getTrain().get(i).getPreviousHash());
            new Log("---------------------------------------------------------------------------------");
        }

        new Log(Train.getTrain());

        new Log(Train.isChainValid());
    }
}