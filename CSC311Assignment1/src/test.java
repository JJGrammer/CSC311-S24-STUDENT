public class test {
    public static void main(String[] args){
        UnlimitedNumberArrayList myArrayList = new UnlimitedNumberArrayList(5);
        myArrayList.add(20);
        myArrayList.add(7);
        myArrayList.add(50);
        myArrayList.add(7);
        myArrayList.add(9);

        System.out.printf("this is the array: %s\n",myArrayList);
        System.out.println("This is the avg: "+ myArrayList.getAverage());
        System.out.println("This is the size: "+myArrayList.size());
        System.out.println("This is the elem at index 3: "+ myArrayList.get(3));
        System.out.println("This is the array of indices of numbers found: "+ myArrayList.find(7));
        System.out.println("This is the smallest: "+ myArrayList.getSmallest());
        System.out.println("This is the largest: "+ myArrayList.getLargest());


    }
}
