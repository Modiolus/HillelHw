package hillel.homework14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WriteAndTime {
int a;
    public static void write (String st) throws IOException {
        File appDirectory = new File(FileSystems.getDefault()
                .getPath("")
                .toAbsolutePath()
                .toString() + "\\gameResult");
        appDirectory.mkdir();

        File dirFile = new File(appDirectory, "results.txt");

        FileWriter writer = new FileWriter(dirFile, true);
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        bufferWriter.write(st);
        //  writer.append("\n");
        bufferWriter.close();
    }


    public static String time(String s) {
        LocalDateTime ldt = LocalDateTime.now();
        String str = s + ldt.format(DateTimeFormatter.ofPattern("dd.MM.yy" + "\nHH:mm:ss"));  //"\nДата и время: " +
        return str;
    }
}
