package com.homework15;

public class ShowInfo {
    public static StringBuilder showInfo(String oldName, String newName, Long time, long oldSize, long newSize) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nOld name: " + oldName)
                .append("\nNew name: " + " --> " + newName)
                .append("\nConversion time: " + time)
                .append("\nOld size: " + oldSize)
                .append("\nNew size: " + " --> " + newSize + "\n");
        return stringBuilder;
    }
}
