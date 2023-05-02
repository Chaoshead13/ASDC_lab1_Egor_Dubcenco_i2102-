import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        File file = new File(".\\src\\goods_in_the_store.csv");
        ArrayList<Store> storeList = Store.input(file);


        Store storeToBeFoundStart;
        storeToBeFoundStart = Store.createStoreFromString("8,Grape,Seedless Grapes,1.80,45,Kg");
        Store storeToBeFoundMiddle;
        storeToBeFoundMiddle = Store.createStoreFromString("23,Pumpkin,Jack-o'-lantern Pumpkins,4.00,5,Each");
        Store storeToBeFoundEnd;
        storeToBeFoundEnd = Store.createStoreFromString("33,Lemon,Yellow Lemons,0.80,55,Kg");
        int positionOfElement;


        MyTree tree = new MyTree();
        for (Store store : storeList) {
            tree.add(store);
        }

        System.out.println("Tree ----> ");

        long before = System.nanoTime();
        System.out.println("Contains first element==> " + tree.contains(storeToBeFoundStart));
        long after = System.nanoTime();
        System.out.println("Time of search => " + (after - before));

        System.out.println("Linear search ----> ");

        System.out.println();
        positionOfElement = Algorithm.linearSearch(storeList, storeToBeFoundStart);
        System.out.println("Position of the element in the start of the list = " + positionOfElement);
        System.out.println();

        System.out.println();
        positionOfElement = Algorithm.linearSearch(storeList, storeToBeFoundMiddle);
        System.out.println("Position of the element in the middle of the list = " + positionOfElement);
        System.out.println();

        System.out.println();
        positionOfElement = Algorithm.linearSearch(storeList, storeToBeFoundEnd);
        System.out.println("Position of the element in the start of the list = " + positionOfElement);
        System.out.println();


        System.out.println("Binary search ----> ");

        System.out.println();
        positionOfElement = Algorithm.binarySearch(storeList, storeToBeFoundStart);
        System.out.println("Position of the element in the start of the list = " + positionOfElement);
        System.out.println();

        System.out.println();
        positionOfElement = Algorithm.binarySearch(storeList, storeToBeFoundMiddle);
        System.out.println("Position of the element in the middle of the list = " + positionOfElement);
        System.out.println();

        System.out.println();
        positionOfElement = Algorithm.binarySearch(storeList, storeToBeFoundEnd);
        System.out.println("Position of the element in the start of the list = " + positionOfElement);
        System.out.println();


        System.out.println("Interpolation search ----> ");

        System.out.println();
        positionOfElement = Algorithm.interpolationSearch(storeList, storeToBeFoundStart);
        System.out.println("Position of the element in the start of the list = " + positionOfElement);
        System.out.println();

        System.out.println();
        positionOfElement = Algorithm.interpolationSearch(storeList, storeToBeFoundMiddle);
        System.out.println("Position of the element in the middle of the list = " + positionOfElement);
        System.out.println();

        System.out.println();
        positionOfElement = Algorithm.interpolationSearch(storeList, storeToBeFoundEnd);
        System.out.println("Position of the element in the start of the list = " + positionOfElement);
        System.out.println();

        System.out.println("Fibonacci search ----> ");

        System.out.println();
        positionOfElement = Algorithm.fibonacciSearch(storeList, storeToBeFoundStart);
        System.out.println("Position of the element in the start of the list = " + positionOfElement);
        System.out.println();

        System.out.println();
        positionOfElement = Algorithm.fibonacciSearch(storeList, storeToBeFoundMiddle);
        System.out.println("Position of the element in the middle of the list = " + positionOfElement);
        System.out.println();

        System.out.println();
        positionOfElement = Algorithm.fibonacciSearch(storeList, storeToBeFoundEnd);
        System.out.println("Position of the element in the start of the list = " + positionOfElement);
        System.out.println();
    }
}