import java.util.ArrayList;
import java.util.Scanner;

public class SistemaNotasArrayList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList<>();

        System.out.print("Quantas notas deseja inserir: ");
        int quantidade = input.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas.add(input.nextInt());
        }

        int soma = 0;
        int maior = notas.get(0);
        int menor = notas.get(0);

        for (int i = 0; i < notas.size(); i++) {

            int nota = notas.get(i);

            soma += nota;

            if (nota > maior) {
                maior = nota;
            }

            if (nota < menor) {
                menor = nota;
            }
        }

        double media = (double) soma / notas.size();

        System.out.println("\nMédia: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
    }
}