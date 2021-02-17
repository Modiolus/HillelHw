package com.homework15;

public class CreateNewFileName {
    public static String newFileName(String oldName, String newExtension) {
        int indexOfPoint = oldName.lastIndexOf(".");
        String newName = oldName.substring(0, indexOfPoint + 1).concat(newExtension);
        return newName;
    }
}
