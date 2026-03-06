package estruturas.de.repeticao;

import java.util.Scanner;

public class MediaWHILE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int notaAluno;
        int somaNotas = 0;
        int contador = 0;

        System.out.print("Digite a nota : ");
        notaAluno = input.nextInt();

        while (notaAluno >= 0) {
            somaNotas += notaAluno;
            contador++;
            System.out.print("Digite a nota : ");
            notaAluno = input.nextInt();






        }
        somaNotas = somaNotas / contador;
        System.out.println("Soma: " + somaNotas);

        if (contador > 0) {
            int media = somaNotas / contador;
            System.out.println("Media: " + media);
        } else {
            System.out.println("Nada");
        }
        }
    }


