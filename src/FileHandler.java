import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
public class FileHandler {

    public static ArrayList<String> readWholeFile(String fileName) {


        ArrayList<String> allLines = new ArrayList<>();
        String nextLine;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            nextLine = br.readLine();
            nextLine = br.readLine();
            while (nextLine != null) {
                allLines.add(nextLine);
                nextLine = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return allLines;
    }

    public static void writeLine(String fileName, String text, boolean append) {


        try (PrintWriter pr = new PrintWriter(new FileWriter(fileName, append))) {
            pr.println(text);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}



