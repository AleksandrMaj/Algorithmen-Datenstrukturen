package Testat2;

public class Test {
    public static void main(String[] args) {

        int size = 100; //Size of the array that has to be sorted
        int[] arr = new int[size];

        //Average-Case - uncomment to activate
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + (int) (Math.random() * 100);
        }

        //Best-Case - uncomment to activate
        /*for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }*/

        //Worst-Case - uncomment to activate
        /*for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length-i;
        }*/

        //InsertionSort
        System.out.println("*** InsertionSort ***");
        long start = System.nanoTime();
        Sort.insertionSort(arr);
        System.out.println("Time: " + (System.nanoTime() - start));

        //SelectionSort
        System.out.println("\n*** SelectionSort ***");
        start = System.nanoTime();
        Sort.selectionSort(arr);
        System.out.println("Time: " + (System.nanoTime() - start));

        //BubbleSort
        System.out.println("\n*** BubbleSort ***");
        start = System.nanoTime();
        Sort.bubbleSort(arr);
        System.out.println("Time: " + (System.nanoTime() - start));

        //MergeSort
        System.out.println("\n*** MergeSort ***");
        start = System.nanoTime();
        Sort.mergeSort(arr);
        System.out.println("Time: " + (System.nanoTime() - start));

        //QuickSort
        System.out.println("\n*** QuickSort ***");
        start = System.nanoTime();
        Sort.quickSort(arr,0,arr.length-1);
        System.out.println("Time: " + (System.nanoTime() - start));

    }
}
