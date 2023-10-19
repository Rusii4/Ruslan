public class HW5 {
    public static void main(String args[]) {
        int a = 10;
        int b = 6;
        if (a == b) {
            System.out.println("квадрат");
        } else {
            System.out.println("прямоугольник");
        }

        int price = 4000;
        int n = 5000;
        if (price > n) {
            double nprice = price * 0.9;
            System.out.println(nprice + " со скидкой");
        } else {
            System.out.println(price + " без");
        }

        int grade = 26;
        if (grade > 80) {
            System.out.println("A");
        }
        if (grade > 60 && grade <= 80) {
            System.out.println("B");
        }
        if (grade > 50 && grade <= 60) {
            System.out.println("C");
        }
        if (grade > 45 && grade <= 50) {
            System.out.println("D");
        }
        if (grade > 25 && grade <= 45) {
            System.out.println("E");
        }
        if (grade <= 25) {
            System.out.println("F");
        }

        int l = 518631;
        while (l > 0) {
            int f = l % 10;
            System.out.print(f);
            l = l / 10;
        }
        System.out.println(" ");

        int с = 17;
        boolean prostoe = true;
        for (int i = 2; i < с; i++) {

            if (с % i == 0) {
                prostoe = false;
                System.out.println("непростое");
                break;
            }
        }
        if (prostoe) {
            System.out.println("простое");
        }
        int r = 0;
        if (r % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("неч");
        }
        int u = 18;
        int s = 20;
        if (u > s) {
            System.out.println(u + " больше " + s);
        } else {
            System.out.println(s + " больше " + u);
        }
        int god = 1612;
        if ((god % 400 == 0) || (god % 4 == 0 && god % 100 != 0)) {
            System.out.println("366");
        } else System.out.println("365");
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
        }
        int x = 6;
        int y = 4;
        if (x > 0 && y > 0) {
            System.out.println("1 четверть");
        } else if (x < 0 && y > 0) {
            System.out.println("2 четверть");
        } else if (x < 0 && y < 0) {
            System.out.println("3 четверть");
        } else if (x > 0 && y < 0) {
            System.out.println("4 четверть");
        }
        int v = 8;
        int h = 4;
        int o = 3;
        if (v == h && v == o ) {
            System.out.println("Равностороний");
        }
        else if (v == h || h == o || o == v){
            System.out.println("Равнобедренный");
        }else System.out.println("Разносторонний");
    }
}




