
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        int matrizA[][] = {{5,7,9},{2,5,3},{8,1,9}};
        int matrizB[][] = {{6,8,0},{4,8,7},{6,4,7}};

        for (int i=0; i<matrizA.length; i++) {
            for (int j=0; j<matrizA[i].length; j++) {
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println();
        }

        System.out.println();

        for (int i=0; i<matrizB.length; i++) {
            for (int j=0; j<matrizB[i].length; j++) {
                System.out.print("[" + matrizB[i][j] + "]");
            }
            System.out.println();
        }

        int suma[][] = new int[matrizA.length][matrizB.length];

        for (int i=0; i<suma.length; i++) {
            for (int j=0; j<suma[i].length; j++) {
                suma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println();

        for (int i=0; i<suma.length; i++) {
            for (int j=0; j<suma[i].length; j++) {
                System.out.print("[" + suma[i][j] + "]");
            }
            System.out.println();
        }
    }
}
