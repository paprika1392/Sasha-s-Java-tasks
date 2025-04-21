package org.example.ExceptionsTask;

import java.io.*;

public class FileReaderUntil {

    public static void readFile(String path) throws IOException {
        BufferedReader reader= new BufferedReader(new FileReader(path));

        String line = reader.readLine();

        System.out.println("The file contain: " + line);
    }

}
