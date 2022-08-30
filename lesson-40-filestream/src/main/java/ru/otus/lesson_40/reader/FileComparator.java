package ru.otus.lesson_40.reader;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileComparator {

    public boolean compareFiles(String path1, String path2) {
        return compareFiles(Paths.get(path1), Paths.get(path2));
    }

    public boolean compareFiles(Path file1, Path file2) {
        // TODO

        return compareByBody(file1, file2);
    }

    private boolean compareByBody(Path file1, Path file2) {
        // TODO
        return true;
    }
}
