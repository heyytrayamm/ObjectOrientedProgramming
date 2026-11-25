import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String filepath = "C:\\Users\\TRAYAM\\Test.txt";
        String text = """
                i love pizza
                it's delicious
                buy me a pizza
                 :)
                """;
        try(FileWriter writer = new FileWriter(filepath)){
            writer.write(text);
            System.out.println("File is written");
        } catch(FileNotFoundException e) {
            System.out.println("File location isn't found!!");
        } catch(IOException e){
            System.out.println("File isn't written !");
        }

    }
}
