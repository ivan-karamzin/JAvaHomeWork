package lesson9;

public class lesson9Taks1 {
    public static void main (String[] args) {
        Cat Vasya = new Cat("Вася", "Селедка");

        Vasya.showCat();
        Vasya.setName("Володя");
        Vasya.setFood("Огурец");
        Vasya.showCat();
    }

    static class Cat {
        private String name;
        private String food;

        Cat(String name, String food) {
            this.name = name;
            this.food = food;
        }

        void showCat() {
            System.out.println("Кота зовут: " + name);
            System.out.println(name + " съел: " + food);
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setFood(String food) {
            this.food = food;
        }
    }
    }
