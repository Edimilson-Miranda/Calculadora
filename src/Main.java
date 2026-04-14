import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;

       do {
           escolha = mostraMenu(sc);

           if (escolha == 0) {
               System.out.println("Saindo...........");
               break;
           }

           if (!opcaoValida(escolha)) {
               System.out.println("Opcao invalida");
               continue;
           }

           System.out.println("Digite seu primeiro número: ");
           double numero1 = sc.nextDouble();

           System.out.println("Digite seu segundo número: ");
           double numero2 = sc.nextDouble();

           double resultado = calcular(escolha, numero1, numero2);
           System.out.println("-------------------------");
           System.out.println("Resultado: " + resultado);


       }while (true);
        sc.close();
    }
    static int mostraMenu (Scanner sc) {
        System.out.println("---------------------------");
        System.out.println("Calculadora");
        System.out.println("--------------------------");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("0 - Sair");

        System.out.print("Digite sua escolha: ");
        return sc.nextInt();
    }
    static double calcular(int escolha, double numero1, double numero2) {
        switch (escolha) {
            case 1: return numero1+numero2;
            case 2: return numero1-numero2;
            case 3: return numero1*numero2;
            case 4: return numero1/numero2;
            default: return  0;
        }
    }
    static boolean opcaoValida(int escolha) {
        return escolha >= 1 && escolha <= 4;
    }
}