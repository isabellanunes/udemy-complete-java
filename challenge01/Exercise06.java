import com.sun.media.sound.SimpleSoundbank;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {

        double a, b, c;

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        double triangle, circle, trapeze, square, rectangle;

        triangle = (a * c)/2;
        circle = 3.14159 * (Math.pow(c, 2));
        trapeze = ((a + b) / 2) * c;
        square = Math.pow(b, 2);
        rectangle = a * b;

        System.out.printf("TRIANGULO: %.3f%n", triangle);
        System.out.printf("CIRCULO: %.3f%n", circle);
        System.out.printf("TRAPEZIO: %.3f%n", trapeze );
        System.out.printf("QUADRADO: %.3f%n", square);
        System.out.printf("RETANGULO: %.3f%n", rectangle);

        scan.close();

    }
}
