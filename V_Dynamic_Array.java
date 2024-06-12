// import java.util.ArrayList;

//Dynamic Array is an Array with a resizable capacity. Also known as ArrayList in Java.
//If the size of the Array reaches the capacity, a new array with the capacity usually 1.5 or 2 with the respect to the original array is created and the elements are copied.
//Inserting and deletion are hard in the middle. Random access of elements is easy. Uses more memory. 

public class V_Dynamic_Array {
    public static void main(String[] args) {
        //ArrayList<String> arrayList = new ArrayList<>(); //The default capacity is set to 10

        //Creating a custom Dynamic Array from scratch

        DynamicArray dynamicArray = new DynamicArray();

        System.out.println(dynamicArray.capacity);

        //Adding elements to the Array
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        //Print the Elements of the Array
        System.out.println(dynamicArray); //No need to explicitly specify dynamicArray.toString()

        //Checking if the Array is empty
        System.out.println(dynamicArray.isEmpty());

        //Checking the size and capacity of the Array
        System.out.println(dynamicArray.size);
        System.out.println(dynamicArray.capacity);


        //Inserting a value at the given index
        dynamicArray.insert(0, "X");
        System.out.println(dynamicArray);

        //Increasing the capcity of the Array
        dynamicArray.add("D");
        System.out.println(dynamicArray);
        dynamicArray.add("E");
        System.out.println(dynamicArray);


        //Shrinking the Arra
        dynamicArray.delete("E");
        dynamicArray.delete("D");
        dynamicArray.delete("B");
        System.out.println(dynamicArray);

    }
}