package beecrowd1003;

import java.util.Locale;
import java.util.Scanner;

public class main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
    }
}
