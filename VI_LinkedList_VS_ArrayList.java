import java.util.ArrayList;
import java.util.LinkedList;

public class VI_LinkedList_VS_ArrayList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        //LinkedList

        startTime = System.nanoTime();

        // linkedList.get(999999);
        linkedList.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList:\t" + elapsedTime + " ns");

        //ArrayList

        startTime = System.nanoTime();

        // arrayList.get(999999);
        arrayList.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList:\t" + elapsedTime + " ns");
    }
}
