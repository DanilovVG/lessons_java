import java.util.Scanner;

public class UserArray {

    static int[] subArray(int[] array, int value) {
        int e = array.length;
        int[] newar = new int[e+1];
        int l = 0;

        for (int j = 1; j < e+1; j++) {
            newar[j] = array[l];
            l++;
        }
        newar[0]=value;
        return newar;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Разработка миссива. #4)");
        System.out.println("Введите длину массива:");
        int k = in.nextInt();
        System.out.println("Введите значие чисел массива:");
        int[] massive = new int[k];

        int[] newmass = new int[k];
        for (int j = 0; j < k; j++) {
            massive[j] = in.nextInt();
        }
//вторая часть задания
        System.out.println("Введите нулевое значие:");
        int value = in.nextInt();
        newmass = subArray(massive, value);
        int e = newmass.length;
        System.out.print("\n Новый массив ");
        for (int i = 0; i < e; i++) {
            System.out.print(newmass[i]);
        }
    }


}
