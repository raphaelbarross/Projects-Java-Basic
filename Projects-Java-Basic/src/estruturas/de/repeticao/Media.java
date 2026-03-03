package estruturas.de.repeticao;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNotas;
        float soma = 0;

        System.out.print("Quantas notas voce quer calcular? : ");
        int notas = sc.nextInt();

        for (int i = 1; i <= notas; i++) {

            System.out.printf("Digite o nota do aluno: ");
            float notaIndividual = sc.nextFloat();
            soma += notaIndividual;

        }
        float media = soma / notas;
        System.out.printf("A média final das %d notas é: %.2f/ ", notas, media);

        if (media >= 9) {
            System.out.println("A+++++++");
        } else if (media >= 7) {
            System.out.println("Boa Média");
        } else if (media >= 6) {
            System.out.println("Da para melhorar");
        } else {
            System.out.println("Reprovado");
        }



    }
}


