import model.PowerOfTwoMaxHeap;

public class Main {

    public static void main(String[] args) {

        // test case
        PowerOfTwoMaxHeap<Integer> heap = new PowerOfTwoMaxHeap<Integer>(3);
        heap.insert(10);
        heap.insert(50);
        heap.insert(3);
        heap.insert(200);
        heap.insert(100);

        heap.printHeap();
        System.out.println(heap.popMax());
        System.out.println(heap.popMax());
        System.out.println(heap.popMax());
        heap.printHeap();
    }
}
