import java.util.Scanner;

import static javax.management.Query.or;

class Main{
    public static void Task1() {
        System.out.println("TASK 1");
        System.out.println(" ");
        System.out.print("Input first value: ");
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        System.out.print("Input second value: ");
        float b = scanner.nextFloat();

        System.out.println(" ");
        System.out.println("Value "+ a + " equal to " + b + " - " + (a == b));
        System.out.println("Value "+ a + " less than " + b + " - " + (a < b));
        System.out.println("Value "+ a + " less or equal to " + b + " - " + (a <= b));
        System.out.println("Value "+ a + " greater than " + b + " - " + (a > b));
        System.out.println("Value "+ a + " greater or equal to " + b + " - " + (a >= b));
    }
    public static void Task2() {
        System.out.println("TASK 2");
        System.out.println(" ");
        System.out.print("Input boolean value a: ");
        Scanner scanner = new Scanner(System.in);
        boolean a = scanner.nextBoolean();
        System.out.print("Input boolean value b: ");
        boolean b = scanner.nextBoolean();

        System.out.println(" ");
        System.out.println("Value a equal to b  - " + (a == b));
    }
    public static void Task3() {
        System.out.println("TASK 3");
        System.out.println(" ");
        System.out.print("Input any of whole number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println(" ");
        System.out.println("Did value " + a + " is even: "  + (a%2 == 0));
    }
    public static void Task4() {
        System.out.println("TASK 4");
        System.out.println(" ");
        System.out.print("Input any of whole number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println(" ");
        System.out.println("Did value " + a + " is even: "  + (a%2 != 0));
    }
    public static void Task5() {
        System.out.println("TASK 2");
        System.out.println(" ");
        System.out.print("Input boolean value: ");
        Scanner scanner = new Scanner(System.in);
        boolean a = scanner.nextBoolean();

        System.out.println(" ");
        System.out.println("Value a equal to b - " + (!a));
    }
    public static void Task6() {
        System.out.println("TASK 6");
        System.out.println(" ");
        System.out.print("Input first whole value: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("Input second whole value: ");
        int b = scanner.nextInt();
        if(a == b || (a < 0 && b > 0) || (a > 100 && b > 100)){
            System.out.print(true);
        }
        else
            System.out.print(false);
    }

    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();

    }
}