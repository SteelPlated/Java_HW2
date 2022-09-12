import java.io.*;
public class Program 
{
 
    public static void main(String[] args) {
        
        try(FileWriter writer = new FileWriter("notes.txt", false))
        {
            int count=0;
            while (count<50) {
                String text = "test";
                writer.write(text);
                String result = text.toUpperCase();
                writer.write(result);
                writer.flush();
                count++;
            }
            
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    } 
}