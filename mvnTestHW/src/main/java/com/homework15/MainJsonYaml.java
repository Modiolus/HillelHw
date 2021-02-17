package com.homework15;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;

import static com.homework15.ConversionJsonToYaml.conversionToYaml;
import static com.homework15.ConversionYamlToJson.conversionToJson;
import static com.homework15.CreateNewFileName.newFileName;
import static com.homework15.ShowInfo.showInfo;

public class MainJsonYaml {

    public static void main(String[] args) throws IOException {
        File dir;
        if (args.length == 0) {
            dir = new File(FileSystems.getDefault()
                    .getPath("")
                    .toAbsolutePath()
                    .toString());
        } else {
            dir = new File(args[0]);
        }
        System.out.println(dir);
        for (File files : dir.listFiles()) {
            getFileStructure(files);
        }
        File f = new File(String.valueOf(dir));  //D:\Projects\HW\mvnTestHW\src\main\resources
        String[] arrayOfFiles = f.list();

        File[] arrayFiles = f.listFiles();

        for (int i = 0; i < arrayFiles.length; i++) {

            long oldSize = arrayFiles[i].length();
            int indexOfPoint = arrayOfFiles[i].lastIndexOf(".");
            String fl = arrayOfFiles[i].substring(indexOfPoint + 1);

            if (fl.equals("json")) {

                long before = System.currentTimeMillis();
                String convertJsonToYaml = conversionToYaml(arrayFiles[i]);
                long after = System.currentTimeMillis();
                long timeForYaml = after - before;
                long newSize = convertJsonToYaml.length();

                String infoJsonToYaml = showInfo(arrayOfFiles[i],
                        newFileName(arrayOfFiles[i], "yaml"), timeForYaml, oldSize, newSize).toString();

                WriteResults.writeResults(infoJsonToYaml.concat(convertJsonToYaml), "result.txt");
                WriteResults.writeResults(convertJsonToYaml, newFileName(arrayOfFiles[i], "yaml"));

            } else if (fl.equals("yaml")) {
                long before = System.currentTimeMillis();
                String convertYamlToJson = conversionToJson(arrayFiles[i]);
                long after = System.currentTimeMillis();
                long timeForJson = after - before;
                long newSize = convertYamlToJson.length();

                String infoYamlToJson = showInfo(arrayOfFiles[i],
                        newFileName(arrayOfFiles[i], "json"), timeForJson, oldSize, newSize).toString();

                WriteResults.writeResults(infoYamlToJson.concat(convertYamlToJson), "result.txt");
                WriteResults.writeResults(convertYamlToJson, newFileName(arrayOfFiles[i], "json"));
            }
            else {
                WriteResults.writeResults(arrayFiles[i].getName()+ "--> Impossible to convert", "result.txt");

            }
        }
    }

    private static final String FILE = "[f] : ";
    private static final String DIR = "[D] : ";

    private static void getFileStructure(File file) {
        if (file.isFile()) {
            System.out.println(FILE.concat(file.getName()));
        } else {
            System.out.println(DIR.concat(file.getName()));
        }
    }
}
