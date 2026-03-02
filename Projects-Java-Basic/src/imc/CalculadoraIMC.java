import java.util.Scanner;
import java.util.Locale; // Importado para aceitar ponto no lugar de vírgula

public class CalculadoraIMC {
    public static void main(String[] args) {

        // Define o padrão para aceitar números com ponto (ex: 1.75)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (metros): ");
        double altura = scanner.nextDouble();

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        // Formata a saída do IMC para 2 casas decimais
        System.out.printf("Seu IMC é: %.2f\n", imc);

        // Correção das mensagens de classificação
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

        scanner.close(); // Boa prática: fechar o scanner
    }
}