package lec07;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.nio.BufferUnderflowException;

public class MainJava {
    public static void main(String[] args) throws IOException {
        MainJava mainJava = new MainJava();
        mainJava.readFile();
    }

    private int parseIntOrThrow(@NotNull String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("주어진 %s는 숫자가 아닙니다", str));
        }
    }

    private Integer parseIntOrThrowV2(@NotNull String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public void readFile() throws IOException {
        File currentFile = new File(".");
        File file = new File(currentFile.getAbsoluteFile() + "/a.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        System.out.println(reader.readLine());
        reader.close();
    }

    public void readFileWithPath(String path) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            System.out.println(reader.readLine());
        }
    }
}


