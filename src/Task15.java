import java.util.Scanner;

public class Task15 {

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.printf("Введите %d-е число: ", (i + 1));
            int enteredNumber = scan.nextInt();
            array[i] = enteredNumber;
        }
        bubbleSort(array);
        System.out.println("Отсортированный массив: ");
        for (int i : array) {
            System.out.println(i);
        }
        scan.close();
    }
}