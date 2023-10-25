package ddd;

import java.util.List;
import java.util.Scanner;

public class FrontScores {
    private GerenciadorScores gerenciador;
    private Scanner scanner;

    public FrontScores(GerenciadorScores gerenciador) {
        this.gerenciador = gerenciador;
        this.scanner = new Scanner(System.in);
    }

    public void dialogar() {
        while (true) {
            menu();
            int escolha = scanner.nextInt();
            scanner.nextLine();  
            switch (escolha) {
                case 1:
                    adicionarScore();
                    break;
                case 2:
                    listarScores();
                    break;
                case 3:
                    System.out.println("Saindo do programa.");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void menu() {
        System.out.println("# Menu principal:");
        System.out.println("(1) Adicionar score");
        System.out.println("(2) Listar scores");
        System.out.println("(3) Sair");
        System.out.print("# Escolha uma opção: ");
    }

    private void adicionarScore() {
        System.out.print("Digite o nome do jogador: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a pontuação: ");
        int pontuacao = scanner.nextInt();
        scanner.nextLine();  

        Score score = new Score(nome, pontuacao);
        gerenciador.adicionar(score);
        System.out.println("Score Adicionado!");
    }

    private void listarScores() {
        List<Score> scores = gerenciador.consultar();
        if (scores.isEmpty()) {
            System.out.println("Nenhum score encontrado.");
        } else {
            System.out.println("Scores:");
            for (Score score : scores) {
                System.out.println(score);
            }
        }
    }
}