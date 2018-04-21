package misc;

public class Error
{
    public Error(String error)
    {
        throw new java.lang.Error(error);
    }
}