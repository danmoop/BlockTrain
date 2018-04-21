package model;

import java.util.ArrayList;
import java.util.List;

public class Train
{
    private static List<Block> D8train;

    public Train()
    {
        D8train = new ArrayList<>();
    }

    public static List<Block> getTrain()
    {
        return D8train;
    }

    public static void addBlock(Block block)
    {
        D8train.add(block);
    }
}