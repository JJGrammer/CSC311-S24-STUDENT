//Johann Jaramillo (jjaramillo26@toromail.csudh.edu)
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberFileReader {
    File myFile;
    Scanner sc;
    Scanner scan;
    private int[] numbersFromFile;
    public NumberFileReader(String fileName) throws FileNotFoundException{
        myFile = new File(fileName);
        sc = new Scanner(myFile); //to determine array size
        scan = new Scanner(myFile);// for use to read
        int lengthOfFileNumbers=0;
        while (sc.hasNext()){
            lengthOfFileNumbers++;
            sc.nextLine();
        }
        numbersFromFile = new int[lengthOfFileNumbers];
    }


    public int[] read()   {//will return the array of numbers read from the file

        for (int index = 0; index< numbersFromFile.length;index++){
            numbersFromFile[index] = scan.nextInt();
        }
        scan.close();
        return numbersFromFile;
    }
}
