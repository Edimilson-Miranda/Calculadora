import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int escolha;
        double resultado = 0;

       do {
           System.out.println("---------------------------");
           System.out.println("Calculadora");
           System.out.println("--------------------------");
           System.out.println("1 - Somar");
           System.out.println("2 - Subtrair");
           System.out.println("3 - Multiplicar");
           System.out.println("4 - Dividir");
           System.out.println("0 - Sair");

           System.out.print("Digite sua escolha: ");
           escolha = sc.nextInt();

           System.out.println("Digite seu primeiro número: ");
           double numero1 = sc.nextDouble();

           System.out.println("Digite seu segundo número: ");
           double numero2 = sc.nextDouble();


            switch (escolha) {
                case 1 -> resultado = numero1+numero2;
                case 2 ->  resultado = numero1-numero2;
                case 3 ->  resultado = numero1*numero2;
                case 4 ->  resultado = numero1/numero2;
                case 0 -> System.out.println("Saindo........");
                default -> System.out.println("Opção inválida!");
            }

           System.out.println("--------------------------");
           System.out.println(resultado);

       }while (escolha != 0);
        sc.close();
    }
}