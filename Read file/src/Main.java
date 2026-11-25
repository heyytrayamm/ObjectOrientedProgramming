import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //BufferedReader + FileReader is best for reading files line by line

        String filepath ="C:\\Users\\TRAYAM\\Test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String Line;
            while ((Line = reader.readLine()) != null) {
                System.out.println(Line);
            }
        }

        catch(FileNotFoundException e) {
            System.out.println("File not Found");
        }
        catch(IOException e) {
            System.out.println("Something went wrong");
        }
    }

}
