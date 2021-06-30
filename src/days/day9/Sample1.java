package days.day9;

import java.io.*;

public class Sample1 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("abc")) {
            // using file input stream
        } catch (FileNotFoundException e) {
            // Object creation throws file not found exception
        } catch (IOException e) {
            // close connection throws IO exception
        }
    }
}

class MyClosable implements AutoCloseable{

    @Override
    public void close() throws IOException {
        System.out.println("I am closed");
    }
}