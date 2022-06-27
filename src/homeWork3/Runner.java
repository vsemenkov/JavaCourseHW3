package homeWork3;

import homeWork3.exeptions.InvalidArgumentException;
import homeWork3.square.Rectangle;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Runner {
    public static void main(String[] args){

        try{
            System.out.println("Try 1");
            var rectangle = new Rectangle(-1,-3);
            System.out.println("Try 1");
        } catch (InvalidArgumentException exception){
            System.out.println("GOT EXCEPTION");
            exception.printStackTrace();
        } catch (IllegalArgumentException exception) {
            System.out.println("GOT EXCEPTION 2");
            exception.printStackTrace();
        } finally {
            System.out.println("Block coda srabotaet v lubom sluchae");
        }
        System.out.println("Hello WORLD");


    try (var reader1 = new FileReader("file.txt")){
        reader1.read();
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    }
}

