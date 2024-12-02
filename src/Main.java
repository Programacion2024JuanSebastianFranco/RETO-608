import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;
        int serie;

        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();

        while (num != 0) {

            boolean campana = true;
            int sonar = 0;

            for (int i = 0; i < num; i++) {
                serie = scan.nextInt();

                if (serie <= 4 && campana == true) { // Si un numero de la serie es menor a 4 suena y ya hubo un numero mayor a 6, sonara
                    sonar++;
                    campana = false;
                }

                if (serie > 6) { // Si un numero de la serie es mayor que 6, da paso a poder sonar denuevo
                    campana = true;
                }
            }

            // Imprimir el total de sonidos
            System.out.println(sonar);

            // ultimo valor que se le pedira al usuario
            num = scan.nextInt();
        }


    }
}