import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Informe o valor do Empréstimo:");
        Scanner inputValorEmprestimo = new Scanner(System.in);
        double totalSaldoDevedor = inputValorEmprestimo.nextDouble();

        System.out.println();
        System.out.println("Informe a taxa de juros do Empréstimo:");
        Scanner inputTaxaJuros = new Scanner(System.in);
        double taxaJuros = inputTaxaJuros.nextDouble();

        System.out.println();
        System.out.println("Informe o tempo para o pagamento (Em Meses):");
        Scanner inputTempoPagamento = new Scanner(System.in);
        int totalDeMeses = inputTempoPagamento.nextInt();

        double saldoDevedorAtual = totalSaldoDevedor;
        double amortizacao = totalSaldoDevedor / totalDeMeses;
        double totalAmortizacao = 0.0;
        double totalJuros = 0.0;

        System.out.println();
        System.out.printf("Valor fixo da amortização R$ %.2f , Saldo devedor total R$ %.2f com uma taxa de juros de %.1f%% ao mês.\n", amortizacao, totalSaldoDevedor, taxaJuros);

        for (int i = 1; i <= totalDeMeses; i++) {
            
            System.out.println();
            saldoDevedorAtual = saldoDevedorAtual - amortizacao;
            double jurosMensal = saldoDevedorAtual * taxaJuros / 100;
            double parcelaMensal = jurosMensal + amortizacao;

            totalAmortizacao += amortizacao;
            totalJuros += jurosMensal;

            System.out.printf("Parcela %d | Juros: R$ %.2f | Prestação: R$ %.2f | Saldo devedor: R$ %.2f \n", i, jurosMensal, parcelaMensal, saldoDevedorAtual);
        }
        System.out.println();
        System.out.printf("Total: Prestação R$ %.2f , Juros R$ %.2f , Amortização R$ %.2f \n", (totalAmortizacao + totalJuros), totalJuros, totalAmortizacao);
    } 
}