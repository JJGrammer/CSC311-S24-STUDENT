//Johann Jaramillo (jjaramillo26@toromail.csudh.edu)
public class BubbleSort {
    int[] myArray;
    int cycleCount=0;
    int tempVal;
    public BubbleSort(int[] intArr){
        myArray = intArr;
    }

    public int[] sortAsc (){
        cycleCount=0; //reset count
        for(int index=0; index< myArray.length;index++) {
         if(index!=myArray.length-1){
            if(myArray[index]>myArray[index+1]) {
                tempVal = myArray[index];
                myArray[index] = myArray[index + 1];
                myArray[index + 1] = tempVal;
                index=-1;
                cycleCount++;
            }
          }
        }
        return myArray;
    }    //will return the array sorted in Ascending order

    public int[]  sortDesc(){
        cycleCount=0;
        for(int index=0; index< myArray.length;index++) {
            if(index!=myArray.length-1){
                if(myArray[index]< myArray[index+1]) {
                    tempVal = myArray[index];
                    myArray[index] = myArray[index + 1];
                    myArray[index + 1] = tempVal;
                    index=-1;
                    cycleCount++;
                }
            }
        }
        return myArray;
    }    //will return the array sorted in Descending order

    public  int loopCycles(){
        return cycleCount;
    } // How many loop cycles did it take to sort run the previous sort operation?
}