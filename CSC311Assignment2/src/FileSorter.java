//Johann Jaramillo (jjaramillo26@toromail.csudh.edu)
import java.io.*;
import java.util.Scanner;
public class FileSorter {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the name of your input File: "); //Create text ui
        String inpFileName = scan.nextLine();  //take in input File Name
        System.out.println("Please enter the name of your output File: "); //Create text ui
        String outFileName = scan.nextLine();  //take in output File Name

        NumberFileReader fReader = new NumberFileReader(inpFileName);
        int [] arrFromFile = fReader.read();        //read array from file

        BubbleSort sorter = new BubbleSort(arrFromFile);


        NumberFileWriter fWriter = new NumberFileWriter(outFileName);
        fWriter.write(sorter.sortAsc()); //write to file
        fWriter.write(sorter.sortDesc());
    }
}
