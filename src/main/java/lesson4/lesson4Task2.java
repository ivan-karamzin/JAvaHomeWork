package lesson4;
import  java.util.Scanner;

public class lesson4Task2 {
    public static void main(String[] args) {
        warZoneParams("Danila", 25);
    }

    public static void warZone() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();

        if (age >= 18 && age <= 30) {
            System.out.println(name + " go to SVO");
        } else {
            System.out.println(name + "sit home");
        }
    }

    public static void warZoneParams(String name, int age) {

        if (age >= 18 && age <= 30) {
            System.out.println(name + " go to army");
        } else {
            System.out.println(name + " sit home");
        }
    }
}
