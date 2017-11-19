// Java program to illustrate creation of Object
// using Deserialization.
import java.io.*;
 
public class DeserializationExample
{
    public static void main(String[] args)
    {
        try
        {
            DeserializationExample d;
            FileInputStream f = new FileInputStream("file.txt");
            ObjectOutputStream oos = new ObjectOutputStream(f);
            d = (DeserializationExample)oos.readObject();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(d.name);
    }
}