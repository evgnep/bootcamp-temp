package ru.otus.lesson_40.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Comparer {

    public void printMatches(String path1, String path2) {
        compareDirectories(Paths.get(path1), Paths.get(path2));
    }

    private void compareDirectories(Path dir1, Path dir2) {

        // TODO
    }

    private boolean compareFiles(Path file1, Path file2) {
        // TODO
        return false;
    }
}
