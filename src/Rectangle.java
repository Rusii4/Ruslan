public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double returnArea() {
        return length * width;
    }

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5, 9);
        Rectangle rectangle2 = new Rectangle(10, 14);


        System.out.println("Площадь прямоугольника с длиной 5 и шириной 9: " + rectangle1.returnArea());
        System.out.println("Площадь прямоугольника с длиной 10 и шириной 14: " + rectangle2.returnArea());
    }
}
