package S04_StreamsFilesDirectories.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SymBytes {

    public static void main(String[] args) throws IOException {

        String path = "D:\\IntelliJ\\StreamsFilesAndDirectories\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        long sum = 0;

        BufferedReader br = new BufferedReader(new FileReader(path));

        String line = br.readLine();

        /*
        while (line != null){

            for (int index = 0; index < line.length(); index++) {
                char currentSymbol = line.charAt(index);
                sum = sum + currentSymbol;
            }

            line = br.readLine();
        }
        System.out.println(sum);
         */

        byte[] allBytes = Files.readAllBytes(Path.of(path));

        for(byte ascii : allBytes){

            // 10 == new line \n; 13 == return \r
            if(ascii != 10 && ascii != 13){
                sum += ascii;
            }
        }
        System.out.println(sum);
    }

}
