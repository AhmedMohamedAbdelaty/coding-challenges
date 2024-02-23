import java.util.Scanner;

public class App {
    static Scanner scanner;
    static int lineNumber = 1;
    public static void main(String[] args)
    {
        if (args.length == 0 || args[0].equals("-")) {
            scanner = new Scanner(System.in);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } else {
            if ((args.length == 1) && (args[0].equals("-n") || args[0].equals("-b"))) {
                scanner = new Scanner(System.in);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (args[0].equals("-n")) {
                        System.out.println(lineNumber + " " + line);
                        lineNumber++;
                    } else {
                        if (!line.equals("")) {
                            System.out.println(lineNumber + " " + line);
                            lineNumber++;
                        } else {
                            System.out.println(line);
                        }
                    }
                }
            } else if (args[0].equals("-n")) {
                for (int i = 1; i < args.length; i++) {
                    fileOperations file = new fileOperations(args[i]);
                    file.printFileN();
                }
            } else if (args[0].equals("-b")) {
                for (int i = 1; i < args.length; i++) {
                    fileOperations file = new fileOperations(args[i]);
                    file.readFileB();
                }
            } else {
                for (int i = 0; i < args.length; i++) {
                    fileOperations file = new fileOperations(args[i]);
                    file.printFile();
                }
            }
        }
    }
}