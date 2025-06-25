package lesson7;
import java.util.InputMismatchException;
import java.util.Scanner;


public class lesson7Task1 {

    public static void main(String[] args) {
        getInt();

    }

    public static int getInt() {

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();

        try {
            System.out.println(a);
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не целое число");
        }
        finally {
            scr.close();
            }

        return a;
        }
    }