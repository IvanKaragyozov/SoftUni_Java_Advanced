package S04_StreamsFilesDirectories.lectures;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {

    public static void main(String[] args) throws FileNotFoundException {

        String inPath = "D:\\IntelliJ\\StreamsFilesAndDirectories\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "D:\\IntelliJ\\StreamsFilesAndDirectories\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\04.ExtractIntegersOutput.txt";

        Scanner scanner = new Scanner(new FileInputStream(inPath));
        PrintWriter myFileOutput = new PrintWriter(new FileOutputStream(outPath));

        while (scanner.hasNext()){
            if(scanner.hasNextInt()){
                int myNumber = scanner.nextInt();
                // System.out.println(myNumber);
                myFileOutput.println(myNumber);
            }
            scanner.next();
        }
        myFileOutput.close();
    }
}
