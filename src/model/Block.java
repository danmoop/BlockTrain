package model;

import misc._Error;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

public class Block
{
    private String hash;
    private String previousHash;
    private String message;
    private String createdOn;
    private String fullMessage;
    private long time;

    public Block(String message)
    {
        if(Train.getTrain() == null) // If we haven't initialized Train in Main file
            new Train();

        Date now = new Date();
        this.message = message;

        if(Train.getTrain().size() == 0) // Our block is first in the list, there are no previous blocks
            this.previousHash = "none";
        else
            this.previousHash = Train.getTrain().get(Train.getTrain().size()-1).getHash();

        this.time = now.getTime(); // It gets milliseconds from 1970
        this.createdOn = String.valueOf(now);

        /*
            We add current time to out message to make it unique
            For example some phrase (e.g Hello world) won't be the same after being encrypted many times
            Besides message there is a time stamp
            e.g [Hello world - 1524324739553] (this number is milliseconds from 1970 to now)
            And message divided from timestamp using dash
         */

        this.fullMessage = message + " - " + time;


        try {
            this.hash = Encrypt.toSHA256(this.fullMessage);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        Train.addBlock(Block.this); // Add out block at the end of the train
    }

    /*

        Getters

    */

    public String getHash()
    {
        return hash;
    }

    public String getPreviousHash()
    {
        return previousHash;
    }

    public String getMessage()
    {
        return message;
    }

    public String getCreatedOn()
    {
        return createdOn;
    }

    public long getTime()
    {
        return time;
    }

    public String getFullMessage()
    {
        return fullMessage;
    }
}