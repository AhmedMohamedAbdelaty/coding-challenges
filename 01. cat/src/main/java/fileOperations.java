import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileOperations {
    private static int lineNumber = 1;
    private String filePath = "";
    private File file = null;

    fileOperations(String filePath)
    {
        this.filePath = filePath;
        file = new File(filePath);
    }

    void printFile()
    {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("cat: " + filePath + ": No such file or directory");
        }
    }

    void printFileN()
    {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(lineNumber + " " + scanner.nextLine());
                lineNumber++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("cat: " + filePath + ": No such file or directory");
        }
    }

    void readFileB()
    {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!line.equals("")) {
                    System.out.println(lineNumber + " " + line);
                    lineNumber++;
                } else {
                    System.out.println(line);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("cat: " + filePath + ": No such file or directory");
        }
    }
}