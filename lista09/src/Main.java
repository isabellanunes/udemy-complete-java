import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int m = scanner.nextInt();
    int n = scanner.nextInt();
    int[][] mat = new int[m][n];

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        mat[i][j] = scanner.nextInt();
      }
    }

    int o = scanner.nextInt();

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        if(mat[i][j] == o) {
          System.out.println("Position " + i + "," + j);

          if (j > 0) {
            System.out.println("Esquerda: " + mat[i][j - 1]);
          }

          if (i > 0) {
            System.out.println("Acima: " + mat[i - 1][j]);
          }

          if (j < mat[i].length - 1) {
            System.out.println("Right: " + mat[i][j + 1]);
          }

          if (i < mat.length - 1) {
            System.out.println("Abaixo: " + mat[i + 1][j]);
          }

        }
      }
    }
    

    
  }
}
