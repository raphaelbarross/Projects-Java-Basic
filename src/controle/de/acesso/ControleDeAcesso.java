package controle.de.acesso;

import java.util.Scanner;

public class ControleDeAcesso {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int tipo_usuario, dia_semana, turno;

        System.out.print("Tipo de usuario: 1-administrador 2-funcionario, 3-visitante: ");
        tipo_usuario = leitor.nextInt();

        System.out.print("Dia de semana: 1-domingo 2-segunda ... 7-sabado: ");
        dia_semana = leitor.nextInt();

        System.out.print("Turno do dia: 1-manha 2-tarde 3-noite: ");
        turno = leitor.nextInt();

        switch (tipo_usuario) {
            case 1:
                switch (turno) {
                    case 1:
                        System.out.print("Acesso total ao sistema e relatorios");
                        break;
                    case 2:
                        System.out.print("Acesso total ao sistema");
                        break;
                    case 3:
                        System.out.print("Acesso limitado ao sistema");
                        break;
                    default:
                        System.out.printf("invalido");
                        break;

                } break;
            case 2:
                if (dia_semana > 1 && dia_semana <= 5) {
                    switch (turno) {
                        case 1:
                            System.out.print("Registro de ponto e leitura de tarefas");
                            break;
                        case 2:
                            System.out.print("Execucao de tarefas");
                            break;
                        case 3:
                            System.out.print("Acesso Negado.");
                            break;
                        default:
                            System.out.printf("invalido");
                            break;

                    }
                } else {
                    System.out.printf("Acesso invalido");
                }
                break;

            case 3:
                if (dia_semana == 6 || dia_semana == 7) {
                    switch (turno) {
                        case 1:
                            System.out.printf("Modo visitante");
                            break;
                        case 2:
                            System.out.printf("Modo visitante");
                            break;
                        case 3:
                            System.out.printf("Acesso Negado.");
                            break;
                        default:
                            System.out.printf("invalido");

                    }

                } else {
                    System.out.printf("Dia de semana invalido");
                }
                break;
            default:
                System.out.println("Opção inválida");


        }
        leitor.close();


    }
}
