import java.io.*;
public class FileHandlingCount {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int lines = 0, words = 0, chars = 0;
        String line;
        while ((line = br.readLine()) != null) {
            lines++;
            words += line.trim().isEmpty() ? 0 : line.trim().split("\\s+").length;
            chars += line.length();
        }
        br.close();
        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + chars);
    }
}
