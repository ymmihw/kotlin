package com.ymmihw.kotlin;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {
  public void writeList() throws IOException {
    File file = new File("E://file.txt");
    FileReader fr = new FileReader(file);
    fr.close();
  }
}
