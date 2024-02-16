import java.sql.Array;
import java.util.Arrays;

public class NumberArrayList {
    int [] myArray;
    public NumberArrayList(int size){
         myArray = new int[size];    //init our array
    }
    public int get(int index){
        return myArray[index];  //return value
    }

    public int add(int newNum){ //add a new value to array and return its index
        int indexOfNew=0;
       for(int x: myArray){
           if(myArray[x]==0){
               myArray[x] = newNum;
               indexOfNew =  x;
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
            if (myArray[ind] == number){
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
                largestNum = myArray[ind] ;
            }
            else{
                if(myArray[ind]>largestNum){
                    largestNum = myArray[ind];
                }
            }
        }
        if(myArray.length!=0){
            return largestNum; }
        else{return -1;}    }

    public int getSmallest(){
        int smallestNum=0;
        for(int ind: myArray){
            if(ind ==0){
                smallestNum = myArray[ind] ;
            }
            else{
                if(myArray[ind]<smallestNum){
                    smallestNum = myArray[ind];
                }
            }
        }
        if(myArray.length==0){
        return smallestNum; }
        else{return -1;}
    }

    public int getAverage(){
        int total = 0;
        for(int ind : myArray){
            total += myArray[ind];
        }
        if (myArray.length!=0){
        return total/(myArray.length-1); }
        else {return -1;}
    }
    @Override
    public String toString() {
        String arrString = "";
        for( int index: myArray){
            arrString.concat(myArray[index]+", ");
        }
        return arrString;
    }
}