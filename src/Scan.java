import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Считываем длину стороны квадрата от пользователя
        System.out.print("Введите длину стороны квадрата (a): ");
        double sideLength = scanner.nextDouble();

        // Закрываем Scanner после использования
        scanner.close();

        // Вычисляем площадь квадрата
        double area = sideLength * sideLength;

        // Вычисляем периметр квадрата
        double perimeter = 4 * sideLength;

        // Вычисляем длину диагонали квадрата
        double diagonalLength = Math.sqrt(2) * sideLength;

        // Выводим результаты
        System.out.println("Площадь квадрата: " + area);
        System.out.println("Периметр квадрата: " + perimeter);
        System.out.println("Длина диагонали квадрата: " + diagonalLength);
    }
}
