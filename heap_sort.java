import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HeapSort {
    public static void heapSort(int[] arr) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int x : arr) {
            heap.offer(x);
        }

        int i = 0;
        while (!heap.isEmpty()) {
            arr[i++] = heap.poll();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        heapSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
