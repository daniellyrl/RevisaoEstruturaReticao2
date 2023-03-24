import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double n2 = sc.nextDouble();
        double media = (n1 + n2)/2;
        System.out.println("Sua média é: " + media);

        if (media == 9 && media >= 9){
            System.out.println("Conceito A");
        } else if (media >= 7.5 && media <= 9) {
            System.out.println("Conceito B");
        } else if (media >= 6 && media <= 7.5) {
            System.out.println("Conceito C");
        } else if (media >= 4 && media <=6) {
            System.out.println("Conceito D");
        }else{
            System.out.println("Conceito E");
        }

        System.out.println("Digite seu conceito e confira se foi aprovado ou reprovado");
        String escolha = sc.next();
        switch (escolha){
            case "A":
                System.out.println("Aprovado");
                break;
            case "B":
                System.out.println("Aprovado");
                break;
            case "C":
                System.out.println("Aprovado");
                break;
            case "D":
                System.out.println("Reprovado");
                break;
            case "E":
                System.out.println("Reprovado");
                break;
        }
    }
}
