package ru.otus.lesson_40.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilePrinter {
    public void lookupPrint(String path) {
        print(Paths.get(path));
    }

    private void print(Path path) {
        // TODO
    }

    private void printFileName(Path file) {
        System.out.println(file.toAbsolutePath());
    }
}
