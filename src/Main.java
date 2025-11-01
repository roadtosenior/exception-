import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("example.txt");
        System.out.println("Hello, World!");
        try {
            readFile(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    static void readFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        if(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }

}