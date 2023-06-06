package tad.FilaException;

public class ListaVazia  extends Exception
{
    // parameterized constructor that accepts only detail message
    public ListaVazia (String message)
    {
        // calling parent Exception class constructor
        super(message);
    }
}
