package Task_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckEmptyFile {
    public static void main(String[] args) {
        try {
            readFile("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);

        if (!file.exists()) {
            throw new FileNotFoundException("File " + fileName + " not found.");
        }

        Scanner scanner = new Scanner(file);

        if (!scanner.hasNext()) {
            scanner.close();
            throw new IllegalStateException("File " + fileName + " is empty.");
        }

        System.out.println("File contents:");
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}
