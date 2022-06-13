package S04_StreamsFilesDirectories.lectures;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {

    public static void main(String[] args) throws IOException {

        String pathIn = "D:\\IntelliJ\\StreamsFilesAndDirectories\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "D:\\IntelliJ\\StreamsFilesAndDirectories\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\03.CopyBytesOutput.txt";

        FileInputStream in   = new FileInputStream(pathIn);
        FileOutputStream out = new FileOutputStream(pathOut);
        int oneByte = in.read();
        while (oneByte >= 0){

            // 32 == ASCII code of "space"
            // 10 == ASCII code of "new line"
            if(oneByte == 32 || oneByte == 10) out.write(oneByte);
            else {
                String digits = String.valueOf(oneByte);
                for (int i = 0; i < digits.length(); i++) {
                    out.write(digits.charAt(i));
                }
            }

            oneByte = in.read();
        }

    }
}
