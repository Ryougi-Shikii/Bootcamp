import java.io.FileWriter;
import java.io.FileReader;

public class ReadWrite{
    public static void main(String[] args){
        FileWriter Writer = new FileWriter("myfile.txt");

        Writer.write("Files in Java are seriously good!!");
        Writer.close();
        
        System.out.println("Successfully written.");
    }
}