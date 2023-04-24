package com.learntocode;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Goldilocks.txt");
            Scanner scanner = new Scanner(fis);
            StringBuilder stringBuilder = new StringBuilder();

            int lineNumber = 1;

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                stringBuilder.append(lineNumber).append(" : ").append(line).append("\n");
                lineNumber++;
            }
            scanner.close();
            String modifiedText = stringBuilder.toString();
            System.out.println(modifiedText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
