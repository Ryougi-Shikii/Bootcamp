import java.io.File;
import java.io.IOException;

public class fileCreation{
    public static void main(String[] args){
        try{
            File obj = new File("myfile.txt");
            if (obj.createNewFile()){
                System.out.println("File Created: " + obj.getName());
            }
            else{ System.out.println("File already exist!"); }
        }
        catch (IOException ioe){
            System.out.println(ioe);
        }
    }
}