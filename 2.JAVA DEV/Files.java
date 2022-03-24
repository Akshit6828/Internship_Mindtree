import java.util.Scanner;
import java.io.*;
public class Files {
    public static void main(String[] args) {
        Scanner infile;
        PrintWriter outFile;

        try {
            infile = new Scanner(new File("input.txt"));
            outFile = new PrintWriter("output.txt");
            while (infile.hasNext()) {
                int num = infile.nextInt();
                outFile.println(num);
            }    
            infile.close();
            outFile.close();
        } catch (Exception e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
