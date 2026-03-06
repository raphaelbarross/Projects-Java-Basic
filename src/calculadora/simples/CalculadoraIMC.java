package calculadora.simples;

import java.util.Scanner;
import java.util.Locale; // Importado para aceitar ponto no lugar de vírgula

public class CalculadoraIMC {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (metros): ");
        double altura = scanner.nextDouble();


        double imc = peso / (altura * altura);


        System.out.printf("Seu IMC é: %.2f\n", imc);


        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Classificação: Obesidade Grau I");
        } else {
            System.out.println("Classificação: Obesidade Grau II ou III");
        }

        scanner.close();
    }
}