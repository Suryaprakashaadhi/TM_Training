package Task_3;

import java.io.File;
import java.util.Scanner;

public class CalculateFileSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            long fileSize = file.length();
            System.out.println("File Size: " + fileSize + " bytes");
            System.out.println("File Size: " + (fileSize / 1024.0) + " KB");
            System.out.println("File Size: " + (fileSize / (1024.0 * 1024)) + " MB");
        } else {
            System.out.println("File does not exist.");
        }
        scanner.close();
    }
}
