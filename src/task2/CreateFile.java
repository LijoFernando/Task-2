package task2;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class CreateFile {
    public void fileCreation() throws IOException {
        Scanner input = new Scanner(System.in);
        String stringData = "Programmatically created files \nThese words were written programmatically \nAll is Well. Be happy & enjoy the moment";
        byte[] data = stringData.getBytes();
        System.out.println("Enter File Name");
        String filename=input.nextLine();
        File filepath =new File(filename);
        if(filepath.exists()){
            throw new FileAlreadyExistsException("\nFilename Already Exist: "+filename);
        }
        try (FileOutputStream fileStream = new FileOutputStream(filepath);){
            fileStream.write(data, 0, data.length);
        }



    }

}
