package com.homework15;

import com.google.gson.Gson;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.util.Map;

public class ConversionJsonToYaml {
    public static String conversionToYaml(File path) {
        String json = ReadFromFile.readToString(String.valueOf(path));
        Gson gson = new Gson();
        Map map = gson.fromJson(json, Map.class);
        Yaml yaml = new Yaml();
        return yaml.dump(map);
    }
}
