package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferuse {
    public static void getInputsBufferString() throws IOException {
        // Enter data using BufferReader
        BufferedReader r = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Enter the input(String):");
        // Reading data using readLine
        String s = r.readLine();

        // Printing the read line
        System.out.println("The given input:" + s);
    }

    public void getInputsBufferchar() throws IOException {
        // Enter data using BufferReader
        BufferedReader r = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Enter the input(Integer):");
        // Reading data using readLine
        char n = (char) r.read();

        // Printing the read line
        System.out.println("The given input(char):" + n);
    }

    public static void main(String[] args) throws IOException {
        getInputsBufferString();

        Bufferuse obj = new Bufferuse();
        obj.getInputsBufferchar();

    }
}
