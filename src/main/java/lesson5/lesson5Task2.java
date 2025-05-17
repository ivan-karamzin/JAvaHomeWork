package lesson5;

public class lesson5Task2 {
    public static void main(String[] args) {
        q1();
    }


    // Таблица умножения
    public static void q1() {
        int[] MULTIPLICATION_TABLE = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int one = 1;

        for (int l = 0; l < 10; l++) {
        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                System.out.println(one * (MULTIPLICATION_TABLE[i]) + " ");
                one++;
                break;
            }
            System.out.print(one * (MULTIPLICATION_TABLE[i]) + " ");
            }
        }

//        for (int j = 0; j < 10; j++) {
//            if (j == 9) {
//                System.out.println(one * (MULTIPLICATION_TABLE[j]) + " ");
//                one++;
//                break;
//            }
//            System.out.print(one * (MULTIPLICATION_TABLE[j]) + " ");
//        }
//
//        for (int w = 0; w < 10; w++) {
//            if (w == 9) {
//                System.out.println(one * (MULTIPLICATION_TABLE[w]) + " ");
//                one++;
//                break;
//            }
//            System.out.print(one * (MULTIPLICATION_TABLE[w]) + " ");
//        }
//
//        for (int q = 0; q < 10; q++) {
//            if (q == 9) {
//                System.out.println(one * (MULTIPLICATION_TABLE[q]) + " ");
//                one++;
//                break;
//            }
//            System.out.print(one * (MULTIPLICATION_TABLE[q]) + " ");
//        }
//
//        for (int s = 0; s < 10; s++) {
//            if (s == 9) {
//                System.out.println(one * (MULTIPLICATION_TABLE[s]) + " ");
//                one++;
//                break;
//            }
//            System.out.print(one * (MULTIPLICATION_TABLE[s]) + " ");
//        }
//
//        for (int c = 0; c < 10; c++) {
//            if (c == 9) {
//                System.out.println(one * (MULTIPLICATION_TABLE[c]) + " ");
//                one++;
//                break;
//            }
//            System.out.print(one * (MULTIPLICATION_TABLE[c]) + " ");
//        }
//
//        for (int n = 0; n < 10; n++) {
//            if (n == 9) {
//                System.out.println(one * (MULTIPLICATION_TABLE[n]) + " ");
//                one++;
//                break;
//            }
//            System.out.print(one * (MULTIPLICATION_TABLE[n]) + " ");
//        }
//
//        for (int g = 0; g < 10; g++) {
//            if (g == 9) {
//                System.out.println(one * (MULTIPLICATION_TABLE[g]) + " ");
//                one++;
//                break;
//            }
//            System.out.print(one * (MULTIPLICATION_TABLE[g]) + " ");
//        }
//
//        for (int k = 0; k < 10; k++) {
//            if (k == 9) {
//                System.out.println(one * (MULTIPLICATION_TABLE[k]) + " ");
//                one++;
//                break;
//            }
//            System.out.print(one * (MULTIPLICATION_TABLE[k]) + " ");
//        }
//
//        for (int y = 0; y < 10; y++) {
//            if (y == 9) {
//                System.out.println(one * (MULTIPLICATION_TABLE[y]) + " ");
//                one++;
//                break;
//            }
//            System.out.print(one * (MULTIPLICATION_TABLE[y]) + " ");
//        }
    }
}