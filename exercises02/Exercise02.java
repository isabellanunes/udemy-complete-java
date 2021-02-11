import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x;

        x = scan.nextInt();

        if(x >= 0) {
            System.out.println("NAO NEGATIVO    ");
        } else {
            System.out.println("NEGATIVO");
        }
        scan.close();
    }

}
