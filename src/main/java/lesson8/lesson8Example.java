package lesson8;

public class lesson8Example {
    public static void main (String[] args) {
        System.out.println(example());
    }
    static String example() {

        try {
            int[] mass = {1,2,3};
            mass[4] = 15;
            return "все збс";
        }
        catch (Exception ex) {
            return "сработало исключение";
        }
    }
}
