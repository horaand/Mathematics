package Mathematics;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 8;
        int sum = num1 + num2;
        System.out.println(num1 + num2 + " = " + sum);

        //or
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die erste Zahl ein: ");

        int x = scanner.nextInt();

        System.out.println("Bitte geben Sie die zweite Zahl ein: ");
        
        int y = scanner.nextInt();

        int z = x + y;

        System.out.println(x + " + " + y + " = " + z);
    }
}
