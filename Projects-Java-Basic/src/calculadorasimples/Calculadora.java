package calculadorasimples;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segunda número: ");
        int n2 = sc.nextInt();

        System.out.println("Escolha a operação: +, -, *, /");
        char op = sc.next().charAt(0);

        double resultado;

        if (op == '+') {
            resultado = n1 + n2;
        } else if (op == '-') {
            resultado = n1 - n2;
        } else if (op == '*') {
            resultado = n1 * n2;
        } else if (op == '/') {
            if (n2 != 0) {
                resultado = n1 / n2;
            } else {
                System.out.println("Erro: divisão por zero!");
                sc.close();
                return;
            }
        } else {
            System.out.println("Operação inválida!");
            sc.close();
            return;
        }

        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
