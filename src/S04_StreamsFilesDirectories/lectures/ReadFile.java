package S04_StreamsFilesDirectories.lectures;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {

        String path = "D:\\IntelliJ\\StreamsFilesAndDirectories\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try(FileInputStream filesStream = new FileInputStream(path)) {
            int oneByte = filesStream.read();
            while (oneByte >= 0){
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = filesStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
