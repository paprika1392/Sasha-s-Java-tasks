package org.example.ExceptionsTask;

import java.io.*;

public class FileReaderUntil {

    private static final String PATH = "C:/Users/Paprika/Desktop/JavaTask.txt";


    public static void readFile() throws IOException {
        BufferedReader reader= new BufferedReader(new FileReader(PATH));

        String line = reader.readLine();

        System.out.println("The file contain: " + line);
    }

}
