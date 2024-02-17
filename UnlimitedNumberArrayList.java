import java.util.Arrays;

//Johann Jaramillo (jjaramillo26@toromail.csudh.edu)
public class UnlimitedNumberArrayList {
    int [] myArray;

    public UnlimitedNumberArrayList(int size){
        myArray = new int[size];    //init our array
    }
    public int get(int index){
        return myArray[index];  //return value
    }

    public int add(int newNum){ //add a new value to array and return its index
        int indexOfNew=0;
        arrayProcess:
        for(int index=0;index< myArray.length;index++){

            if(myArray[index]==0){
                myArray[index] = newNum;
                indexOfNew= index;
               // break arrayProcess;
            }
            else{
                int[] tempArr = new int[myArray.length+1];

                for(int x=0; x<myArray.length;x++){
                    tempArr[x] = myArray[x];
                }
                tempArr[myArray.length] = newNum;
                indexOfNew = tempArr.length;
                myArray = tempArr.clone();
            }
        }
        return indexOfNew;
    }

    public int size(){ //return num of elems in my array
        return myArray.length-1;
    }

    public int[] find(int number){
        int[] indicesOfNumbersFound = new int[myArray.length-1];
        int indOfNumFoundArr = 0;
        for (int ind: myArray){
            if (ind == number){
                indicesOfNumbersFound[indOfNumFoundArr] = ind;
                indOfNumFoundArr++;
            }
        }
        return indicesOfNumbersFound;
    }

    public int getLargest(){
        int largestNum=0;
        for(int ind: myArray){
            if(ind ==0){
                largestNum = ind ;
            }
            else{
                if(ind>largestNum){
                    largestNum = ind;
                }
            }
        }
        if(myArray.length!=0){
            return largestNum; }
        else{return -1;}    }

    public int getSmallest(){
        int smallestNum;
        if(myArray.length!=0){
            smallestNum = myArray[0];
            for(int ind: myArray){
                if(ind<smallestNum){
                    smallestNum = ind;
                } }
            return smallestNum;
        }
        return -1 ;
    }

    public int getAverage(){
        float total = 0;
        for(int ind : myArray){
            total += ind;
        }
        if (myArray.length!=0){
            return (int)total/(myArray.length); }
        else {return -1;}
    }
    @Override
    public String toString() {

        return Arrays.toString(myArray);
    }
}