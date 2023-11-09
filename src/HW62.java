public class HW62 {
    public static void main(String args[]) {
        //task 9.1
        int[][] arr = {{10, 20, 30}, {40, 50, 60}};
        int[][] res = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                res[j][i] = arr[i][j];

            }
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        //task 9.2
        int[][] arr2 = {{4, 2, 1}, {2, 7, 2}};
        int[][] res2 = new int[arr2[0].length][arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                res2[j][i] = arr2[i][j];

            }
        }
        for (int i = 0; i < res2.length; i++) {
            for (int j = 0; j < res2[0].length; j++) {
                System.out.print(res2[i][j] + " ");
            }
            System.out.println();

        }
        // task 10
        int[][] arr3 = {{10, 20, 30}, {40, 50, 60}};
        int x = 0;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[0].length; j++) {
                x = x + arr[i][j];

            }
        }
        System.out.println(x);
        // task 11.1
        int[][] arr4 = {{10, 20, 30}, {40, 50, 60}};
        if (arr4.length == arr4[0].length)
            System.out.println(true);
        else {
            System.out.println(false);
        }
        //task 11.2
        int[][] arr5 = {{10, 20}, {40, 50}};
        if (arr5.length == arr5[0].length)
            System.out.println(true);
        else {
            System.out.println(false);
        }

        //task 12
        int n = 5;
        int[][] arr6 = new int[n][n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr6[i - 1][j - 1] = i * j;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr6[i][j]);
            }
            System.out.println();
        }
        //task 13
        int[][] arr7 = {{10, 20, 30}, {40, 50, 60}};
        int max = arr7[0][0];
        int min = arr7[0][0];
        for (int i = 0; i < arr7.length; i++) {
            for (int j = 0; j < arr7[i].length; j++) {
                if (max < arr7[i][j]) {
                    max = arr7[i][j];
                }
                if (min > arr7[i][j]) {
                    min = arr7[i][j];

                }
            }
        }
        System.out.println(max + " " + min);
        //task 1
        int[][] arr8 = {{10, 20, 30}, {40, 50, 60}};
        int y = 20;
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr8.length; i++) {
            for (int j = 0; j < arr8[i].length; j++) {
                if (y == arr8[i][j]) ;
                a = i;
                b = j;
            }
        }
        System.out.println(a + " " + b);
        //task 2
        int[][] arr9 = {{10, 20, 30}, {40, 50, 60}};
        int m = 0;
        int k = 0;
        for (int i = 0; i < arr9.length; i++) {
            for (int j = 0; j < arr9[i].length; j++) {


            }
        }
        System.out.println(m/3+" "+ k/3);
    }
}









