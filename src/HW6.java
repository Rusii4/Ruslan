public class HW6 {
    public static void main(String args[]) {
        //task 1
        double a = 0;
        int[] Integers = {1, 4, 7, 4};
        for (int i = 0; i < Integers.length; i++) {
            a = a + Integers[i];
        }
        a = a / Integers.length;
        System.out.println(a);

        //task 2
        int[] Integers2 = {1, 3, 3, 1, 8, 8, 7};
        for (int i = 0; i < Integers2.length; i++) {
            for (int j = 1 + i; j < Integers2.length; j++) {
                if (Integers2[i] == Integers2[j]) {
                    System.out.print(Integers2[i] + " ");
                }
            }
        }
        System.out.println();

        //task 3.1
        boolean contain = false;
        int x = 23;
        int[] Integers3 = {1, 3, -6, 23, 14, 2};
        for (int i = 0; i < Integers3.length; i++) {
            if (Integers3[i] == x) {
                contain = true;
            }

        }
        System.out.println(contain);
        //task 3.2
        x = 0;
        contain = false;
        for (int i = 0; i < Integers3.length; i++) {
            if (Integers3[i] == x) {
                contain = true;
            }

        }
        System.out.println(contain);
        //task 4.1
        x = 23;
        for (int i = 0; i < Integers3.length; i++) {
            if (Integers3[i] == x) {
                System.out.println(i);
            }
        }
        x = 5;
        for (int i = 0; i < Integers3.length; i++) {
            if (Integers3[i] == x) {
                System.out.println(i);
            } else System.out.println("Не найдено");
            break;
        }

        //task 5.1
        int[] g = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
        int n = 3;
        int m = 8;
        for (int i = n; i <= m; i++) {
            System.out.print(g[i] + " ");
        }
        System.out.println();

        // task 5.2
        n = 1;
        m = 3;
        int[] f = {1, 3, -6, 23, 14, 2};
        for (int i = n; i <= m; i++) {
            System.out.print(f[i] + " ");
        }
        System.out.println();

        // task 6
        int[] array = {1, 3, -6, 23, 14, 2};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                if (min > array[i]) {
                    min = array[i];
                }


            }


        }
        System.out.println("min = " + min + " " + "max = " + max);

        //task 7
        min = array[0];
        int min2 = min;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min2 = min;
                min = array[i];

            }


        }
        System.out.println(min + " " + min2);

        //task 8
        int[] arr = {1, 2, 3, 0, 4, 6};
        int k = -1;
        String result = "";
        for (int j = 0; j < arr.length; j++) {
            max = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 0 && max < arr[i]) {
                    max = arr[i];
                    k = i;
                }
            }
            if (k >= 0) {
                arr[k] = -1;
            }
            result += max;
        }
        System.out.println(result);
    }
}



