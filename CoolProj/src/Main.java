import java.util.Scanner;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите целое неотрицательное число: ");
    int number = scanner.nextInt();

    if (number < 0) {
        System.out.println("Ошибка: факториал определен только для неотрицательных чисел.");
    }
    else {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        // Выводим результат
        System.out.println("Факториал числа " + number + " равен: " + factorial);
    }
}

