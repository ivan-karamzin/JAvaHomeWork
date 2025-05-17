package lesson5;

public class lesson5Task3 {
    public static void main(String[] args) {
        q1();
    }


    // Четные нечетные числа в массиве
    public static void q1() {
        int[] massive  = {5, 2, 6, 0, 3, 4};

        for (int l = 0; l < massive.length; l++) {
            if (massive[l] % 2 == 0) {
                System.out.print(massive[l] + " ");
            }
        }

        System.out.println();

        for (int l = 0; l < massive.length; l++) {
            if (massive[l] % 2 == 1) {
                System.out.print(massive[l] + " ");
            }
        }

    }
}