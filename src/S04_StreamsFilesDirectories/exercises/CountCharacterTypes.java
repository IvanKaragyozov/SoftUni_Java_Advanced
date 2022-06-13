package S04_StreamsFilesDirectories.exercises;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CountCharacterTypes {

    public static void main(String[] args) throws IOException {

        String path = "D:\\IntelliJ\\SoftUniJavaAdvanced\\src\\S04_StreamsFilesDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";
        List<String> allLines = Files.readAllLines(Path.of(path));

        int vowelsCount = 0; // number of vowels
        int punctCount = 0; // number of punctuation symbols
        int consonantsCount = 0; // number of consonants

        for(String line : allLines){


            for (int index = 0; index < line.length(); index++) {
                char currentSymbol = line.charAt(index);

                if(currentSymbol == 'a' || currentSymbol == 'o' || currentSymbol == 'i'
                        || currentSymbol == 'e' || currentSymbol == 'u'){
                    vowelsCount++;
                }
                else if(currentSymbol == '?' || currentSymbol == '!' || currentSymbol == '.'||
                        currentSymbol == ','){
                    punctCount++;
                }
                else consonantsCount++;

            }
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter("output_task_4.txt"));
        writer.write("Vowels: " + vowelsCount);
        writer.newLine();
        writer.write("Consonants: " + consonantsCount);
        writer.newLine();
        writer.write("Punctuation: " + punctCount);
        writer.close();

    }
}
