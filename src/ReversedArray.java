import java.util.Scanner;

public class ReversedArray {

    static int[] myReverse(int[] array) {
        int e = array.length;
        int temp;
        for (int i = 0; i < e / 2; i++) {
            temp = array[e - i - 1];
            array[e - i - 1] = array[i];
            array[i] = temp;
        }

        return array;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Разработка миссива. #3 1)");
        System.out.println("Введите длину массива:");
        int k = in.nextInt();
        System.out.println("Введите значие чисел массива:");
        int[] massive = new int[k];
        int[] nooborot = new int[k];
        for (int j = 0; j < k; j++) {
            massive[j] = in.nextInt();
        }

        System.out.println("Переворачиваем значие чисел массива:");
        for (int i = 0; i < k; i++) {
            System.out.print(massive[i]);
        }
        nooborot = myReverse(massive);
        System.out.print(" <-> ");
        for (int i = 0; i < k; i++) {
            System.out.print(nooborot[i]);
        }

    }
}
