import mock.Localizacao;
import modelo.Cidade;

import java.util.Scanner;

public class Main {
    private Scanner scanner;

    public static void main(String[] args) {

        System.out.println("******** Sistema de Viagem ********");
        System.out.println("***********************************");
        System.out.println();
        Main main = new Main();
        while (true) {
            main.menuViagem();
            main.fecharSistema();
        }

    }

    private void fecharSistema() {
        System.out.println("Deseja finalizar? (S/N)");
        String sair = scanner.nextLine();
        if (sair.equalsIgnoreCase("s")) {
            System.out.println("****** Adeus ******");
            System.exit(0);
        }
    }

    private void menuViagem() {
        scanner = new Scanner(System.in);
        System.out.println("**** Vamos Viajar ****");

        System.out.print("De onde você esta saindo? ");
        String origem = scanner.nextLine();
        Cidade cidadeOrigem = Localizacao.buscarCidade(origem);

        System.out.print("Qual o destino? ");
        String destino = scanner.nextLine();
        Cidade cidadeDestino = Localizacao.buscarCidade(origem);


    }
}