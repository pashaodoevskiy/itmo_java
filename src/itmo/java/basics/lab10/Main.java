package itmo.java.basics.lab10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(String.join("\n", readFile("files/exercise1/text.txt")));

        writeFile("files/exercise2/text.txt", "Lorem ipsum dolor sit amet");

        mergeFiles(
                "files/exercise3/text.txt",
                "files/exercise3/read/text1.txt", "files/exercise3/read/text2.txt", "files/exercise3/read/text3.txt"
        );

        replaceInFile("files/exercise4/text.txt", "[^A-Za-zА-Яа-я0-9]", "\\$");
    }

    public static List<String> readFile(String path) {
        String line;
        List<String> result = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return result;
    }

    public static void writeFile(String path, String content) {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(path))) {
            br.write(content);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void mergeFiles(String newFilePath, String ...filePaths) {
        List<String> fileContents = new ArrayList<>();

        for (String path : filePaths) {
            fileContents.addAll(readFile(path));
        }

        writeFile(newFilePath, String.join("\n", fileContents));
    }

    public static void replaceInFile(String path, String regex, String newContent) {
        List<String> fileContents = new ArrayList<>();
        List<String> input = readFile(path);

        for (String line : input) {
            System.out.println(line);
            fileContents.add(line.replaceAll(regex, newContent));
        }

        writeFile(path, String.join("\n", fileContents));
    }
}
