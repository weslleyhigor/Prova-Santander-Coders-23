import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("Informe a temperatura:");
        Scanner inputTemperatura = new Scanner(System.in);
        double temperatura = inputTemperatura.nextDouble();

        System.out.println("Qual a unidade de origem dessa temperatura? [C, K, F]");
        Scanner inputUnidadeOrigem = new Scanner(System.in);
        String unidadeOrigem = inputUnidadeOrigem.next();

        System.out.println("Qual a unidade de destino dessa temperatura? [C, K, F]");
        Scanner inputUnidadeDestino = new Scanner(System.in);
        String unidadeDestino = inputUnidadeDestino.next();

        double resultado = 0.0;

        if (unidadeOrigem.toUpperCase().equals("C") && unidadeDestino.toUpperCase().equals("K")) {
            resultado = temperatura + 273.15;
        } else if (unidadeOrigem.toUpperCase().equals("C") && unidadeDestino.toUpperCase().equals("F")) {
            resultado = (temperatura * 9 / 5) + 32;
        } else if (unidadeOrigem.toUpperCase().equals("K") && unidadeDestino.toUpperCase().equals("C")) {
            resultado = temperatura - 273.15;
        } else if (unidadeOrigem.toUpperCase().equals("K") && unidadeDestino.toUpperCase().equals("F")) {
            resultado = (temperatura - 273.15) * 9 / 5 + 32;
        } else if (unidadeOrigem.toUpperCase().equals("F") && unidadeDestino.toUpperCase().equals("C")) {
            resultado = (temperatura - 32) * 5 / 9;
        } else if (unidadeOrigem.toUpperCase().equals("F") && unidadeDestino.toUpperCase().equals("K")) {
            resultado = (temperatura - 32) * 5 / 9 + 273.15;
        } else {
            System.out.println("Entrada especificada não é válida.");
            System.exit(0);
        }
        
        System.out.printf("%.2f %s = %.2f %s%n", temperatura, unidadeOrigem.toUpperCase(), resultado, unidadeDestino.toUpperCase());
    }
}
