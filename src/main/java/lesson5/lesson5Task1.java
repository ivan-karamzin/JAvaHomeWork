package lesson5;

public class lesson5Task1 {
    public static void main(String[] args) {
        q1();
        q2();
        q3();
    }


    // Найти большее число в массиве
    public static void q1 () {
        int [] mass = {1, -12, 22, 15, 14, -3, 63, 326, 16};
        int maxValue = mass[0];

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > maxValue) {
                maxValue = mass[i];
            }
        }
        System.out.println(maxValue);
    }

    // Найти меньшее число в массиве
    public static void q2 () {
        int [] mass = {1, -12, 22, 15, 14, -3, 63, 326, 16};
        int minValue = mass[0];

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < minValue) {
                minValue = mass[i];
            }
        }
        System.out.println(minValue);
    }

    // Разница между самым меньшим и большим числом
    public static void q3 () {
        int [] mass = {1, -12, 22, 15, 14, -3, 63, 326, 16};
        int minValue = mass[0];

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < minValue) {
                minValue = mass[i];
            }
        };

        int maxValue = mass[0];

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > maxValue) {
                maxValue = mass[i];
            }
        }

        if (minValue < 0) {
            System.out.println(maxValue + minValue);
        } else {
            System.out.println(maxValue - minValue);
        }
    }
}