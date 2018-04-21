import misc.Log;
import model.Block;
import model.Train;

public class Main
{
    public static void main(String[] args)
    {
        Block myBlock = new Block("Hello there");
        Block myBlock2 = new Block("Hello to you");
        Block myBlock3 = new Block("Hello");

        for(int i = 0; i < Train.getTrain().size(); i++)
        {
            new Log(i + 1 + " : MESSAGE : " + Train.getTrain().get(i).getMessage());
            new Log(i + 1 + " : FULL MESSAGE : " + Train.getTrain().get(i).getFullMessage());
            new Log(i + 1 + " : HASH : " + Train.getTrain().get(i).getHash());
            new Log(i + 1 + " : PREV HASH : " + Train.getTrain().get(i).getPreviousHash());
            new Log("---------------------------------------------------------------------------------");
        }

        new Log(Train.getTrain());
    }
}