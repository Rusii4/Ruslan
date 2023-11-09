public class HW52 {
    public static void main(String args[]) {
        // task 4
        int l = 518631;
        while (l > 0) {
            int f = l % 10;
            System.out.print(f);
            l = l / 10;
        }
        // task 5
        System.out.println();
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
        //task 6
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        String s = "";
        for (int i = 0; i < 5; i++) {
            s += "*";
            System.out.println(s);
        }

        String t = "";
        for (int i = 1; i <= 5; i++) {
            if (i == 1) t = t + i;
            else t = i + t + i;

            for (int j = 5 - i; j > 0; j--) {

                System.out.print("  ");

            }
            System.out.println(t);
        }

        //task 7
        int a = 1;
        int b = 6;
        int c = 0;
        for (int i = a; i <= b; i++) {
            c = c + i;
        }
        System.out.println(c);

        // task 8
        double salary = 25000;
        char value = 'C';
        if (value == 'A') {
            salary = salary * 1.5;
        }
        if (value == 'B') {
            salary = salary * 1.25;
        }
        System.out.println(salary);

        //task 9
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i <= 6; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();


    }
}


