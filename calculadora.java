import java.util.Locale;
import java.util.Scanner;

public class CalculadorPremiun {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numero1 = 0;
        double numero2 = 0;

        System.out.print("Selecione qualquer quantidade de credito: ");
        int credito = sc.nextInt();

        for (int i = 0; i < credito; i++ ) {
            System.out.println("----------------------------");
            System.out.println("     CALCULADORA MASTER     ");
            System.out.println("----------------------------");
            System.out.println("[1] - Somar        ");
            System.out.println("[2] - Subtrair     ");
            System.out.println("[3] - Multiplicação");
            System.out.println("[4] - Divisão      ");
            System.out.println("[5] - Potenciação  ");
            System.out.println("[6] - Raiz Quadrada");
            System.out.println("[7] - Resto        ");
        int opcao = sc.nextInt();


        double calculo;
        if (opcao == 1) {
            System.out.print("Digite o primeiro numero: ");
            numero1 = sc.nextDouble();
            System.out.print("Digite o segundo numero: ");
            numero2 = sc.nextDouble();

            calculo = numero1 + numero2;
            System.out.println(calculo);
        }
        else if (opcao == 2) {
            System.out.print("Digite o primeiro numero: ");
            numero1 = sc.nextDouble();
            System.out.print("Digite o segundo numero: ");
            numero2 = sc.nextDouble();

            calculo = numero1 - numero2;
            System.out.println(calculo);
        }
        else if (opcao == 3) {
            System.out.print("Digite o primeiro numero: ");
            numero1 = sc.nextDouble();
            System.out.print("Digite o segundo numero: ");
            numero2 = sc.nextDouble();

            calculo = numero1 * numero2;
            System.out.println(calculo);
        }
        else if (opcao == 4) {
            System.out.print("Digite o primeiro numero: ");
            numero1 = sc.nextDouble();
            System.out.print("Digite o segundo numero: ");
            numero2 = sc.nextDouble();

            calculo = numero1 / numero2;
            System.out.println(calculo);
        }
        else if (opcao == 5) {
            System.out.print("Digite o expoente: ");
            double numero = sc.nextDouble();
            System.out.print("Digite o Multiplicador: ");
            double multiplicador = sc.nextDouble();

            calculo = Math.pow(numero, multiplicador);
            System.out.println(calculo);
        }
        else if (opcao == 6) {
            System.out.print("Digite o primeiro numero: ");
            numero1 = sc.nextDouble();

            calculo = Math.sqrt(numero1);
            System.out.println(calculo);
        }
        else if (opcao == 7) {
            System.out.print("Digite o primeiro numero: ");
            numero1 = sc.nextDouble();
            System.out.print("Digite o segundo numero: ");
            numero2 = sc.nextDouble();

            calculo = numero1 % numero2;
            System.out.println(calculo);
        }
        else {
            System.out.println("OPÇÃO INVALIDA");
        }

    }
        sc.close();
    }
}
