package revisaoPoo;

import revisaoPoo.operacoes.Soma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int operacao;
        double number; double number2; double resultado;

        do {

            System.out.println("""
                    Calculadora de terminal - Flag -1\s
                    1. Soma           | 2. Subtracao\s
                    3. Multiplicacao  | 4. Divisao\s
                    Digite a opcao:
                    """);

            operacao = input.nextInt();

            if (operacao != -1) {

                System.out.println("Digite o primeiro numero: ");
                number = input.nextDouble();
                System.out.println("Digite o segundo numero: ");
                number2 = input.nextDouble();

                switch (operacao) {
                    case 1: {
                        Soma soma = new Soma();
                        resultado = soma.calcular(number, number2);
                        System.out.println(resultado);
                        break;
                    } case 2: {
                        resultado = number - number2;
                        System.out.println(resultado);
                        break;
                    } case 3: {
                        resultado = number * number2;
                        System.out.println(resultado);
                        break;
                    } case 4: {
                        resultado = number / number2;
                        System.out.println(resultado);
                        break;
                    }
                }
            }

        } while (operacao != -1);
    }
}
