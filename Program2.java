import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {
 
    public static void main(String[] args) {
        
        try(BufferedReader reader = new BufferedReader(new FileReader("name.txt"));
        FileWriter writer = new FileWriter("log.txt"))
            
        {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                writer.write("Ученик "+words[0]+" получил сегодня "+words[1]);
                writer.append('\n');

            }
        }            
            
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }   
    } 
}