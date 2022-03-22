import java.util.Scanner;

import java.io.*;
public class Files {
    public static void main(String[] args) {
        Scanner infile;

        try {
            infile = new Scanner(new File("input.txt"));
            while (infile.hasNext()) {
                System.out.println(infile.nextLine());
            }    
            infile.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
