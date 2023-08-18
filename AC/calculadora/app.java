import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{
        Scanner leitor = new Scanner(System.in);
        String operacao;
        double num1 = 0;
        double num2;

        System.out.println("Calculdora");
        System.out.println("Digite o primeiro número:");

        num1 = leitor.nextDouble();

        while (true) {
            System.out.println("Selecione a operação desejada: ");
            System.out.println("Para adição digite (add) / para Subtração (sub) / para Multiplicação (mult) /Divisão (div) / zerar (zerar)/ sair (exit)");
            operacao = leitor.next();

            switch (operacao){
                case "add":
                System.out.println("Adição");
                System.out.println("Informe o segundo número: ");
                num2 = leitor.nextDouble();
                System.out.println(num1 + num2);
                num1 = num1 + num2;
                break;

                case "sub":
                System.out.println("Subtração");
                System.out.println("Informe o segundo número: ");
                num2 = leitor.nextDouble();
                System.out.println(num1 - num2);
                num1 = num1 - num2;
                break;

                case "mult":
                System.out.println("Multiplicação");
                System.out.println("Informe o segundo número: ");
                num2 = leitor.nextDouble();
                System.out.println(num1 * num2);
                num1 = num1 * num2;
                break;

                case "div":
                System.out.println("Divisão");
                System.out.println("Informe o segundo número: ");
                num2 = leitor.nextDouble();
                System.out.println(num1 / num2);
                num1 = num1 / num2;
                break;

                case "zerar":
                System.out.println("Os resultados foram zerados.");
                num1 = 0;
                System.out.println("Digite o primeiro número: ");
                num1 = leitor.nextDouble ();
                break;

                case "exit":
                System.out.println("Calculadora encerrada!");
                leitor.close();
                System.exit(0);
                break;

                default:
                System.out.println("Operação inválida!");
            }

            System.out.println("O resultado é: " + num1);
        }
    }
}

