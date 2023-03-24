import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para saber qual é o dia da semana (1-7): ");
        int escolha = sc.nextInt();
        switch (escolha){
            case 1:
                System.out.println("É domingo");
                break;
            case 2:
                System.out.println("É segunda");
                break;
            case 3:
                System.out.println("É terça");
                break;
            case 4:
                System.out.println("É quarta");
                break;
            case 5:
                System.out.println("É quinta");
                break;
            case 6:
                System.out.println("É sexta");
                break;
            case 7:
                System.out.println("É sábado");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
}
