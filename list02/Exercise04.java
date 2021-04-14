import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int horaInicio, horaFim;

        horaInicio = scanner.nextInt();
        horaFim = scanner.nextInt();
        int tempoDur;

        if(horaFim > horaInicio) {
            tempoDur = horaFim - horaInicio;
            System.out.println("O JOGO DUROU " + tempoDur + " HORA(S)");
        } else {
            tempoDur = (24 - horaInicio) + horaFim;
            System.out.println("O JOGO DUROU " + tempoDur + " HORA(S)");
        }

        scanner.close();

    }
}
