package com.google.hashcode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    // java.io.InputStream
    List<String> lines = fileToStrings("/home/gcalbi/workspace/googlehashcode2020/src/main/resources/a_example.txt");
  }

  private static  List<String> fileToStrings(String filePath) {
    List<String> lines = new ArrayList<>();
    InputStream inputStream = null;
    try {
      File file = new File(App.class.getClassLoader().getResource(filePath).getFile());

      inputStream = new FileInputStream(file);

      try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
        String line;
        while ((line = br.readLine()) != null) {
          lines.add(line);
        }
        return lines;
      } catch (IOException e) {
        e.printStackTrace();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      if (inputStream != null) {
        try {
          inputStream.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return null;
  }
}
