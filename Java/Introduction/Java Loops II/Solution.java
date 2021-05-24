import java.util.Scanner;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int cal = a;
            for (int j = 0; j < n; j++) {
                cal += (int) Math.pow(2, j) * b;
                System.out.print(cal + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
