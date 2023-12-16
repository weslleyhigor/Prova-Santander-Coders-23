import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.print("Digite um número inteiro: ");
        Scanner inputNumero = new Scanner(System.in);
        int numero = inputNumero.nextInt();

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (numero - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
