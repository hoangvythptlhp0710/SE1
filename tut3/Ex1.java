package tut3;

import java.io.*;

public class Ex1 {
    private String filePath = "/home/sheepy/Documents/Learning/school/se1/tut3/docs/text.txt";
    private String newFilePath = "/home/sheepy/Documents/Learning/school/se1/tut3/docs/newText.txt";

    public void handlingFromFile() {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFilePath))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                bufferedWriter.write(line.replaceAll(" ", ""));
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readingNewFile() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(newFilePath))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        ex1.handlingFromFile();
        ex1.readingNewFile();
    }
}
