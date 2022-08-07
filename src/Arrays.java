import java.util.Scanner;

public class Arrays {

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
        System.out.println("Разработка миссива. #5");
        System.out.println("Введите 10 значий чисел массива:");
        int[] massive = new int[10];
        int[] nooborot = new int[10];
        for (int j = 0; j < 10; j++) {
            massive[j] = in.nextInt();
        }
        System.out.println("Переворачиваем значие чисел массива:");
        for (int i = 0; i < 10; i++) {
            System.out.print(massive[i]);
        }
        nooborot = myReverse(massive);
        System.out.print(" <-> ");
        for (int i = 0; i < 10; i++) {
            System.out.print(nooborot[i]);
        }
    }
}
