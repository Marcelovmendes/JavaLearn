package exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int number = scanner.nextInt();

        checkEvenOrOdd(number);
        checkPositiveOrNegative(number);

        scanner.close();
    }

    public static void checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("O numero é par");
            return;
        }
        System.out.println("O numero é impar");
    }

    public static void checkPositiveOrNegative(int number) {
        if (number > 0) {
            System.out.println("O número é positivo");
            return;
        }
        if (number < 0) {
            System.out.println("O numero é negativo");
            return;
        }
        System.out.println("O numero é 0");
    }
}
