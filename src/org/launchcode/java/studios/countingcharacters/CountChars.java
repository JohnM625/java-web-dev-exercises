package org.launchcode.java.studios.countingcharacters;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.io.IOException;
import java.util.Map;

public class CountChars {
    public static void main(String[] args) throws IOException {
        Path path = FileSystems.getDefault().getPath("quote.txt");
        String quote = Files.readString(path);
        HashMap<Character, Integer> charCounts = new HashMap<>();
            for (char c: quote.toLowerCase().toCharArray()) {
                if (c < 'a' || c > 'z') {
                    continue;
                }
                charCounts.putIfAbsent(c,0);
                charCounts.put(c, charCounts.get(c) + 1);
            }
        for (Map.Entry<Character, Integer> entry: charCounts.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
             }
        }

    }
