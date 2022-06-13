package S04_StreamsFilesDirectories.lectures;

import java.io.*;
import java.util.Scanner;

public class WriteEveryThirdLine {

    public static void main(String[] args) throws IOException {

        String inPath = "D:\\IntelliJ\\StreamsFilesAndDirectories\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "D:\\IntelliJ\\StreamsFilesAndDirectories\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\05.WriteEveryThirdLineOutput.txt";

        Scanner in = new Scanner(new FileReader(inPath));
        PrintWriter out = new PrintWriter(new FileWriter(outPath));

        int counter = 1;
        String line = in.nextLine();
        while (in.hasNextLine()){
            if(counter % 3 == 0){
                out.println(line);
            }
            counter++;
            line = in.nextLine();
        }
        out.close();
    }
}
