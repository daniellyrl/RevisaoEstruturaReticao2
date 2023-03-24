import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da sua hora trabalho, para calcularmos seu sálario bruto: ");
        double valorhora = sc.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas no mês, para calcularmos seu sálario bruto: ");
        int quantidadehora = sc.nextInt();
        double salariobruto = (valorhora * quantidadehora);
        System.out.println("O seu sálario é: " + salariobruto);

        if (salariobruto <= 900){
            System.out.println("Isento");
        } else if (salariobruto >= 900 && salariobruto <= 1500){
            double descontoir = (salariobruto * 0.95);
            System.out.println("Desconto de 5% \n" +
                    "Com seu desconto de imposto de renda, seu sálario ficou: " + descontoir);
        } else if (salariobruto >= 1500 && salariobruto <= 2500) {
            double descontoir = (salariobruto * 0.9);
            System.out.println("Desconto de 10% \n" +
                    "Com seu desconto de imposto de renda, seu sálario ficou: " + descontoir);

            double descontofgts = (descontoir * 0.89);
            System.out.println("Desconto do fgts o sálario fica: " + descontofgts);

            double descontoinss = (descontofgts * 0.90);
            System.out.println("Desconto do inss o sálario fica: " + descontoinss);

            double totaldescontos = (descontoir + descontoinss);
            double salarioliquido = (totaldescontos - salariobruto);
            System.out.println("Seu sálario liquido após os descontos foi: " + salarioliquido);
        } else {
            double descontoir = (salariobruto * 0.8);
            System.out.println("Desconto de 20% \n" +
                    "Com seu desconto de imposto de renda, seu sálario ficou: " + descontoir);

            double descontofgts = (descontoir * 0.89);
            System.out.println("Desconto do fgts o sálario fica: " + descontofgts);

            double descontoinss = (descontoir * 0.90);
            System.out.println("Desconto do inss o sálario fica: " + descontoinss);

            double totaldescontos = (descontoir + descontoinss);
            double salarioliquido = (totaldescontos - salariobruto);
            System.out.println("Seu sálario liquido após os descontos foi: " + salarioliquido);
        }

    }
}
