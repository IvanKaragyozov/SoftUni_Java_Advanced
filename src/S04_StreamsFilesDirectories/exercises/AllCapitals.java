package S04_StreamsFilesDirectories.exercises;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AllCapitals {

    public static void main(String[] args) throws IOException {

        String path = "D:\\IntelliJ\\StreamsFilesAndDirectories\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        List<String> allLines = Files.readAllLines(Path.of(path));

        // 1
        for(String line : allLines){
            writer.write(line.toUpperCase());
            writer.newLine();
        }
        writer.close();

        // 2
        /*
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = reader.readLine();
        while (line != null){
            writer.write((line.toUpperCase()));
            writer.newLine();

            line = reader.readLine();
        }
        writer.close();
         */

    }
}
