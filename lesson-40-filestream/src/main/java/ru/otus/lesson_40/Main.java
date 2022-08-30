package ru.otus.lesson_40;

import ru.otus.lesson_40.writer.Copier;

public class Main {
    public static void main(String[] args) {
//        FilePrinter printer= new FilePrinter();
//        printer.lookupPrint("resources/dir1");

//        Comparer comparer = new Comparer();
//        comparer.printMatches("resources/dir1", "resources/dir2");

//        FileComparator comparator = new FileComparator();
//        comparator.compareFiles("resources/dir2/testfile5.txt", "resources/dir2/testfile6.txt");

        Copier copier = new Copier();
        copier.copyFile("resources/file_source.txt", "resources/file_destination.txt");
//        copier.smartCopy("resources/file_source.txt", "resources/file_destination.txt");
    }
}
