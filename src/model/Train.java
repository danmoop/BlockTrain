package model;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
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

    public static boolean isChainValid()
    {
        Block currentBlock;
        Block previousBlock;

        for(int i = 1; i < D8train.size(); i++)
        {
            currentBlock = D8train.get(i);
            previousBlock = D8train.get(i-1);

            try {
                if(!currentBlock.getHash().equals(Encrypt.toSHA256(currentBlock.getFullMessage())))
                    return false;
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }

            try {
                if(!previousBlock.getHash().equals(Encrypt.toSHA256(previousBlock.getFullMessage())))
                    return false;
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }

        return true;
    }
}