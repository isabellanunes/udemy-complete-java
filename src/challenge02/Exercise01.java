package challenge02;

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if ((num % 2) == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        scan.close();

    }
}
