import java.util.Scanner;

public class SistemasNotasArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantas notas deseja inserir: ");
        int quantidade = input.nextInt();

        int[] notas = new int[5];



        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = input.nextInt();
        }

        int soma = 0;
        int maior = notas[0];
        int menor = notas[0];

        for (int i = 0; i < quantidade; i++) {

            soma += notas[i];

            if (notas[i] > maior) {
                maior = notas[i];
            }

            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        double media = (double) soma / quantidade;

        System.out.println("\nMédia: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);

    }
}