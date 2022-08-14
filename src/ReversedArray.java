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

    static int[] subArray(int[] array, int index, int count) {
        int e = array.length;
        int[] newar = new int[count];
        int l = 0;

        for (int j = index; j < e; j++) {
            newar[l] = array[j];
            l++;
        }
        if (l != count) {
            for (int i = l; i < count; i++) {
                newar[i] = 1;
            }
        }
        return newar;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Разработка миссива. #3 1)");
        System.out.println("Введите длину массива:");
        int k = in.nextInt();
        System.out.println("Введите значие чисел массива:");
        int[] massive = new int[k];
        int[] nooborot = new int[k];
        int[] newmass = new int[k];
        for (int j = 0; j < k; j++) {
            massive[j] = in.nextInt();
        }
//первая часть задания
        System.out.println("Переворачиваем значие чисел массива:");
        for (int i = 0; i < k; i++) {
            System.out.print(massive[i]);
        }
        nooborot = myReverse(massive);
        System.out.print(" <-> ");
        for (int i = 0; i < k; i++) {
            System.out.print(nooborot[i]);
        }
//вторая часть задания
        System.out.println("Вторая часть задания.");
        System.out.println("Введите значие index:");
        int index = in.nextInt();
        System.out.println("Введите значие длину нового массива:");
        int count = in.nextInt();
        newmass = subArray(massive, index, count);
        System.out.print("\n Новый массив ");
        for (int i = 0; i < count; i++) {
            System.out.print(newmass[i]);
        }
    }

}
