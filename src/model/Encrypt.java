package model;

import misc.Log;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrypt
{
    public static String toSHA256(String message) throws UnsupportedEncodingException, NoSuchAlgorithmException {

        MessageDigest mg = MessageDigest.getInstance("SHA-256");

        byte[] hash = mg.digest(message.getBytes("UTF-8"));
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }

        return hexString.toString();
    }

    public static String toMD5(String message) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        MessageDigest mg = MessageDigest.getInstance("MD5");

        byte[] hash = mg.digest(message.getBytes("UTF-8"));
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }

        return hexString.toString();
    }
}