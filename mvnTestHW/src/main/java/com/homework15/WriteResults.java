package com.homework15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;

public class WriteResults {
    public static void writeResults(String st, String fileName) throws IOException {
        File appDirectory = new File(FileSystems.getDefault()
                .getPath("")
                .toAbsolutePath()
                .toString()+ "\\converted");
        appDirectory.mkdir();

        File dirFile = new File(appDirectory, fileName);

        FileWriter writer = new FileWriter(dirFile, true);
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        bufferWriter.write(st);
        writer.append("\n");
        bufferWriter.close();


    }
}
