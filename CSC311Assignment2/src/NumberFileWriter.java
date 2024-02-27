//Johann Jaramillo (jjaramillo26@toromail.csudh.edu)
import java.io.*;

public class NumberFileWriter {
    public PrintWriter pw;

    public NumberFileWriter(String fileName) throws IOException {
        File file = new File(fileName);
        if(file.exists()) {
            pw = new PrintWriter(new FileWriter(file,true));
        }
        else{
            pw = new PrintWriter(file);
        }
    }

    public void write(int []arrayOfNumbers) {//will write content of the array to a file, one value per line

        pw.print("{ ");
        for(int nums: arrayOfNumbers){
            pw.print(nums+", ");
        }
        pw.println("}");
        pw.flush();
    }

}
