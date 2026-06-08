package beecrowd1004;

import java.util.Scanner;

public class main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int PROD = v1 * v2;
        System.out.println("PROD = " + PROD);

        sc.close();
    }
}
