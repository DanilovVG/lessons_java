import java.util.Scanner;

public class CustomerArray {

    public static void main(String[] args) {
        int temp = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Разработка миссива. #2");
        System.out.println("Введите длину массива:");
        int k = in.nextInt();

        System.out.println("Введите значие чисел массива:");
        int[] massive = new int[k];
        for (int j = 0; j < k; j++) {
            massive[j] = in.nextInt();
        }

        int[] masnig = new int[k];
        double sqr;
        int min = massive[0];
        int max = massive[0];
        int sum = 0;
        for (int i = 0; i < massive.length; i++) {
            sum += massive[i];
            if (massive[i] < 0) {
                masnig[temp++] = massive[i];

            }
            if (min > massive[i]) {
                min = massive[i];
            }
            if (max < massive[i]) {
                max = massive[i];
            }
        }
        sqr = sum / massive.length;
        System.out.println("Самое min число: " + min + ". Самое max число: " + max + ".");
        System.out.println(" Сумма чисел: " + sum + ". Ср.арифм. чисел: " + sqr + ".");
        System.out.println("Нигативые числа: ");
        for (int r = 0; r < temp; r++) {
            System.out.println(masnig[r]);
        }

    }
}
