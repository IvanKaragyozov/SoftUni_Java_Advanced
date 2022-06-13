package S04_StreamsFilesDirectories.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines {

    public static void main(String[] args) throws IOException {

        String path = "D:\\IntelliJ\\StreamsFilesAndDirectories\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> allLines = Files.readAllLines(Path.of(path));

        /*
        for (String line : allLines) {
            int sum = 0;
            for (int index = 0; index < line.length(); index++) {
                char currentSymbol = line.charAt(index);
                sum = sum + currentSymbol;
            }
            System.out.println(sum);
        }
         */

        allLines.stream()
                .map(line -> line.toCharArray())
                .forEach(arr -> {
                    int sum = 0;
                    for(char symbol : arr) sum += symbol;
                    System.out.println(sum);
                } );

    }
}
