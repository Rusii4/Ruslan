public class Average {
    public static void printAverage(int num1, int num2, int num3) {
        int average = (num1 + num2 + num3) / 3;
        System.out.println("Среднее значение: " + average);
    }

    public static void main(String[] args) {

        printAverage(10, 20, 15);
    }

}
