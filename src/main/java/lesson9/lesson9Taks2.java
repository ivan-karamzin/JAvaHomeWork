package lesson9;

public class lesson9Taks2 {
    public static void main (String[] args) {
    Error er1 = new Error();
    er1.printError();

    Error er2 = new Error(false, 34, "Нет ошибки 34");
    er2.printError();

    Error er3 = new Error(true, 1, "Ошибка 1");
    er3.printError();

    Error er4 = new Error(true, 2, "Ошибка 2");
    er4.printError();
    }

    static class Error {
        boolean active;
        int status;
        String message;

        Error() {
            active = true;
            status = 12;
            message = "Ошибка 12";
        }

        Error(boolean active, int status, String message) {
            this.active = active;
            this.status = status;
            this.message = message;
        }

        void printError() {
            System.out.println(active);
            System.out.println(status);
            System.out.println(message);
            System.out.println();
        }
    }
    }
