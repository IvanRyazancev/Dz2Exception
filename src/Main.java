import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task1();
        System.out.println("\n");
        task2();
        System.out.println("\n");
        task3();
        System.out.println("\n");
        task4();

    }

    public static float task1() {
        Scanner scanner = new Scanner(System.in);
        float result = 0;

        while (true) {
            System.out.println("Введите дробное число");
            try {
                result = Float.parseFloat(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Дружище, ты меня подвел, но сегодня пятница, и у тебя есть второй шанс");
            }
        }

        System.out.println("Вы ввели число: " + result);
        return result;
    }

    public static void task2() {
        int d = 0;
        int[] intArray = null;
        if (d != 0 && intArray != null) {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } else {
            System.out.println("You did something wrong");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void task3() {
        try {
            int a = 90;
            int b = 3;
            if (b != 0) {
                System.out.println(a / b);
            }
            printSum(23, 234);
            int[] abc = { 1, 2 };
            if (3 < abc.length) {
                abc[3] = 9;
            }
        } catch (NullPointerException e) {
            System.out.println("Указатель не может указывать на null!");
        }
        catch (Exception e) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите строку");
            String result = scanner.nextLine();
            if (result.isEmpty()) {
                throw new Exception("Нельзя вводить пустую строку");
            }
            System.out.println("Вы ввели строку: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка " + e);
        }
    }
}